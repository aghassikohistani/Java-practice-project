package randomJavaPractice;

public class DuplicatePractice {

	public static void main(String[] args) {

		String[] drinks = { "Redbull", "tea", "wine", "Redbull", "tea" };

		for (int i = 0; i < drinks.length; i++) {
			for (int j = i + 1; j < drinks.length; j++) {
				if (drinks[i].equals(drinks[j])) {
					System.out.println(drinks[i]);
				}
			}
		}

	}

}
