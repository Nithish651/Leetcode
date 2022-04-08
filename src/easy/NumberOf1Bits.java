package easy;

public class NumberOf1Bits {

	public static void main(String[] args) {

		System.out.println(hammingWeight1(11));

	}

	public static int hammingWeight(int n) {

		int count = 0;
		int mask = 1;

		for (int i = 0; i < 32; i++) {

			if ((n & mask) == 1)
				count++;

			n >>= 1;

		}

		return count;
	}
	
	
	public static int hammingWeight1(int n) {

		int count = 0;
		
		while(n != 0) {
			//first subtract 1 to remove the lease significant '1' bit.
			//and it with the number to make it the new n to continue hte logic.
			n &= n-1;
			count++;
		}
		
		return count;
	}
}
