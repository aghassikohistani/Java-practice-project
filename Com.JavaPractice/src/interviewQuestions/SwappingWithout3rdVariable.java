package interviewQuestions;

public class SwappingWithout3rdVariable {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;

		// before
		System.out.println("Before: x = " + x + " \ty= " + y);

		// Swap
		x = x + y;
		y = x - y;
		x = x - y;

		// After
		System.out.println("After: x = " + x + "\ty= " + y);

	}

}
