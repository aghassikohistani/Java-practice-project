package javaCollectionsConcept;

import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {

		LinkedList<String> l = new LinkedList<String>();

		l.add("Japan");
		l.add("Korea");
		l.add("Iran");
		l.add("China");
		l.add("India");

		l.set(2, "Afghanistan");

		l.set(0, "Pakistan");
		l.addFirst("Germany");
		System.out.println(l);
	}

}
