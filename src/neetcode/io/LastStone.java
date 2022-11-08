package neetcode.io;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStone {
	
	

    public static int lastStoneWeight(int[] stones) {
    	
    	if(stones.length == 1)
    		return stones[0];
    	
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone : stones)
        	queue.add(stone);
        
        while(queue.size() > 1) {
        	int largest = queue.poll();
        	int secondLargest = queue.poll();
        	
        	int difference = largest - secondLargest;
        	
        	if(difference > 0)
        		queue.add(difference);
        }
        
        return queue.size() == 0 ? 0 : queue.peek();
    }	
	
	public static void main(String[] args) {
		int [] stones = {1};
		System.out.println(lastStoneWeight(stones));
	}
}
