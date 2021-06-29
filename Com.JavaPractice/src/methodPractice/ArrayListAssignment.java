package methodPractice;

import java.util.ArrayList;

public class ArrayListAssignment {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<String>();

		colors.add("Red");
		colors.add("Blue");
		colors.add("pink");
		colors.add("pink");
		colors.add("pink");

		colors.set(1, "green");
		colors.remove(3);

		// colors.stream().forEach(e -> System.out.println(e));
		colors.stream().filter(e -> e.equals("pink")).forEach(e -> System.out.println(e));
	}

}
