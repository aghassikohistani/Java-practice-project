package methodPractice;

public class MinimumAndMaximumNumber {

	public int primeNumber(int age) {

		if (age >= 18) {
			System.out.println("eligable for vote");
		} else if (age < 18) {
			System.out.println("not eligable for vote");

			return age;
		}

		else

			return age;
		return 10;
	}

	public static void main(String[] args) {
     
		MinimumAndMaximumNumber vote = new MinimumAndMaximumNumber();
	    vote.primeNumber(18);
	    System.out.println(vote);
	
	}

}
