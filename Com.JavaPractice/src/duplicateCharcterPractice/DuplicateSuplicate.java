package duplicateCharcterPractice;

public class DuplicateSuplicate {

	public static void main(String[] args) {

		String[] country = new String [] { "Japan", "Korea", "USA", "Afghanistan", "Korea", "Afghanistan" };

		for (int i = 0; i < country.length; i++) {
			for (int j = i + 1; j < country.length; j++) {
				if (country[i].equals(country[j])) {
					System.out.println(country[i]);
				}
			}
		}

	}

}
