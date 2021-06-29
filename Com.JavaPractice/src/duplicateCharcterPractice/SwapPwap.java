package duplicateCharcterPractice;

public class SwapPwap {

	public static void main(String[] args) {

		int n1 = 9000;
		int n2 = 20000;
		System.out.println("Before Swap" + " " + n1 + "-" + n2);
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println("After swap" + " " + n1 + "-" + n2);
	}

}
