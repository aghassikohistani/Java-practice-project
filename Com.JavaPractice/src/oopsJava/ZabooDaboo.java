package oopsJava;

public class ZabooDaboo {

	public static void main(String[] args) {

		int[] social = new int[] { 22, 22, 33, 44, 55, 55, 66, };

		for (int i = 0; i < social.length; i++) {
			for (int j = i + 1; j < social.length; j++) {

				if (social[i] == social[j]) {
					System.out.println(social[j]);
				}
			}
		}

	}

}
