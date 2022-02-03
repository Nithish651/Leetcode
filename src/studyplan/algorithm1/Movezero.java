package studyplan.algorithm1;

public class Movezero {

	public static void main(String[] args) {
		int [] nums  = {1,0,2,0,3,0,4};
		moveZeroes(nums);
		
		for (int i : nums) {
			System.out.print(i+" ");
		}
	}

	public static void moveZeroes(int[] nums) {
		int zp = 0;
		int nzp = 0;
		int temp = 0;

		while (zp < nums.length && nzp < nums.length) {

			if (nums[zp] != 0)
				zp++;
			else if (nums[nzp] == 0)
				nzp++;
			else if(zp < nzp) {
				temp = nums[nzp];
				nums[nzp] = nums[zp];
				nums[zp] = temp;
			}else {
				nzp++;
			}

		}
	}
}
