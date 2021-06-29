package javaRandomNaveenPractice;

import java.util.ArrayList;

public class ArrayListExampleInaFunction {

	public ArrayList<String> getStudentNames() {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Aghassi");
		names.add("Martin");
		names.add("Rommel");
		names.add("Micheal");
		names.add("02/04/1988");

		return names;
	}

	public static void main(String[] args) {

		ArrayListExampleInaFunction name = new ArrayListExampleInaFunction();

//		for (String e : name.getStudentNames()) {
//			System.out.println(e);
//		}

		for (int i = 0; i < name.getStudentNames().size(); i++) {
		}
		System.out.println(name.getStudentNames());
	}

}
