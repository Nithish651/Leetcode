package easy;

public class Strstr {
	
	public static void main(String[] args) {
		
		System.out.println(strStr("asdas", ""));
		
	}
	
	public static int strStr(String haystack, String needle) {
		if(needle.isEmpty())
			return 0;
		
		return haystack.indexOf(needle);
    }

}
