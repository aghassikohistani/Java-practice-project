package naveenJavaBasics;

import java.util.ArrayList;

public class ArrayListStream {

	public static void main(String[] args) {

		ArrayList<Object> factory = new ArrayList<Object>();

		factory.add("Kohistani Steel");
		factory.add("Seattle Washington");
		factory.add(232323);
		factory.add("aghassi");
		factory.add("aghassi");
		factory.add("aghassi");

		factory.stream().filter(e -> e.equals("aghassi")).forEach(e -> System.out.println(e));
		// factory.stream().forEach(e -> System.out.println(e));
		// factory.parallelStream().forEach(e -> System.out.println(e));

		// factory.stream().filter(e -> e.equals("aghassi")).forEach(e ->
		// System.out.println(e));

	}

}
