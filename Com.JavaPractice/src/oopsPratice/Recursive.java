package oopsPratice;

public class Recursive {

	public static void main(String[] args) {

		num(0);

	}

	public static void num(int number) {

		// System.out.println(number);

		if (number < 10) {

			number++;
			num(number);
			System.out.print(number);

		}

	}

}
