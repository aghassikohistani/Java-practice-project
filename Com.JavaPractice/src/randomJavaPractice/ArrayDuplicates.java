package randomJavaPractice;

import java.util.Arrays;
import java.util.List;

public class ArrayDuplicates {

	public static void main(String[] args) {

		String[] subjects = { "English", "Persian", "Physics", "Chemistry", "English", "Persian" };

		List<String> sub = Arrays.asList(subjects);
		// factory.stream().filter(e -> e.equals("aghassi")).forEach(e ->
		// System.out.println(e));

//		sub.stream().filter(e -> e.equals("Persian")).forEach(e -> System.out.println(e));

		for (int i = 0; i < sub.size(); i++) {
			System.out.println(sub.get(i));
		}

	}

}
