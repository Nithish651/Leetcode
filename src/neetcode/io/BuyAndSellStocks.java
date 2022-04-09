package neetcode.io;

public class BuyAndSellStocks {

	public static int maxProfit(int[] prices) {

		int maxProfit = 0;

		int left = 0;
		int right = 1;

		while (left < prices.length && right < prices.length) {
			if (prices[left] > prices[right])
				left++;
			else {
				maxProfit = maxProfit > (prices[right] - prices[left]) ? maxProfit : prices[right] - prices[left];
				right++;
			}
		}

		return maxProfit;
	}

	public static void main(String[] args) {
		int [] prices = {7};
		System.out.println(maxProfit(prices));
	}
}
