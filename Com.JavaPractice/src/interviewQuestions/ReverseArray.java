package interviewQuestions;

public class ReverseArray {

	public static void main(String[] args) {

		int[] array1 = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("the original array is:");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i]);
		}

		System.out.println();

		System.out.println("the reversed array is: ");

		for (int j = array1.length - 1; j >= 0; j--) {
			System.out.print(array1[j]);
		}

	}

}
