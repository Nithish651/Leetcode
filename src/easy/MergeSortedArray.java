package easy;

public class MergeSortedArray {
	
	public static void main(String[] args) {
		int [] nums1 = {1,2,3,0,0};
		int [] nums2 = {2,5};
		
		merge(nums1,3,nums2,nums2.length);
		
	}
	
	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	   
		 int p1 = m-1, p2 = n-1, i = m+n-1;
		 
		 while(p2 >= 0) {
			 if(p1 >= 0 && nums1[p1] > nums2[p2]) {
				 nums1[i--] = nums1[p1--];
			 }else {
				 nums1[i--] = nums2[p2--];
			 }
		 }
	      
	    
	      
	      for(int j=0; j < nums1.length; j++) {
	    	  System.out.print(nums1[j]+" ");
	      }
	 }

}
