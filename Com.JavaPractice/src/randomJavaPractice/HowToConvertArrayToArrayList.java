package randomJavaPractice;

import java.util.Arrays;
import java.util.List;

public class HowToConvertArrayToArrayList {

	public static void main(String[] args) {

		String[] ar = { "name", "is", "Japan" };

		List<String> list = Arrays.asList(ar);
		System.out.println(list);
	}

}
