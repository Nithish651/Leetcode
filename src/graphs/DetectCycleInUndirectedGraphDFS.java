package graphs;

import java.util.ArrayList;
import java.util.List;

public class DetectCycleInUndirectedGraphDFS {

	public static boolean cycleExists(List<List<Integer>> adjacencyList, int n) {

		boolean[] visited = new boolean[n + 1];

		for (int i = 0; i <= n; i++) {
			if (!visited[i]) {
				if (hasCycle(i, -1, visited, adjacencyList)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean hasCycle(int current, int previous, boolean[] visited, List<List<Integer>> adjacencyList) {

		visited[current] = true;

		for (int adj : adjacencyList.get(current)) {
			if (!visited[adj]) {
				if (hasCycle(adj, current, visited, adjacencyList)) {
					return true;
				}
			} else {
				if (adj != previous)
					return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		List<List<Integer>> adjacencyList = new ArrayList<>();
		
		int n = 4;
		
		for(int i=0; i <=n; i++)
			adjacencyList.add(new ArrayList<>());
		
		adjacencyList.get(1).add(2);
		
		adjacencyList.get(2).add(3);
		adjacencyList.get(2).add(1);
		
		adjacencyList.get(3).add(2);
		//adjacencyList.get(3).add(1);
		
		System.out.println(cycleExists(adjacencyList, n));
	}
}
