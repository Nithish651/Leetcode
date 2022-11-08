package neetcode.io;

import java.util.PriorityQueue;

public class KthLargestInStream {
	
	 PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	 int k;

    public KthLargestInStream(int k, int[] nums) {
        this.k = k;
        
        for (int num : nums) {
			minHeap.add(num);
		}
    }
    
    public  int add(int val) {
    	minHeap.add(val);
    	
    	while(minHeap.size() > k)
    		minHeap.poll();
    	
    	return minHeap.peek();
    }

	
	public static void main(String[] args) {
		int [] nums = {4,5,8,2};
		KthLargestInStream kth = new KthLargestInStream(3,nums);
		System.out.println(kth.add(3));
		System.out.println(kth.add(5));
		System.out.println(kth.add(10));
		System.out.println(kth.add(9));
		System.out.println(kth.add(4));
	}
}
