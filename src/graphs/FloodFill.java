package graphs;

public class FloodFill {

	public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
		int[][] result = image;
		int[] delRow = { -1, 0, 1, 0 };
		int[] delCol = { 0, 1, 0, -1 };
		int existingColor = image[sr][sc];
		dfs(image, sr, sc, existingColor, color, result, delRow, delCol);
		return result;
	}

	private static void dfs(int[][] image, int sr, int sc, int existingColor, int color, int[][] result, int[] delRow,
			int[] delCol) {

		int n = image.length;
		int m = image[0].length;

		result[sr][sc] = color;

		for (int i = 0; i < 4; i++) {
			int rIndex = sr + delRow[i];
			int cIndex = sc + delCol[i];

			if (rIndex >= 0 && rIndex < n && cIndex >= 0 && cIndex < m && image[rIndex][cIndex] == existingColor
					&& result[rIndex][cIndex] != color) {
				dfs(image, rIndex, cIndex, existingColor, color, result, delRow, delCol);
			}
		}

	}

	public static void main(String[] args) {
		int[] row0 = { 1, 1, 1 };
		int[] row1 = { 1, 1, 0 };
		int[] row2 = { 1, 0, 1 };

		int[][] image = new int[3][3];
		image[0] = row0;
		image[1] = row1;
		image[2] = row2;

		int[][] result = floodFill(image, 1, 1, 2);

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
