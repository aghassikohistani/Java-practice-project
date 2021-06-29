package randomJavaPractice;

public class DupArray {

	public static void main(String[] args) {

		String[] states = { "WA", "TX", "CA", "WA", "CA" };

		for (int i = 0; i < states.length; i++) {
			for (int j = i + 1; j < states.length; j++) {
				if (states[i].equals(states[j])) {
					System.out.println(states[i]);
				}
			}
		}
	}

}
