package javaCollections;

import java.util.HashMap;

import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> empData = new HashMap<Integer, String>();

		empData.put(1, "Aghassi");
		empData.put(2, "Rommel");
		empData.put(3, "Martin");
		empData.put(4, "Sadaf");
		empData.put(5, "Helen");

		// System.out.println(empData); // Duplicate Keys are not allowed, Duplicate
		// values are allowed.
		// Hash map is internally using the hashing concept.
		boolean keyNum = empData.containsKey(3);//
		System.out.println(keyNum);
		String key = empData.get(5);
		System.out.println(key);
		System.out.println(empData.keySet());
		System.out.println(empData.values());

		for (int e : empData.keySet()) { // in order to print the individual keys simply call the key set method and
											// loop through it using for each loop and print them.

			System.out.println(e + " " + empData.get(e)); // if you want to loop through it, it can be done like this
															// for
															// both key and value....
		}
		for (String e : empData.values()) { // in order to print the values simply call the get value method using a for
											// each
											// loop through it using for each loop and print them.
			System.out.println(e);
		}

	}

}
