package what_if;

public class WhatIf {
	static int people = 12;
	static int cats = 23;
	static int dogs = 7;
	
	public static void main (String[] args){
//		Checks for which variable is larger and then executes a println statement based on which variable is greater.
		if (people < cats) {
			System.out.println("Too many cats! The world is doomed!");
		} else if (people > cats) {
			System.out.println("Too few cats! The world is saved for another day!");
		}
		
//		Checks for which variable is larger and then executes a println statement based on which variable is greater.
		if (people < dogs) {
			System.out.println("Too many cats! The world is doomed!");
		} else if (people > dogs) {
			System.out.println("Too few cats! The world is saved for another day!");
		}
	}
}
	