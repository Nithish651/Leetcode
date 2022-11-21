package graphs;

public class SurroundedRegions {

	public static void solve(char[][] board) {

		int n = board.length;
		int m = board[0].length;

		boolean[][] visited = new boolean[n][m];

		// traverse first row
		for (int i = 0; i < m; i++) {
			if (!visited[0][i] && board[0][i] == 'O') {
				dfs(visited, board, 0, i);
			}
		}

		// traverse left border

		for (int i = 0; i < n; i++) {
			if (!visited[i][0] && board[i][0] == 'O') {
				dfs(visited, board, i, 0);
			}
		}

		// traverse last row
		for (int i = 0; i < m; i++) {
			if (!visited[n - 1][i] && board[n - 1][i] == 'O') {
				dfs(visited, board, n - 1, i);
			}
		}

		// traverse right border
		for (int i = 0; i < n; i++) {
			if (!visited[i][m - 1] && board[i][m - 1] == 'O') {
				dfs(visited, board, i, m - 1);
			}
		}

		for(int i=0; i <n; i++) {
			for(int j=0; j < m; j++) {
				if(!visited[i][j] && board[i][j] == 'O') {
					board[i][j] = 'X';
				}
			}
		}
	}

	private static void dfs(boolean[][] visited, char[][] board, int currRow, int currCol) {
		visited[currRow][currCol] = true;

		int n = board.length;
		int m = board[0].length;

		int[] delRow = { -1, 0, 1, 0 };
		int[] delCol = { 0, -1, 0, 1 };

		for (int i = 0; i < 4; i++) {
			int nRow = currRow + delRow[i];
			int nCol = currCol + delCol[i];

			if (nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && !visited[nRow][nCol] && board[nRow][nCol] == 'O') {
				dfs(visited, board, nRow, nCol);
			}
		}

	}

	public static void main(String[] args) {
		char [] [] board = new char[4][4];

		board[0][0] = 'X';
		board[0][1] = 'X';
		board[0][2] = 'X';
		board[0][3] = 'X';
		
		board[1][0] = 'X';
		board[1][1] = 'O';
		board[1][2] = 'O';
		board[1][3] = 'X';
		
		board[2][0] = 'X';
		board[2][1] = 'X';
		board[2][2] = 'O';
		board[2][3] = 'X';
		
		board[3][0] = 'X';
		board[3][1] = 'O';
		board[3][2] = 'X';
		board[3][3] = 'X';
		
		solve(board);
		
		for(int i=0; i<4; i++) {
			for(int j=0; j < 4; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
}
