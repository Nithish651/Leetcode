package studyplan.algorithm1;

import java.util.Arrays;

public class FirstBadVersion {

	public static void main(String[] args) {
		System.out.println(firstBadVersion(9));
	}
	
	public static int firstBadVersion(int n) {

		int left = 1;
		int right = n;
		int mid = 0;
		int firstBadVersion = n;

		while (left <= right) {

			mid = left + (right - left) / 2;

			if (isBadVersion(mid)) {
				firstBadVersion = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}

		return firstBadVersion;
	}
    
    public static boolean isBadVersion(int version) {
    	
    	if(!Arrays.asList(1,2,3,4,5).contains(version))
    		return true;
    	
    	return false;
    }
}
