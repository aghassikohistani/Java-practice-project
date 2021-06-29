package methodPractice;

public class TheAnswer {

	public static void main(String[] args) {

		TheAnswer an = new TheAnswer();
		int eve = an.evenAndOdd(13);
		System.out.println(eve);

	}

	public int evenAndOdd(int a) {
		if (a % 2 == 0) {
			System.out.println("it is an even number");
		} else {
			System.out.println("it is an odd number");
		}

		return a;
	}

}
