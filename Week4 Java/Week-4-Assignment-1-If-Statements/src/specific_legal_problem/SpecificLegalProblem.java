package specific_legal_problem;

import java.util.Scanner;

public class SpecificLegalProblem {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = input.nextLine();
		System.out.println("Hello " + name + ", how old are you?");
		int age = input.nextInt();
		
		if (age < 16) {
			System.out.println("You can't drive, " + name + ".");
		} else if (age < 18) {
			System.out.println("You can't vote, " + name + ".");
		} else if (age < 25) {
			System.out.println("You can't rent a car, " + name + ".");
		} else {
			System.out.println("You can do anything that's legal. Good for you " + name + "!");
		}
		input.close();
		
				
	}
}
