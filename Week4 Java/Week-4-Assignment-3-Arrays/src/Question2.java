import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		int[] intArray = {0, 5, 10, 15, 20, 15, 64, 30, 15, 40};
		for (int num: intArray) {
			System.out.println(num);
		}
		
		Scanner input = new Scanner(System.in);
		boolean foundValue = false;
		
		System.out.println("Enter an integer and see if it is in the array:");
		int guess = input.nextInt();
		int counter = 0;
		for (int num: intArray) {
			if (guess == num) {
				System.out.println("I found " + num + " at position " + counter + ".");
				foundValue = true;
			}
			counter++;
		}
		if (foundValue == false) {
			System.out.println("The entered number " + guess + " could not be found in the array.");
		}
	}
}
