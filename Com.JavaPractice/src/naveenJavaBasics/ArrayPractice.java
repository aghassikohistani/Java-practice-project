package naveenJavaBasics;

import java.util.ArrayList;

public class ArrayPractice {

	public static void main(String[] args) {

		ArrayList<String> colors = new ArrayList<String>();

		colors.add("yellow");
		colors.add("Green");
		colors.add("red");
		colors.add("blue");
		colors.add("white");
		colors.add("Green");
		colors.add("red");
		// colors.stream().forEach(e -> System.out.println(e));

		// colors.stream().forEach(e -> System.out.println(e));
		// for (int i =0; i<=colors.size(); i++) {
		// System.out.println(colors);

		// colors.stream().forEach(e -> System.out.println(e));

		for (int i = 0; i < colors.size(); i++) {
			for (int j = i + 1; j < colors.size(); j++) {
				if (i == j) {
					System.out.println(i);
				}
			}
		}

	}

}
