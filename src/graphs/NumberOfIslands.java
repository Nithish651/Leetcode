package graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Pair {
	int rowIndex;
	int colIndex;

	public Pair(int rowIndex, int colIndex) {
		this.rowIndex = rowIndex;
		this.colIndex = colIndex;
	}
}

public class NumberOfIslands {

	private static void bfs(char[][] grid, int row, int col, boolean[][] visited) {

		int n = grid.length;
		int m = grid[0].length;

		Queue<Pair> queue = new LinkedList<>();
		queue.add(new Pair(row, col));
		visited[row][col] = true;

		while (!queue.isEmpty()) {
			int currRow = queue.peek().rowIndex;
			int currCol = queue.peek().colIndex;
			queue.poll();

			// traverse and find the neighbors in all 8 directions

			for (int delRow = -1; delRow <= 1; delRow++) {
				for (int delCol = -1; delCol <= 1; delCol++) {
					
					int nRow = currRow + delRow;
					int nCol = currCol + delCol;
					
					if (nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && grid[nRow][nCol] == '1'
							&& !visited[nRow][nCol]) {
						queue.add(new Pair(nRow, nCol));
						visited[nRow][nCol] = true;
					}
				}
			}

		}

	}

	public static int numIslands(char[][] grid) {
		int numberOfIslands = 0;

		int n = grid.length;
		int m = grid[0].length;

		boolean[][] visited = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (!visited[i][j] && grid[i][j] == '1') {
					numberOfIslands++;
					bfs(grid, i, j, visited);
				}
			}
		}

		return numberOfIslands;
	}

	public static void main(String[] args) throws IOException {
		
		char [] [] grid = new char[4][5];
		
		grid[0][0] = '1';
		grid[0][1] = '1';
		grid[0][2] = '0';
		grid[0][3] = '0';
		grid[0][4] = '0';
		
		grid[1][0] = '1';
		grid[1][1] = '1';
		grid[1][2] = '0';
		grid[1][3] = '0';
		grid[1][4] = '0';
		
		grid[2][0] = '0';
		grid[2][1] = '0';
		grid[2][2] = '1';
		grid[2][3] = '0';
		grid[2][4] = '0';
		
		grid[3][0] = '0';
		grid[3][1] = '0';
		grid[3][2] = '0';
		grid[3][3] = '1';
		grid[3][4] = '1';
		
		System.out.println(numIslands(grid));
	
	}
}
