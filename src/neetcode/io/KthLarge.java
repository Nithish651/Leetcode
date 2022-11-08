package neetcode.io;

import java.util.PriorityQueue;

public class KthLarge {
	
    public static int findKthLargest(int[] nums, int k) {
    	PriorityQueue<Integer> queue = new PriorityQueue<>();
    	
    	for (int i : nums) {
			queue.add(i);
			
			if(queue.size() > k )
				queue.poll();
		}
    	
        return queue.peek();
    }	

	
	public static void main(String[] args) {
		int [] nums = {3,2,3,1,2,4,5,5,6};
		System.out.println(findKthLargest(nums, 4));
		
	}
}
