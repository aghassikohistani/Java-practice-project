package oopsJava;

import java.util.ArrayList;

public class ArraListPractice {

	public static void main(String[] args) {

		ArrayList <String> al = new ArrayList <String> ();

		al.add("Aghassi");
		al.add("Kohistani");
		al.set(1, "Kabuli");
		System.out.println(al.get(0));

		System.out.println(al);

	}

}
