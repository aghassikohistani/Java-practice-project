package palindromePractice;

public class PalindreomMatimMethod {

	public static boolean isPalindrome(int number) {
		// first we have to convert our given number to string
		String convertNum = String.valueOf(number);

		return convertNum.equals(new StringBuilder(convertNum).reverse().toString());
		// we are reversing our converted value and converting it to string
	}

	public static String isPalindrome(String name) {
		// reversed the name and stored it in reversedName
		String reversedName = new StringBuffer(name).reverse().toString();

		if (name.equals(reversedName)) {
			return name + " is palindrome";

		} else {
			return name + " is not a palindrome";
		}
	}

	public static void main(String[] args) {

		System.out.println(isPalindrome(" tom" + ""));

		System.out.println(isPalindrome(565));

	}

}
