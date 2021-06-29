package javaCollectionsConcept;

import java.util.LinkedHashSet;

public class LinkedPinked {

	public static void main(String[] args) {

		LinkedHashSet<Object> set = new LinkedHashSet<Object>();

		set.add("Aghassi Kohistani");
		set.add("Mohammad Alam Kohistani");
		set.add("Aziza Kohistani");
		set.add("Afghanistan");
		set.add("Kabul");

		// System.out.println(set.contains("Kabul"));

		System.out.println(set.isEmpty());
	}

}
