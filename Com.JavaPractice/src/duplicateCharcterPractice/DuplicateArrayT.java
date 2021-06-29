package duplicateCharcterPractice;

public class DuplicateArrayT {

	public static void main(String[] args) {

		String[] girls = { "Sonia", "Neha", "Shikha", "Sonia", "Aman", "Shikha", "Aman" };
		System.out.println("the duplicate values are");
		for (int i = 0; i < girls.length; i++) {
			for (int j = i + 1; j < girls.length; j++) {
				if (girls[i].equals(girls[j])) {
					System.out.println(girls[j]);
				}
			}
		}

	}

}
