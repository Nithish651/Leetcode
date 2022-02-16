package arrayProblems;

public class IslandPerimeter {

	public static void main(String[] args) {
		int [] [] grid = new int[1][1];
		
		int [] row0 = {1,0};
		//int [] row1 = {1,1,1,0};
		//int [] row2 = {0,1,0,0};
		//int [] row3 = {1,1,0,0};
		
		grid[0] = row0;
		//grid[1] = row1;
		//grid[2] = row2;
		//grid[3] = row3;
		
		System.out.println(islandPerimeter(grid));
	}

	public static  int islandPerimeter(int[][] grid) {

		int perimeter = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if(grid[i][j] == 1)
					perimeter += getPerimeter(i, j, grid);
			}
		}

		return perimeter;
	}

	private static int getPerimeter(int i, int j, int[][] grid) {

		
		int perimeter = 0;

		int left = (j == 0) ? 0 : grid[i][j - 1];
		int right = (j == grid[i].length -1) ? 0 : grid[i][j + 1];
		int top = (i == 0) ? 0 : grid[i - 1][j];
		int bottom = (i == grid.length -1) ? 0 : grid[i + 1][j];

		if (left == 0)
			perimeter += 1;

		if (right == 0)
			perimeter += 1;

		if (top == 0)
			perimeter += 1;

		if (bottom == 0)
			perimeter += 1;

		return perimeter;
	}
}
