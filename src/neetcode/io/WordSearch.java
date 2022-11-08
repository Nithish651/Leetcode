package neetcode.io;

public class WordSearch {

	public static boolean exist(char[][] board, String word) {
		int m = board.length;
		int n = board[0].length;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == word.charAt(i)) {
					if (search(board, i, j, m, n, word, 0))
						return true;
				}
			}
		}
		return false;
	}

	private static boolean search(char[][] board, int i, int j, int m, int n, String word, int k) {

		if (k >= word.length())
			return true;

		if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != word.charAt(k))
			return false;

		// mark the visited node
		boolean op1 = false, op2 = false, op3 = false, op4 = false;
		if (board[i][j] == word.charAt(k)) {
			char ch = board[i][j];
			board[i][j] = '#';
			op1 = search(board, i + 1, j, m, n, word, k + 1);
			op2 = search(board, i - 1, j, m, n, word, k + 1);
			op3 = search(board, i, j + 1, m, n, word, k + 1);
			op4 = search(board, i, j - 1, m, n, word, k + 1);
			board[i][j] = ch;
		}

		return op1 || op2 || op3 || op4;
	}

	public static void main(String[] args) {

	}
}
