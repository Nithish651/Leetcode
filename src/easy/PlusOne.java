package easy;

public class PlusOne {

	public static void main(String[] args) {
		int [] arr = {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,};
		int [] result = plusOne(arr);
		for (int i : result) {
			System.out.print(i);
		}
		
	}
	
	public static int[] plusOne(int[] digits) {
		int toAdd = 0;
		int [] results = null;
		
		for(int i = digits.length -1; i>=0; i--) {
			if(digits[i] == 9) {
				toAdd = 1;
				if(i != 0)
					digits[i] = 0;
				else {
					results = new int[digits.length + 1];
					results[0] = 1;
					return results;
				}
			}else if(toAdd > 0){
				digits[i] += toAdd;
				toAdd = 0;
				return digits;
			}else {
				digits[i]++;
				return digits;
			}
		}
        return digits;
    }
}
