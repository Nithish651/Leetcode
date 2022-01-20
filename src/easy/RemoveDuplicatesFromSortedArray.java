package easy;

public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		int [] arr = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(arr));
	}

    public static int removeDuplicates(int[] nums) {
    	int sp=0;
    	int ep = 1;
    	
    	while(ep < nums.length) {
    		if(nums[sp] == nums [ep])
    			ep++;
    		else 
    			nums[++sp] = nums[ep];
    	}
        return sp+1;
    }
}
