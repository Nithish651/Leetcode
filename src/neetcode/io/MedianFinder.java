package neetcode.io;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {

	PriorityQueue<Integer> maxHeap;
	PriorityQueue<Integer> minHeap;
	
    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        
    	if(maxHeap.isEmpty() || maxHeap.peek() > num) {
    		maxHeap.add(num);
    	}else {
    		minHeap.add(num);
    	}
    	
    	if(maxHeap.size() > minHeap.size() + 1)
    		minHeap.add(maxHeap.poll());
    	else if(minHeap.size() > maxHeap.size() + 1)
    		maxHeap.add(minHeap.poll());
    }
    
    public double findMedian() {
        if(maxHeap.size() > minHeap.size())
        	return maxHeap.peek();
        else if(minHeap.size() > maxHeap.size())
        	return minHeap.peek();
        else
        	return (double)(maxHeap.peek() + minHeap.peek())/2;
    }
	
	public static void main(String[] args) {
		MedianFinder medianFinder = new MedianFinder();
		medianFinder.addNum(1);    // arr = [1]
		medianFinder.addNum(2);    // arr = [1, 2]
		System.out.println(medianFinder.findMedian()); // return 1.5 (i.e., (1 + 2) / 2)
		medianFinder.addNum(3);    // arr[1, 2, 3]
		System.out.println(medianFinder.findMedian()); // return 2.0
	}
}
