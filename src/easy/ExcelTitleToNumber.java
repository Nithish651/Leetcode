package easy;

public class ExcelTitleToNumber {

	public static void main(String[] args) {
		System.out.println(titleToNumber("FXSHRXW"));
	}

	public static int titleToNumber(String columnTitle) {

		int columnNumber = 0;
		char ch = 'A';

		for (int i = 0; i < columnTitle.length(); i++) {
			ch = columnTitle.charAt(columnTitle.length() - 1 - i);
			columnNumber += ((ch - 65)+1) * Math.pow(26, i);
		}

		return columnNumber;
	}

}
