package duplicateCharcterPractice;

public class KuchLogReverse {

	public static void main(String[] args) {

		String m = "Seattle";
		String rev = "";

		for (int i = m.length() - 1; i > 0; i--) {
			rev = rev + m.charAt(i);

		}
		System.out.println("the reversed String is = " + rev);
	}

}
