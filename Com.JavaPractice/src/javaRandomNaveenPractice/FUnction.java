package javaRandomNaveenPractice;

public class FUnction {
	static int age;

	public static int smokingAge(int age) {

		if (age >= 18) {
			System.out.println("sell the cigarretes to the guy let him puff");

		}
		return age;

	}

	public static void main(String[] args) {

		int sm = smokingAge(55);
		System.out.println(sm);

	}

}
