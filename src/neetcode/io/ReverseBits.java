package neetcode.io;

public class ReverseBits {

    public static int reverseBits(int n) {
    	int reversed = 0;
    	
    	for(int i=0; i < 32; i++) {
    		reversed <<= 1;
    		reversed |= (n & 1);
    		n >>= 1;
    	}
    	return reversed;
    }
	
	public static void main(String[] args) {
			System.out.println(reverseBits(43261596));
	}
}
