package com.bootcamp.activity;

import com.bootcamp.activity.Animals.*;

import java.util.ArrayList;

public class AnimalClient {
	public static void main(String[] args) {

		ArrayList<Animal> list = new ArrayList<Animal>();

		list.add(new Dog("Brown", 4, "Pomeranian"));
		list.add(new Dog("Black", 4, "German Shephard"));
		list.add(new Dog("Green", 4, "Pug"));
		list.add(new Dog("Blue", 4, "Dobermann"));

		list.add(new Cat("Black", 4, "Brown"));
		list.add(new Cat("Green", 4, "White"));
		
		//add to the git
		list.add(new Cat("Pink", 2, "White"));
		list.add(new Cat("Pink", 2, "White"));
		list.add(new Cat("Pink", 2, "White"));
		list.add(new Cat("Pink", 2, "White"));
		list.add(new Cat("Pink", 2, "White"));
		list.add(new Cat("Pink", 2, "White"));
		list.add(new Cat("Pink", 2, "White"));

		int catCount = 0;
		int dogCount = 0;

		for (Animal i : list) {

			if (i instanceof Cat)
				catCount++;
			else if (i instanceof Dog)
				dogCount++;
		}
		System.out.println("Number of Cats added : " + catCount);
		System.out.println("Number of Dogs added : " + dogCount);
	}
}
