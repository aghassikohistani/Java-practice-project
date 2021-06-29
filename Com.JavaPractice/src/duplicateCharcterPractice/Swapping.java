package duplicateCharcterPractice;

public class Swapping {

	public static void main(String[] args) {

		int number1 = 40;
		int number2 = 60;

		System.out.println("Before swapping.." + number1 + " " + number2);

		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;

		System.out.println("After swapping.." + number1 + " " + number2);
	}

}
