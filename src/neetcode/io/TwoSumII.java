package neetcode.io;

public class TwoSumII {

	public static  int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];

		int left = 0;
		int right = numbers.length - 1;

		while (left < numbers.length && right >= 0) {
			int sum = numbers[left] + numbers[right];
			if (sum == target) {
				result[0] = left + 1;
				result[1] = right + 1;
				break;
			} else if (sum < target)
				left++;
			else
				right--;

		}

		return result;
	}

	public static void main(String[] args) {
		int []  numbers = {-1,0};
		int target = -1;
		
		for(int r : twoSum(numbers,target)) {
			System.out.print(r+" ");
		}
	}

}
