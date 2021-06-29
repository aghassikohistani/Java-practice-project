package interviewQuestions;

public class IntegerReverse {

	public static void main(String[] args) {

		int num = 12345; // 54321
		int rev = 0;//so that i can add the reverse number

		while (num != 0) {//start the loop until num is not equal to zero terminate it when it is equal to zero
			rev = rev * 10 + num % 10; // reminder will be 5
			num = num / 10;
		}

		System.out.println("Reverse number is :" + rev);
		// String Buffer method

		long num1 = 123456789;

		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
