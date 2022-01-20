package easy;

public class RemoveElement {
	
	public static void main(String[] args) {
		int [] arr = {0,1,2,2,3,0,4,2};
		System.out.println(removeElement(arr,2));
	}

	
	public static int removeElement(int[] nums, int val) {
        
		int sp = 0;
		for(int i=0; i < nums.length; i++) {
			if(nums[i] != val) {
				nums[sp++] = nums[i];
			}
		}
		return sp;
    }
}
