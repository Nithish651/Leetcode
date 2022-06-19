package neetcode.io;

public class ContainerWithMostWater {

	// [1,8,6,2,5,4,8,3,7]
	public static int maxArea(int[] height) {
		int maxArea = 0;
		int left = 0;
		int right = height.length - 1;
		int area = 0;

		while (left < right) {
			area = (right - left) * Math.min(height[left], height[right]);
			maxArea = Math.max(area, maxArea);

			if (height[left] <= height[right])
				left++;
			else
				right--;
		}

		return maxArea;

	}

	public static void main(String[] args) {
		int [] height = {2,3,4,5,18,17,6};
		System.out.println(maxArea(height));
	}
}
