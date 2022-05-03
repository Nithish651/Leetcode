package neetcode.io;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
	
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        if(stones.length == 1)
        	return stones[0];
        
        for(int weight : stones) {
        	queue.add(weight);
        }
        
        while(queue.size() > 1) {
        	int maxWeight = queue.poll();
        	int secondMaxWeight = queue.poll();
        	int difference = maxWeight - secondMaxWeight;
        	
        	if(difference != 0)
        		queue.add(difference);
        }
        
        return queue.isEmpty()?0:queue.peek();
    }

    
    public static void main(String[] args) {
		LastStoneWeight lw = new LastStoneWeight();
		int []  stones = {2,7,4,1,8,1};
		System.out.println(lw.lastStoneWeight(stones));
	}
}
