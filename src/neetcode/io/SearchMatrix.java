package neetcode.io;

public class SearchMatrix {

	//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
	//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
	public static boolean searchMatrix(int[][] matrix, int target) {
		for (int i = 0; i < matrix.length; i++) {
			if (target == matrix[i][matrix[i].length - 1])
				return true;
			else if (target < matrix[i][matrix[i].length - 1])
				return binarySearch(matrix[i], target);
		}
		return false;
	}

	private static boolean binarySearch(int[] arr, int target) {
		int left = 0, right = arr.length - 1, mid = 0;

		while (left <= right) {
			mid = left + (right - left) / 2;
			if (target == arr[mid])
				return true;
			else if (target < arr[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}

		return false;
	}

	public static void main(String[] args) {
		 
		int [] [] matrix = new int [3] [4];
		matrix[0][0] = 1;
		matrix[0][1] = 3;
		matrix[0][2] = 5;
		matrix[0][3] = 7;
		matrix[1][0] = 10;
		matrix[1][1] = 11;
		matrix[1][2] = 16;
		matrix[1][3] = 20;
		matrix[2][0] = 23;
		matrix[2][1] = 30;
		matrix[2][2] = 34;
		matrix[2][3] = 60;
		
		System.out.println(searchMatrix(matrix,34));
		
	}
}
