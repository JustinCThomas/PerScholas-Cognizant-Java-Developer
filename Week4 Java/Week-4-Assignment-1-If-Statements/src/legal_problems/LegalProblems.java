package legal_problems;

import java.util.Scanner;

public class LegalProblems {
	
	public static void checkAge() {
		Scanner reader = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = reader.nextLine();
		System.out.println("Hello " + name + ", how old are you?");
		int age = reader.nextInt();
		if (age < 16) {
			System.out.println("You can't drive, " + name + ".");
		}
		if (age < 18) {
			System.out.println("You can't vote, " + name + ".");
		}
		if (age < 25) {
			System.out.println("You can't rent a car, " + name + ".");
		} else {
			System.out.println("You can do anything that's legal. Good for you " + name + "!");
		}
		reader.close();
	}
		
	
	public static void main(String[] args) {
		checkAge();
	}
}
