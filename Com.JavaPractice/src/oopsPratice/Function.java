package oopsPratice;

public class Function {

	public static void main(String[] args) {

		// registration(12, "Aghassi", 'M', true);
		int add = addition(12, 12);
		// System.out.println(add);
		// voterIdCard(23, "Afghan national");
		justLoop(1200);

	}

	public static int addition(int plus, int plus1) {

		return plus + plus1;

	}

	public static void checkIn(int time, String checkIn) {

	}

	public static void voterIdCard(int age, String eligible) {

		if (age >= 18 && eligible.equalsIgnoreCase("Afghan National")) {

			System.out.println("please give him/her a chance");

		}

	}

	public static void registration(int age, String address, char gender, boolean isAfghan) {

		System.out.println("Registration completed");

	}

	public static void justLoop(int num) {

		for (int i = 0; i < num; i++) {

			if (num == 99) {
				System.out.println(num);
				break;

			}
		}

	}

}
