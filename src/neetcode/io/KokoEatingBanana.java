package neetcode.io;

public class KokoEatingBanana {

	// Input: piles = [3,6,7,11], h = 8
	// O(n.log(max(p))
	public static int minEatingSpeed(int[] piles, int h) {
		int k = Integer.MAX_VALUE;
		int maxBananas = 0;

		// o(n)
		for (int count : piles) {
			maxBananas = Math.max(maxBananas, count);
		}

		int left = 1, right = maxBananas, mid = 0; long totalHours = 0;

		//log(max(p))
		while (left <= right) {
			mid = left + ((right - left) / 2);
			totalHours = 0;
			//o(n)
			for (int p : piles) {
				totalHours += (p/mid) + (p % mid == 0 ? 0 : 1);
			}

			if (totalHours <= h) {
				k = Math.min(k, mid);
				right = mid - 1;
			} else
				left = mid + 1;

		}

		return k;
	}

	public static void main(String[] args) {
		int [] piles = {30,11,23,4,20}; int h = 6;
		System.out.println(minEatingSpeed(piles,h));
	}

}
