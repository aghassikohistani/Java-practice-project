package duplicateCharcterPractice;

public class ArrayParrayTarraySarray {

	public static void main(String[] args) {

		String[] ex = { "Sodaba", "Amandeep", "Karima", "Shikha", "Amandeep", "Sodaba" };

		for (int i = 0; i < ex.length; i++) {
			for (int j = i + 1; j < ex.length; j++) {
				if (ex[j].equals(ex[i])) {
					System.out.println(ex[i]);
				}
			}
		}

	}

}
