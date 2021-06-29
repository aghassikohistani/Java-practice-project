package methodPractice;

public class FirstMethod {

	public int sum(int a, int b) {

		int c = a + b;
		return c;

	}

	public static void main(String[] args) {

		FirstMethod add = new FirstMethod();

		int result = add.sum(32, 44);
		System.out.println(result);
		int jam = add.sum(89, 99);
		System.out.println(jam);
	}

}
