package javaCollections;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceConcept {

	public static void main(String[] args) {

		// 1) Duplicate elements are not allowed and insertion order is not preserved..
		// 2) It also uses the concept of hash code, so search will happen very fast..

		Set<String> v = new HashSet<String>(); // the default capacity is 16, load factor 0.75

		v.add("Aghassi");
		v.add("Rommel");
		v.add("martin");

		for (String e : v) {
			if (e.contains("Aghassi")) {
				System.out.println("he is the boss mind it");

				int size = v.size();
				System.out.println(size);

			}
		}

		// System.out.println(v);
		// v.stream().forEach(e -> System.out.println(e));

//		for (String e : v) {
//			System.out.println(e);
//		}

		boolean name = v.contains("martin");
		System.out.println(name);
	}

}
