package randomJavaPractice;

public class RecursiveFunction {

	public static void main(String[] args) {

		number(1);
	}

	public static void number(int num) {

		if (num <= 100) {
			System.out.println(num);
			num++;
			number(num);

		}

	}

}
