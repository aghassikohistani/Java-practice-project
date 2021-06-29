package randomJavaPractice;

public class SwapTwoNumbersUsingThirdVariable {

	public static void main(String[] args) {

		int i = 10;
		int j = 20;
		int temp;
		System.out.println("before swapping..." + i + " " + j);

		temp = i;// 10
		i = j;
		j = temp;

		// System.out.println(j);

		System.out.println("After swapping.." + i + " " + j);

	}

}
