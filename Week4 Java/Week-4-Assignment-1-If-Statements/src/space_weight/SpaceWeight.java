package space_weight;

import java.util.Scanner;

public class SpaceWeight {
	
	public static void calcWeight() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your current Earth weight in lbs?");
		int weight = input.nextInt();	
		System.out.println("Here are the other planets that you can visit and the strength of their gravity relative to Earth:");
		System.out.println("1 (Venus) -> 0.78");
		System.out.println("2 (Mars) -> 0.39");
		System.out.println("3 (Jupiter) -> 2.65");
		System.out.println("4 (Saturn) -> 1.17");
		System.out.println("5 (Uranus) -> 1.05");
		System.out.println("6 (Neptune) -> 1.23");
		System.out.println("Which planet are you visiting today?");
		int planet = input.nextInt();
		String planetName = "";
		double weightOnOtherPlanet = 0;
		
		switch (planet) {
		case 1:
			planetName = "Venus";
			weightOnOtherPlanet = weight *  0.78;
			break;
		case 2:
			planetName = "Mars";
			weightOnOtherPlanet = weight *  0.39;
			break;
		case 3:
			planetName = "Jupiter";
			weightOnOtherPlanet = weight *  2.65;
			break;
		case 4:
			planetName = "Saturn";
			weightOnOtherPlanet = weight *  1.17;
			break;
		case 5:
			planetName = "Uranus";
			weightOnOtherPlanet = weight *  1.05;
			break;
		case 6:
			planetName = "Neptune";
			weightOnOtherPlanet = weight *  1.23;
			break;
		}
		
		System.out.println("Your weight would be " + weightOnOtherPlanet + " on planet " + planetName + ".");
		
	}
	
	
	public static void main(String[] args) {
		
		calcWeight();
	}
}
