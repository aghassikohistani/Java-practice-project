package duplicateCharcterPractice;

public class EvenOddArray {

	public static void main(String[] args) {

		int[] ar = { 2, 3, 5, 4, 8, 9 };

		System.out.println("odd numbers..");
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] % 2 != 0) {
				System.out.println(ar[i] + " ");
			}

		}
		System.out.println("even numbers ...");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				System.out.println(ar[i]);
			}
		}

	}

}
