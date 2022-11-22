package graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DistinctIslands {

	private static void dfs(int[][] grid, boolean[][] visited, int row, int col,int row0,int col0, List<String> distanceList) {
		visited[row][col] = true;
		distanceList.add(toString((row-row0),(col-col0)));

		int[] delRow = { -1, 0, 1, 0 };
		int[] delCol = { 0, -1, 0, 1 };

		for (int i = 0; i < 4; i++) {
			int nRow = row + delRow[i];
			int nCol = col + delCol[i];

			if (nRow >= 0 && nRow < grid.length && nCol >= 0 && nCol < grid[0].length && !visited[nRow][nCol]
					&& grid[nRow][nCol] == 1) {
				distanceList.add(toString((nRow-row),(nCol - col)));
				dfs(grid, visited, nRow, nCol,row0,col0, distanceList);
			}
		}

	}

	private static String toString(int i, int j) {
		return Integer.toString(i)+" - "+Integer.toString(j);
	}

	public static int countDistinctIslands(int[][] grid) {

		int n = grid.length;
		int m = grid[0].length;

		boolean[][] visited = new boolean[n][m];
		Set<List<String>> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (!visited[i][j] && grid[i][j] == 1) {
					List<String> distanceList = new ArrayList<>();
					dfs(grid, visited, i, j,i,j, distanceList);
					set.add(distanceList);
				}
			}
		}

		return set.size();
	}
	
	public static void main(String[] args) {
		int [][] grid = new int[4][5];
		
		grid[0][0] = 1;
		grid[0][1] = 1;
		grid[0][3] = 1;
		grid[0][4] = 1;
		
		grid[1][0] = 1;

		

		grid[2][4] = 1;
		
		grid[3][0] = 1;
		grid[3][1] = 1;
		grid[3][3] = 1;
		grid[3][4] = 1;
		
		System.out.println(countDistinctIslands(grid));
		
	}

}
