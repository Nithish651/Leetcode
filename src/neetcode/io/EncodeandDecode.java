package neetcode.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeandDecode {
	
    public static  String encode(List<String> strs) {
    	StringBuilder builder = new StringBuilder();
    	
    	for(String str : strs) {
    		builder.append(str.length())
    				.append("#")
    				.append(str);
    	}
    	
        return builder.toString();
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
	public static List<String> decode(String str) {
		List<String> result = new ArrayList<>();

		int i = 0;

		while (i < str.length()) {
			int j = i;

			while (str.charAt(j) != '#')
				j++;

			int numberOfCharacters = Integer.parseInt(str.substring(i, j));
			int endIndex = numberOfCharacters + j + 1;
			result.add(str.substring(j + 1, endIndex));

			i = endIndex;
		}
		return result;
	}
    
    
	public static void main(String[] args) {
		System.out.println(encode(Arrays.asList("")));
		System.out.println(decode(encode(Arrays.asList(""))));

	}

}
