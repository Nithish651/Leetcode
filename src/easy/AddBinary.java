package easy;

public class AddBinary {
	public static void main(String[] args) {
		
		System.out.println(addBinary("11", "1"));
	}
	
    public static  String addBinary(String a, String b) {
      
    	int i = a.length() - 1;
    	int j = b.length() - 1;
    	
    	int carry = 0;
    	int sum = 0;
    	StringBuffer buf = new StringBuffer();
    	
    	while(i >= 0 || j >= 0) {
    		sum = carry;
    		if(i >=0) sum += a.charAt(i) - '0';
    		if(j >=0 )sum += b.charAt(j) - '0';
    		buf.append(sum % 2);
    		carry = sum/ 2;
    		i--;
    		j--;
    	}
    	if(carry !=0) buf.append(carry);
    	return buf.reverse().toString();
    	
    }
    
   
}
