package studyplan.algorithm1;

public class SquaresOfSortedArray {

	public static void main(String[] args) {
		int[] nums = { -7, -3, 2, 3, 11 };
		for (int i : sortedSquares(nums)) {
			System.out.print(i + " ");
		}
	}

	public static int[] sortedSquares(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		int[] result = new int[nums.length];
		int counter = nums.length - 1;

		while (left <= right) {

			int leftSquare = nums[left] * nums[left];
			int rightSquare = nums[right] * nums[right];

			if (leftSquare <= rightSquare) {
				result[counter--] = rightSquare;
				right--;
			} else {
				result[counter--] = leftSquare;
				left++;
			}

		}

		return result;
	}
}
