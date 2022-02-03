package studyplan.algorithm1;

public class ReverseString {

	public static void main(String[] args) {
		char [] s = {'h','e','l','l','o'};
		char [] b = {'H','a','n','n','a','h'};
		
		reverseString(s);
		reverseString(b);
		
		for (char c : b) {
			System.out.print(c+" ");
		}
	}
	
	public static void reverseString(char[] s) {
		int left = 0;
		int right = s.length - 1;
		char temp = 'a';
		
		while(left < right) {
			temp = s[right];
			s[right] = s[left];
			s[left] = temp;
			left++;
			right--;
		}
		
    }
}
