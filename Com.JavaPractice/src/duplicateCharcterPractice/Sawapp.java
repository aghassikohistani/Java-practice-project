package duplicateCharcterPractice;

public class Sawapp {

	public static void main(String[] args) {

		int cash1 = 2000;
		int cash2 = 3000;
		System.out.println("before swapping" + cash1 + " " + cash2);
		cash1 = cash1 + cash2;
		cash2 = cash1 - cash2;
		cash1 = cash1 - cash2;

		System.out.println("after swapping" + cash1 + " " + cash2);
	}

}
