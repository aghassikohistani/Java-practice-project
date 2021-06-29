package methodPractice;

public class Fuynction {

	public static void main(String[] args) {

		Fuynction fu = new Fuynction();
		String name = fu.getName();
		System.out.println(name);
		int run = fu.getScore();
		System.out.println(run - 4);
		int age = fu.voteEligible(17);
		System.out.println(age);
		fu.greatestNumber(33, 44, 44);
	}

	public String getName() {

		return "Aghassi";
	}

	public int getScore() {
		int runs = 100;
		int wB = 10;
		int total = runs + wB;
		return total;

	}

	public int voteEligible(int age) {
		if (age > 18) {
			System.out.print("let him/her to vote he/she is = " + " ");
		} else {
			System.out.print("put this mother fucker in jail he is " + " ");
		}
		return age;
	}

	public void greatestNumber(int a, int b, int c) {

		if (a > b) {
			System.out.println("a is the greates");

		} else if (b > c) {
			System.out.println("b is the greatest");
		} else if (c > a) {
			System.out.println("c is the greates number");
		} else {
			System.out.println("please do not waste my time");
		}
	}

}
