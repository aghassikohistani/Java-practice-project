package javaCollectionsConcept;

import java.util.PriorityQueue;

public class QuePractice {

	public static void main(String[] args) {

		PriorityQueue<String> q = new <String>PriorityQueue();

		q.add("Aghassi");
		q.add("Kohistani");
		q.add("Seattle");
		q.add("Washington");
		q.add("United States of America");

		System.out.println(q.peek());// if the queue is empty it will throw an exception
		// System.out.println(q); //if the queue is empty it will return null
		q.getClass();

	}

}
