package naveenJavaBasics;

public class SloveNumber {

	public static void main(String[] args) {

		String[] fam = { "Aghassi", "Rihana", "Mursal", "Rihana", "Aghassi", };

		for (int i = 0; i < fam.length; i++) {
			for (int j = i + 1; j < fam.length; j++) {

				if (fam[i].equals(fam[j])) {
					System.out.println(fam[i]);
				}
			}
		}

	}

}
