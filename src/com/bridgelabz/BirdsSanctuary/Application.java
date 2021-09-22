package com.bridgelabz.BirdsSanctuary;

import java.util.ArrayList;

//Controller layer
public class Application {

	public static void main(String[] args) {
		System.out.println("Welcome to Birds Sanctuary");
		
		BirdRepository birdList = new BirdRepository();
		
		Duck duck = new Duck();
		Crow crow = new Crow();
		Eagle eagle = new Eagle();
		Penguin penguin = new Penguin();
		Sparrow sparrow = new Sparrow();
		
		birdList.add(duck);
		birdList.add(crow);
		birdList.add(eagle);
		birdList.add(penguin);
		birdList.add(sparrow);

		UserInterface view = new UserInterface();
		
		view.printAllBirds(birdList.getBirdList());
		
	}
}
