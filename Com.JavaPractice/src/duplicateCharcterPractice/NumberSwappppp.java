package duplicateCharcterPractice;

public class NumberSwappppp {

	public static void main(String[] args) {

		int num1 = 40;
		int num2 = 60;

		System.out.println("before swapping the value is.." + num1 + " " + num2);

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("after swapping the value is.." + num1 + " " + num2);

	}

}
