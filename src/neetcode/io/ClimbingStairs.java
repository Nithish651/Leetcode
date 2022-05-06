package neetcode.io;

public class ClimbingStairs {
	
	
    public static int climbStairs(int n) {
        
		int a = 1;
		int b = 1;
		int c=0;
		
    	for(int i=0; i <n-1; i++) {
    		c = a + b;
    		a=b;
    		b=c;    		
    	}
    	
    	return c;
    }
    
    
    public static void main(String[] args) {
		System.out.println(climbStairs(5));
	}

}
