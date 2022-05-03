package neetcode.io;

import java.util.PriorityQueue;

public class KthLargest {
	
	int k;
	PriorityQueue<Integer> queue = new PriorityQueue<>();

	 public KthLargest(int k, int[] nums) {
	        this.k = k;
	        for(int n : nums) {
	        	queue.add(n);
	        }
	        
	        while(queue.size() > k) {
	        	queue.poll();
	        }
	 }
	    
	 public int add(int val) {
	     queue.add(val);
	     if(queue.size() > k) {
	    	 queue.poll();
	     }
	     return queue.peek();
	 }
	
	public static void main(String[] args) {
		int [] nums = {4,5,8,2};
		KthLargest larg = new KthLargest(3,nums);
		System.out.println(larg.add(3));
		System.out.println(larg.add(5));
		System.out.println(larg.add(10));
		System.out.println(larg.add(9));
		System.out.println(larg.add(4));
	}
}
