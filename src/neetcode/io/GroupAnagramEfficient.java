package neetcode.io;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagramEfficient {

	
	 public static List<List<String>> groupAnagrams(String[] strs) {
		 Map<String,List<String>> map = new HashMap<>();
		 List<List<String>> result = new ArrayList<>();
		 
		 for(String str : strs){
			 char [] hash = new char[26];
			 for(char c : str.toCharArray()) {
				 hash[c-'a']++;
			 }
			 String pattern = new String(hash);
			 if(map.get(pattern) == null)
				 map.put(pattern, new ArrayList<>());
			 
			 map.get(pattern).add(str);
		 }
		 result.addAll(map.values());
		 return result;
	 }
	
	public static void main(String[] args) {
		String [] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(strs));
	}
}
