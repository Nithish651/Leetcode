package neetcode.io;

public class NumberOf1Bits {

	public static int hammingWeight(int n) {
		int count = 0;
		int mask = 1;
		
		for(int i =0; i < 32; i++) {
			if((n & mask) == 1)
				count++;
			n = n >> 1;	
		}		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(hammingWeight(3));
	}
}
