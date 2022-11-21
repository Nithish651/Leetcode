package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class Node{
	int val;
	int prev;
	
	public Node(int val, int prev) {
		this.val = val;
		this.prev = prev;
	}
}


public class DetectCycleUndirectedGraphBFS {

	
	public static boolean hasCycle(List<List<Integer>> adjacencyList, Node current, int n, boolean [] visited) {
		
		visited[current.val] = true;
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(current);
		
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			
			for(int adj : adjacencyList.get(node.val)) {
				
				if(visited[adj]) {
					if(current.prev != adj)
						return true;
				}else {
					visited[adj] = true;
					queue.add(new Node(adj,current.val));
				}
			}
		}
		
		return false;
	}
	
	private static boolean cycleExists(List<List<Integer>> adjacencyList, int v) {
		boolean [] visited = new boolean[v + 1];
		
		for(int i=1; i<=v; i++) {
			if(!visited[i]) {
				if(hasCycle(adjacencyList,new Node(i,-1),v,visited))
					return true;
			}
		}
		return false;
	}
	

	
	
	public static void main(String[] args) {
		int v = 2;
		List<List<Integer>> adjacencyList = new ArrayList<>();
		
		for(int i=0; i <= v; i++) {
			adjacencyList.add(new ArrayList<>());
		}
		
		adjacencyList.get(1).add(2);
		/*
		 * adjacencyList.get(1).add(3);
		 * 
		 * adjacencyList.get(2).add(1); adjacencyList.get(2).add(5);
		 * 
		 * adjacencyList.get(5).add(2); adjacencyList.get(5).add(7);
		 * 
		 * adjacencyList.get(7).add(5); adjacencyList.get(7).add(6);
		 * 
		 * adjacencyList.get(6).add(3); adjacencyList.get(6).add(7);
		 * 
		 * adjacencyList.get(3).add(1); adjacencyList.get(3).add(6);
		 * adjacencyList.get(3).add(4);
		 */
		
		
		System.out.println(cycleExists(adjacencyList,v));
		
	}





	}

