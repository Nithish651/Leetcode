package neetcode.io;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KClosestPoints {

    public static int[][] kClosest(int[][] points, int k) {
    	
    	if(points.length == 1)
    		return points;
    	
		PriorityQueue<int []> queue = new PriorityQueue<>((a,b) -> Integer.compare(((a[0]*a[0])+(a[1]*a[1])),((b[0]*b[0])+(b[1]*b[1]))));
		int [] [] result = new int[k] [2];
		
		for(int i=0; i < points.length; i++) 
			queue.add(points[i]);
		
		int index = 0;
		
		while(k-- > 0) {
			int [] curr = queue.poll();
			result[index][0] = curr[0];
			result[index][1] = curr[1];
			index++;
		}
	
			
		
		return result;
    	
    }
	
	public static void main(String[] args) {
		

		int [] [] points = new int [2] [2];
		points[0][0] = 1;
		points[0][1] = 0;
		points[1][0] = 0;
		points[1][1] = 1;
		/*
		 * points[2][0] = -2; points[2][1] = 4;
		 */

		
		int [] [] results = kClosest(points,2);
		
		for(int i=0; i < results.length; i++) {
			System.out.print(results[i][0]+" "+results[i][1]);
		}
	}
}
