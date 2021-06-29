package naveenJavaBasics;

public class ArrayDuplicateUsingObject {

	public static void main(String[] args) {

		Object[] ar = { "Shikha", 22, "Amandeep", 33, 44, 22, "Amandeep", "Shikha", 33 };

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i].equals(ar[j])) {
					System.out.println(ar[i]);
				}
			}

		}

	}
}
