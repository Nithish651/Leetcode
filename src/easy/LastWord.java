package easy;

public class LastWord {
	
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord(""));
	}

    public static int lengthOfLastWord(String s) {
    	s = s.trim();
    	return s.length() - 1 - s.lastIndexOf(" ");
    }
}
