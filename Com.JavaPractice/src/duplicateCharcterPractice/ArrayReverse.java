package duplicateCharcterPractice;

public class ArrayReverse {

	public static void main(String[] args) {

		int[] z = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("length of the array is " + z.length);
		System.out.println("reverse of an array is");
		for (int i = z.length - 1; i > 0; i--) {
			System.out.print(z[i] + " ");
		}

	}

}
