package arrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle2 {

	public static void main(String[] args) {
		System.out.println(getRow(34));
	}

	public static List<Integer> getRow(int rowIndex) {

		if (rowIndex < 0)
			return null;
		
		if(rowIndex == 0)
			return Arrays.asList(1);

		List<Integer> prev = null;
		List<Integer> row = null;

		for (int i = 1; i <= rowIndex; i++) {
			row = new ArrayList<>();
			row.add(1);
			for (int j = 1; j < i; j++) {
				row.add(prev.get(j - 1) + prev.get(j));
			}
			row.add(1);
			prev = row;
		}

		return row;
	}
}
