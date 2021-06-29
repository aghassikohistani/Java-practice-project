package interviewQuestions;

public class FactorialOfAnumber {

	public static void main(String[] args) {

		int number=4, fact=1;

		for (int i=1; i<=number;i++) {

			fact=fact*i;
		
		}
		
		System.out.println("Factorial of a number " + fact);
	}

}
