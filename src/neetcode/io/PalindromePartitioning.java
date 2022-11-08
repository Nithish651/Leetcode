package neetcode.io;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        findPartition(s,0,new ArrayList<String>(),result);
        return result;
    }
    
    private static void findPartition(String s, int index, List<String> current, List<List<String>> result) {
    	
    	if(index == s.length()) {
    		result.add(new ArrayList<>(current));
    		return;
    	}
    	
    	for(int i = index; i < s.length(); ++i) {
    		if(isPalindrome(s,index,i)) {
    			current.add(s.substring(index, i+1));
    			findPartition(s,i+1,current,result);
    			current.remove(current.size() - 1);
    		}
    	}
    			
	}

	private static boolean isPalindrome(String s, int start, int end) {
		while (start <= end) {
			
			if (s.charAt(start++) != s.charAt(end--))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(partition("aab"));
	}
}
