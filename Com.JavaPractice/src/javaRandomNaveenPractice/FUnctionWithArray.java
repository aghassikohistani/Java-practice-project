package javaRandomNaveenPractice;

public class FUnctionWithArray {

	public Object[] employeeInfo() {

		Object[] info = new Object[] { "Aghassi", 25, "Seattle", "Washington", "Unites States Of America" };

		return info;

	}

	public static void main(String[] args) {

		FUnctionWithArray ar = new FUnctionWithArray();

		for (int i = 0; i < ar.employeeInfo().length; i++) {
			System.out.println(ar.employeeInfo()[i]);
			
			
		}

		System.out.println(ar.employeeInfo()[3]);
	}

}
