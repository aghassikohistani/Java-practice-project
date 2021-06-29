package javaCollectionsConcept;

import java.util.HashMap;

public class HashMapPractice {

	public static void main(String[] args) {

		HashMap<Integer, String> m = new HashMap<Integer, String>();

		m.put(33, "Aghassi");
		m.put(12, "Mursal");
		m.put(88, "Rihana");
		m.put(12, "Mursal Jaan");

		// System.out.println(m.entrySet());

		for (int i : m.keySet()) {

			System.out.println(i+ "   " + m.get(i));// to print keys the for each loop should have integer for values it should have
									// String
		}

	}

}
