package neetcode.io;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

	
    public static boolean isValidSudoku(char[][] board) {
        boolean isValid = true;
        Set<String> set = new HashSet<>();
        
        for(int i=0; i < board.length; i++) {
        	for(int j=0; j < board[i].length; j++) {
        		if(board[i][j] != '.') {
        			if(set.contains(board[i][j]+" found at row-"+i))
        				return false;
        			
        			if(set.contains(board[i][j]+" found at col-"+j))
        				return false;
        			
        			if(set.contains(board[i][j]+" found at grid-"+i/3+"-"+j/3))
        				return false;
        				
        			set.add(board[i][j]+" found at row-"+i);
        			set.add(board[i][j]+" found at col-"+j);
        			set.add(board[i][j]+" found at grid-"+i/3+"-"+j/3);
        		}
        			
        	}
        }
        
        return isValid;
    }
	
	public static void main(String[] args) {
		char [] [] board = {
				{'5','3','.','.','7','.','.','.','.'},
				{'6','.','.','1','9','5','.','.','.'},
				{'.','9','8','.','.','.','.','6','.'},
				{'8','.','.','.','6','.','.','.','3'},
				{'4','.','.','8','.','3','.','.','1'},
				{'7','.','.','.','2','.','.','.','6'},
				{'.','6','.','.','.','.','2','8','.'},
				{'.','.','.','4','1','9','.','.','5'},
				{'.','.','.','.','8','.','.','7','9'}
		};
		
		char [] [] board1 = {
				{'8','3','.','.','7','.','.','.','.'},
				{'6','.','.','1','9','5','.','.','.'},
				{'.','9','8','.','.','.','.','6','.'},
				{'8','.','.','.','6','.','.','.','3'},
				{'4','.','.','8','.','3','.','.','1'},
				{'7','.','.','.','2','.','.','.','6'},
				{'.','6','.','.','.','.','2','8','.'},
				{'.','.','.','4','1','9','.','.','5'},
				{'.','.','.','.','8','.','.','7','9'}
		};
		
		System.out.println(isValidSudoku(board));
		System.out.println(isValidSudoku(board1));
	}
}
