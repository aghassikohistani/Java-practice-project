package randomJavaPractice;

public class RecCenter {

	public static void main(String[] args) {

		numberPrint(1);

	}

	public static void numberPrint(int num) {

		if (num <= 10) {
			System.out.println(num);
			num++;
			numberPrint(num);
		}

	}

}
