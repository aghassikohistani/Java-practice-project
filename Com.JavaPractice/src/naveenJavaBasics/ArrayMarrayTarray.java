package naveenJavaBasics;

public class ArrayMarrayTarray {

	public static void main(String[] args) {

		int[] names = new int[4];

		names[0] = 39;
		names[1] = 33;
		names[2] = 23;
		names[3] = 55;

		for (int i = 0; i < names.length; i++) {
			// System.out.println(names[i]);

			String s = "moon";

			for (int j = s.length() - 1; j >= 0; j--) {
				System.out.println(j);
				System.out.println();
			}

		}

	}

}
