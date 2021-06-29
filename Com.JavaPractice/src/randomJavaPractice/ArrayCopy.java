package randomJavaPractice;

public class ArrayCopy {

	public static void main(String[] args) {

		int[] num1 = new int[] { 2, 3, 4, 5, 6, 7, 8 };
		int[] num2 = new int[num1.length];

		 for (int i = 0; i < num1.length; i++) {
			num2[i] = num1[i];
		}
		for (int i = 0; i < num2.length; i++) {
			System.out.print(num2[i] + " ");
		}

	}

}
