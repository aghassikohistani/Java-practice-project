package interviewQuestions;

public class StringReverseWithGivenString {

	public static void main(String[] args) {

		String s = "JavaAndSelenium";

		int len = s.length();
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i); // a
		}

		System.out.println(rev);

	}

}
