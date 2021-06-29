package interviewQuestions;

public class PrimeNumber {

	// What is prime number?
	// A number which is divisible by 1 or itself
	// Like 7,11,13,17,19,23.29
	// Which is the biggest number that can divide 28?
	// 14 is the biggest number that can divide 28
	// the smallest number that can divide 28 is 2
	// 14 is half of the number, and after 14 no other number can divide 14

	public static void main(String[] args) {

//what is prime number ?
//which is divisible by 1 or itself

//like 7,11,13,17,19,23,29

//which is the biggest number that can divide 28 ?
//14 is the biggest number that can divide 28,
//14 is the half of the number means after 14 like
//15,16,17,18-------till 27 no one can divide 28

//which is the smallest number that can divide 28 ?
//2 is the smallest number that can divide 28

		int number = 23;
		int half = number / 2; // 23/2----11
		boolean deepak = true;

		for (int i = 2; i < number; i++) // 2 to 11-----10 times
		{
			if (number % i == 0) {
				System.out.println("its not a prime number" + number);
				deepak = false;
				break; // for moving outside the loop
			}
		}
		if (deepak) {
			System.out.println("its a prime number " + number);
		}

	}

}
