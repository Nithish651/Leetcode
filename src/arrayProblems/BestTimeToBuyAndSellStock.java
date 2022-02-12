package arrayProblems;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		int [] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {

		int left = 0;
		int right = 1;
		int max = 0;

		while (right < prices.length) {
			if (prices[right]  < prices[left]) {
				left = right;
				right++;
			} else {
				int diff = prices[right] - prices[left];
				max = max > diff  ? max : diff;
				right++;
			}
		}

		return max;
	}
}
