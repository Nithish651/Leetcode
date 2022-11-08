package neetcode.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumbers {

    public static List<String> letterCombinations(String digits) {
    	
    	if(digits.isEmpty())
    		return new ArrayList<String>();
    	
    	List<String> result = new ArrayList<>();
    	Map<String,List<String>> map = new HashMap<>();
    	map.put("2", Arrays.asList("a","b","c"));
    	map.put("3", Arrays.asList("d","e","f"));
    	map.put("4", Arrays.asList("g","h","i"));
    	map.put("5", Arrays.asList("j","k","l"));
    	map.put("6", Arrays.asList("m","n","o"));
    	map.put("7", Arrays.asList("p","q","r","s"));
    	map.put("8", Arrays.asList("t","u","v"));
    	map.put("9", Arrays.asList("w","x","y","z"));
    	backTrack("",digits,0,map,result);
    	return result;
    }
	
	private static void backTrack(String current, String digits, int index, Map<String, List<String>> map, List<String> result) {
	
		if(index == digits.length()) {
			result.add(current);
			return;
		}
		
		List<String> str = map.get(Character.toString(digits.charAt(index)));
		
		for (String string : str) {
			backTrack(current + string, digits, index + 1, map, result);
		}
		
	}

	public static void main(String[] args) {
		System.out.println(letterCombinations(""));
	}
}
