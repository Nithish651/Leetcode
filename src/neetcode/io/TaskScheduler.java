package neetcode.io;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import javafx.util.Pair;

public class TaskScheduler {

	public static int leastInterval(char[] tasks, int n) {
		if(n == 0) return tasks.length;
		int[] arr = new int[26];

		for (char ch : tasks) {
			arr[ch - 'A']++;
		}

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		Queue<Pair<Integer, Integer>> q = new LinkedList<>();

		for (int i : arr) {
			if(i > 0) pq.add(i);
		}

		int time = 0;

		while (!pq.isEmpty() || !q.isEmpty()) {
			time++;
			if (!pq.isEmpty()) {
				int val = pq.poll();
				val--;

				if (val > 0)
					q.add(new Pair<Integer, Integer>(time + n, val));
			}

			if (!q.isEmpty()) {
				if (time == q.peek().getKey())
					pq.add(q.poll().getValue());
			}
		}

		return time;
	}	
	
	public static void main(String[] args) {
		char [] tasks = {'A','A','A','B','B','B'};
		System.out.println(leastInterval(tasks, 2));
	}
}
