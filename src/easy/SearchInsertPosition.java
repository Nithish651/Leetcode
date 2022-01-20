package easy;

public class SearchInsertPosition {
	
	public static void main(String[] args) {
		int [] arr = {9};
		System.out.println(searchInsert(arr,7));
	}
	
	
	public static int searchInsert(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		int mid = 0;
		
		while(left <= right) {
			mid = (left+right)/2;
			
			if(nums[mid] == target)
				return mid;
			else if(target < nums[mid])
				right = mid -1;
			else
				left = mid + 1;
		}
        return left;
    }

}
