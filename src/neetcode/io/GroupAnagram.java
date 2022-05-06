package neetcode.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
	
	
    public static List<List<String>> groupAnagrams(String[] strs) {
    	
    	Map<String,List<String>> map = new HashMap<>();
    	List<List<String>> result = new ArrayList<>();
    	
    	for(String str : strs) {
    		String sorted = "".equals(str)?"":sort(str);
    		System.out.println(sorted);
    		if(map.containsKey(sorted))
    			map.get(sorted).add(str);
    		else
    			map.put(sorted, new ArrayList<>(Arrays.asList(str)));
    	}
    	
    	for(List<String> list : map.values()) {
    		result.add(list);
    	}
        return result;
    }
    
    public static String sort(String str) {
    	char [] temp = str.toCharArray();
    	Arrays.sort(temp);
    	return new String(temp);
    }

	
	public static void main(String[] args) {
		String [] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(strs));
	}
}
