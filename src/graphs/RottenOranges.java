package graphs;

import java.util.LinkedList;
import java.util.Queue;

class RottenOrange {
	int row;
	int column;
	int time;

	public RottenOrange(int row, int col, int time) {
		this.row = row;
		this.column = col;
		this.time = time;
	}
}

public class RottenOranges {

	public static int orangesRotting(int[][] grid) {

		int n = grid.length;
		int m = grid[0].length;
		int freshCount = 0;
		int rottenCount = 0;
		int totalTime = 0;

		int[][] visited = new int[n][m];
		Queue<RottenOrange> queue = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] == 2) {
					queue.add(new RottenOrange(i, j, 0));
					visited[i][j] = 2;
				} else if (grid[i][j] == 1) {
					visited[i][j] = 1;
					freshCount++;
				}
			}
		}

		int[] delRow = { 1, 0, -1, 0 };
		int[] delCol = { 0, 1, 0, -1 };

		while (!queue.isEmpty()) {
			int rIndex = queue.peek().row;
			int colIndex = queue.peek().column;
			int time = queue.peek().time;
			totalTime = time;
			queue.poll();

			for (int i = 0; i < 4; i++) {
				int nRow = rIndex + delRow[i];
				int nCol = colIndex + delCol[i];

				if (nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && visited[nRow][nCol] == 1) {
					visited[nRow][nCol] = 2;
					rottenCount++;
					queue.add(new RottenOrange(nRow, nCol, time + 1));
				}
			}
		}

		return (rottenCount == freshCount) ? totalTime : -1;
	}

	public static void main(String[] args) {
		int [][] grid = new int [3][3];
		
		grid[0][0] = 2;
		grid[0][1] = 1;
		grid[0][2] = 1;
		
		grid[1][0] = 0;
		grid[1][1] = 1;
		grid[1][2] = 1;
		
		grid[2][0] = 1;
		grid[2][1] = 0;
		grid[2][2] = 1;
		
		System.out.println(orangesRotting(grid));
	}

}
