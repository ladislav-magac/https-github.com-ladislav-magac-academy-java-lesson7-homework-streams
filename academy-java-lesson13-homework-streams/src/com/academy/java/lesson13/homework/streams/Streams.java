package com.academy.java.lesson13.homework.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		
		System.out.println(
				Stream
				.iterate(1, A -> A + 1)
				.limit(10000)
				.filter(A -> A % 3 == 0
						  && A % 5 == 0
						  && A % 7 != 0)
				.mapToInt(A -> A)
				.sum());

		Stream
		.iterate(0, A -> A + 2)
		.filter(A -> A % 8 != 0)
		.limit(100)
		.forEach(A -> System.out.println(A));
		
		List<Book> b = new ArrayList<>();
		
		b.add(new Book("Saved: A War Reporter's Mission to Make It Home", 28));
		b.add(new Book("How to Catch a Leprechaun", 8));
		b.add(new Book("Atomic Habits: An Easy & Proven Way to Build Good Habits & Break Bad Ones", 13));
		b.add(new Book("Baking Yesteryear: The Best Recipes from the 1900s to the 1980s", 20));
		b.add(new Book("Daisy Jones & The Six: A Novel", 9));
		b.add(new Book("The Boy, the Mole, the Fox and the Horse", 12));
		b.add(new Book("It Ends with Us: A Novel (1)", 9));
		b.add(new Book("Dog Man: Twenty Thousand Fleas Under the Sea: A Graphic Novel (Dog Man #11): From the Creator of Captain Underpants", 11));
		b.add(new Book("It Starts with Us: A Novel (2) (It Ends with Us)", 10));
		b.add(new Book("Lessons in Chemistry: A Novel", 18));
		
		Stream<Book> list = b.stream();
		
		list
		.filter(A -> A.getPrice() < 100)
		.map(A -> A.getName())
		.sorted()
		.forEach(A -> System.out.println(A));
		
		Stream<Book> list2 = b.stream();
		
		System.out.println(
				list2
				.map(A -> A.getName())
				.filter(A -> A.length() < 5)
				.count());
		
		Stream<Book> list3 = b.stream();
		
		System.out.println(
				list3
				.mapToInt(A -> A.getPrice())
				.average().getAsDouble());
		
		Stream<Book> list4 = b.stream();
		
		System.out.println(
				list4
				.map(A -> A.getPrice())
				.allMatch(A -> A < 500));
		
	}

}
