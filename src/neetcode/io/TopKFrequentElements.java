package neetcode.io;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

	
    public static int[] topKFrequent(int[] nums, int k) {
    	Map<Integer,Integer> map = new HashMap<>();
    	int [] result = new int[k];
    	PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((e1,e2) -> e1.getValue() - e2.getValue());

  	
    	for(int num : nums) {
    		map.put(num,map.getOrDefault(num,0)+1);
    	}
    	
    	for(Map.Entry<Integer,Integer> entry : map.entrySet() ) {
    		pq.add(entry);
    		if(pq.size() > k)
    			pq.poll();
    	}
    	
    	for(int i=0; i < result.length; i++) {
    		result[i] = pq.poll().getKey();
    	}
    
    	return result;
    }
	
	public static void main(String[] args) {
		int [] nums = {1,1,1,2,2,3};
		int [] result = topKFrequent(nums, 2);
		
		for(int i : result) {
			System.out.print(i+" ");
		}
	}
}
