package com.bridgelabz.BirdsSanctuary;

import java.util.ArrayList;

//model layer // data layer (CRUD class)
public class BirdRepository {
	
	private ArrayList<Bird> birdList = new ArrayList<Bird>();
	
	public ArrayList getBirdList() {
		return birdList;
	}

	public void add(Bird bird) {
		birdList.add(bird);
	}

}
