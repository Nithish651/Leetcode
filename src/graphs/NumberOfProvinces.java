package graphs;

import java.util.ArrayList;
import java.util.List;

public class NumberOfProvinces {

    public static int findCircleNum(int[][] isConnected) {
        int result = 0;
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for(int i=0; i < isConnected.length; i++) {
        	adjacencyList.add(new ArrayList<>());
        }
        
        boolean [] visited = new boolean[isConnected.length];
        
        for(int i=0; i < isConnected.length; i++) {
        	for(int j=0; j < isConnected.length; j++) {
        		if(isConnected[i][j] == 1 && i != j) {
        			adjacencyList.get(i).add(j);
        		}
        	}
        }
        
        
        for(int i=0; i < isConnected.length; i++) {
        	if(!visited[i]) {
        		result++;
        		dfs(adjacencyList,i,visited);
        	}
        }
        
        return result;
    }
	
	
    public static void dfs(List<List<Integer>> adjacencyList, int current, boolean [] visited) {
    	
    	visited[current] = true;
    	
    	for(int adj : adjacencyList.get(current)) {
    		if(!visited[adj]) {
    			dfs(adjacencyList,adj,visited);
    		}
    	}
    }
    
    
	public static void main(String[] args) {
		int [][] isConnected = new int[3][3];
		
		isConnected[0][0] = 1;
		isConnected[0][1] = 1;
		
		isConnected[1][0] = 1;
		isConnected[1][1] = 1;
		
		isConnected[2][2] = 1;
		
		System.out.println(findCircleNum(isConnected));
	}
}
