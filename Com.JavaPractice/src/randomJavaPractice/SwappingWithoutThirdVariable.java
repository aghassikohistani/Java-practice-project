package randomJavaPractice;

public class SwappingWithoutThirdVariable {

	public static void main(String[] args) {

		int number1 = 200;
		int number2 = 500;

		System.out.println("Before swapping.." + number1 + " " + number2);

		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;

		System.out.println("Before swapping.." + number1 + " " + number2);
	}
}
