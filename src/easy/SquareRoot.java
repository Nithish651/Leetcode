package easy;

public class SquareRoot {
	
	public static void main(String[] args) {
		
		System.out.println(mySqrt(9));
	}
	
    public static int mySqrt(int x) {
    	
    	if(x == 0)
    		return 0;
    	
    	int start = 1; 
    	int end = x;
    	int result = 0;
    	int mid = 0;
    	
    	while(start <= end) {
    		mid = start + (end - start)/2;
    		if(mid <= x / mid) {
    			result = mid;
    			start = mid + 1;
    		}else {
    			end = mid - 1;
    		}    			
    	}
    	
        return result;
    }

}
