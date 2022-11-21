package graphs;

import java.util.LinkedList;
import java.util.Queue;

class Point{
	int row;
	int col;
	
	public Point(int row, int col) {
		this.row = row;
		this.col = col;
	}
}



public class NumberOfEnclaves {

	
    public static int numEnclaves(int[][] grid) {
    	
    	int count = 0;
    	
    	int n = grid.length;
    	int m = grid[0].length;
    	
    	boolean [][] visited = new boolean[n][m];
    	Queue<Point> queue = new LinkedList<>();
    	
    	for(int i=0; i < n; i++) {
    		for(int j=0; j<m; j++) {
    			if(i==0 || i == n-1 || j==0 || j == m-1) {
    				if(grid[i][j] == 1) {
    				queue.add(new Point(i,j));
    				visited[i][j] = true;
    				}
    			}
    		}
    	}
    	
    	int [] delRow = {-1,0,1,0};
    	int [] delCol = {0,-1,0,1};
    	
    		
    	while(!queue.isEmpty()) {
    		Point point = queue.poll();
    		int row = point.row;
    		int col = point.col;
    		
    		for(int i=0; i < 4; i++) {
    			int nRow = row + delRow[i];
    			int nCol = col + delCol[i];
    			
    			if(nRow >=0 && nRow < n && nCol >=0 && nCol < m && grid[nRow][nCol] == 1 && !visited[nRow][nCol]) {
    				queue.add(new Point(nRow,nCol));
    				visited[nRow][nCol] = true;
    			}
    		}
    	}
    	
    	for(int i=0; i < n; i++) {
    		for(int j=0; j < m; j++) {
    			if(!visited[i][j] && grid[i][j] == 1)
    				count++;
    		}
    	}
    	
        return count;
    }
	
	public static void main(String[] args) {
		int [][] grid = new int[4][4];
		
		grid[1][0] = 1;
		grid[1][2] = 1;
		grid[2][1] = 1;
		grid[2][2] = 1;
		
		
		System.out.println(numEnclaves(grid));
	}
}
