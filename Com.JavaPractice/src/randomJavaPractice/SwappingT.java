package randomJavaPractice;

public class SwappingT {

	public static void main(String[] args) {

		int i = 100;
		int j = 200;

		System.out.println("Before Swapping" + i + " " + j);

		i = i + j;
		j = i - j;
		i = i - j;

		System.out.println("After Swapping" + i + " " + j);

	}

}
