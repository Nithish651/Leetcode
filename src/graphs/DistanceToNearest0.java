package graphs;

import java.util.LinkedList;
import java.util.Queue;

class Cell{
	int row;
	int col;
	int distance;
	
	public Cell(int row, int col, int distance) {
		this.row = row;
		this.col = col;
		this.distance = distance;
	}
}

public class DistanceToNearest0 {

	
    public static int[][] updateMatrix(int[][] mat) {
        
    	int [][] arr = mat;
    	
    	
    	int n = arr.length;
    	int m = arr[0].length;
    	
    	boolean [] [] visited = new boolean[n][m];
    	int [] [] distanceMat = new int[n][m];
    	Queue<Cell> queue = new LinkedList<>();
    	
    	for(int i=0; i < n; i++) {
    		for(int j=0; j < m; j++) {
    			if(!visited[i][j] && arr[i][j] == 0) {
    				visited[i][j] = true;
    				queue.add(new Cell(i,j,0));
    			}
    		}
    	}
    	
    	int [] delRow = {-1,0,1,0};
    	int [] delCol = {0,-1,0,1};
    	
    	while(!queue.isEmpty()) {
    		Cell cell = queue.poll();
    		distanceMat[cell.row][cell.col] = cell.distance;
    		
    		for(int i=0; i < 4; i++) {
    			int nRow = cell.row + delRow[i];
    			int nCol = cell.col + delCol[i];
    			
    			if(nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && !visited[nRow][nCol]) {
    				queue.add(new Cell(nRow,nCol,cell.distance + 1));
    				visited[nRow][nCol] = true;
    			}
    		}
    	}
    	
    	return distanceMat;
    }
	
	public static void main(String[] args) {
		/*
		 * int [] [] mat = new int[3][3];
		 * 
		 * mat[0][0] = 0; mat[0][1] = 0; mat[0][2] = 0;
		 * 
		 * mat[1][0] = 0; mat[1][1] = 1; mat[1][2] = 0;
		 * 
		 * mat[2][0] = 1; mat[2][1] = 1; mat[2][2] = 1;
		 */
		
		
		int [][] mat = new int[5][1];
		
		mat[0][0] = 0;
		mat[1][0] = 0;
		mat[2][0] = 0;
		mat[3][0] = 0;
		mat[4][0] = 0;
		
		int [] [] result = updateMatrix(mat);
		
		for(int i=0; i < result.length; i++) {
			for(int j=0; j < result[i].length; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}
