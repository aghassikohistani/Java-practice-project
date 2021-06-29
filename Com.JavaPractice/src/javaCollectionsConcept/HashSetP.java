package javaCollectionsConcept;

//import java.util.ArrayList;
import java.util.HashSet;

public class HashSetP {

	public static void main(String[] args) {

		HashSet<Object> set = new HashSet<Object>();

		set.add("Kohistani");
		set.add(33);
		set.add("Seattle");
		set.add("Kohistani");
		set.add("Washington");
		set.add("United States Of America");

		if (set.contains("Kohistani")) {
			System.out.println("he is the boss");
		} else {
			System.out.println("he is going to be the next boss");
		}

	}

}
