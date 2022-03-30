package easy;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		System.out.println(convertToTitle(702));
	}

	public static String convertToTitle(int columnNumber) {

		String result = "";

		while (columnNumber > 0) {

			result = Character.toString('A' + ((columnNumber - 1) % 26)) + result;
			columnNumber = ((columnNumber - 1) / 26);
		}

		return result;
	}
}
