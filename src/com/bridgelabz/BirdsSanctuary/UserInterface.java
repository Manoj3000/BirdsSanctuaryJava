package com.bridgelabz.BirdsSanctuary;

import java.util.*;

//View layer 
public class UserInterface {

	public void printAllBirds(List birdList) {
		for (int i = 0; i < birdList.size(); i++) {
			System.out.println(birdList.get(i).toString());
		}
	}
}
