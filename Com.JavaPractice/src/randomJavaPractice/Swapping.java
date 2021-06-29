package randomJavaPractice;

public class Swapping {

	public static void main(String[] args) {

		String s = "I will be going to school";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
			
		}
		System.out.println(rev);
	}

}
