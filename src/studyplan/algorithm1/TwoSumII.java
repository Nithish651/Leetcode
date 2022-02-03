package studyplan.algorithm1;

public class TwoSumII {

	public static void main(String[] args) {
		int [] numbers = {-999,-2,-1,5,0};
		int target = -1000;
		
		for(int i : twoSum(numbers,target)) {
			System.out.print(i+" ");
		}
		
	}

	public static int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		int left = 0;
		int right = numbers.length - 1;

		while (left < right) {
			if (numbers[left] + numbers[right] == target) {
				result[0] = left + 1;
				result[1] = right + 1;
				return result;
			} else if (numbers[left] + numbers[right] > target)
				right--;
			else
				left++;

		}
		return result;
	}
}
