package oopsJava;

public class DuplicatesInAnArrayKoni {

	public static void main(String[] args) {

		String[] info = new String[] { "Aghassi", "Saviz", "Rommel", "Aghassi", "Saviz" };

		System.out.println("Duplicate Elements are ");

		for (int i = 0; i < info.length; i++) {

			for (int j = i + 1; j < info.length; j++) {

				if (info[i].equals(info[j]))

					System.out.println(info[j]);
			}
		}

	}

}
