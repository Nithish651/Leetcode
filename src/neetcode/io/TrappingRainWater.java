package neetcode.io;

public class TrappingRainWater {

	
	//[0,1,0,2,1,0,1,3,2,1,2,1]
    public static int trap(int[] height) {
		
    	int left = 0, 
		right = height.length - 1, 
		leftMax = height[left], 
		rightMax = height[right],
		result = 0;
    	
		
    	 while(left < right) {
    		 if(leftMax <= rightMax) {
    			 left+=1;
    			 leftMax = Math.max(leftMax, height[left]);
    			 result += leftMax - height[left];
    		 }else {
    			 right-=1;
    			 rightMax = Math.max(rightMax, height[right]);
    			 result+= rightMax - height[right];
    		 }
    	 }
    	 
        return result;
    }
    
	public static void main(String[] args) {
		int [] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(heights));
	}
}
