package neetcode.io;

public class MedianOfTwoSortedArrays {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if (nums2.length < nums1.length)
			return findMedianSortedArrays(nums2, nums1);

		int n1 = nums1.length;
		int n2 = nums2.length;
		int left = 0;
		int right = n1;

		while (left <= right) {
			int cut1 = left + (right - left) / 2;
			int cut2 = ((n1 + n2) / 2) - cut1;
			int l1 = cut1 == 0 ? Integer.MIN_VALUE : nums1[cut1 - 1];
			int l2 = cut2 == 0 ? Integer.MIN_VALUE : nums2[cut2 - 1];
			int r1 = cut1 == n1 ? Integer.MAX_VALUE : nums1[cut1];
			int r2 = cut2 == n2 ? Integer.MAX_VALUE : nums2[cut2];

			if (l1 > r2) {
				right = cut1 - 1;
			} else if (l2 > r1) {
				left = cut1 + 1;
			} else {
				if ((n1 + n2) % 2 == 0) {
					double maxLeft = Math.max(l1, l2);
					double minRight = Math.min(r1, r2);
					return (maxLeft + minRight) / 2;
				} else {
					return Math.min(r1, r2);
				}

			}

		}

		return 0;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1,2};
		int[] nums2 = { 3,4};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}
}
