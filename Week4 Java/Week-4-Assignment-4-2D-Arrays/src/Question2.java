import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		int[][] twoDArray = new int[3][3];
		
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray.length; j++) {
				twoDArray[i][j] = (int) (Math.random() * 100);
				System.out.print(twoDArray[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Which column would you like to get the sum of? (0, 1, or 2)");
		
		
		
		while(true){
			Scanner input = new Scanner(System.in);
			int columnNumber = input.nextInt();
			int total = 0;
			
			switch (columnNumber) {
			case 0:
				total = twoDArray[0][0] + twoDArray[1][0] + twoDArray[2][0];
				System.out.println("The total for column " + columnNumber + " is " + total + ".");
				break;
			case 1:
				total = twoDArray[0][1] + twoDArray[1][1] + twoDArray[2][1];
				System.out.println("The total for column " + columnNumber + " is " + total + ".");
				break;
			case 2:
				total = twoDArray[0][2] + twoDArray[1][2] + twoDArray[2][2];
				System.out.println("The total for column " + columnNumber + " is " + total + ".");
				break;
			default:
				System.out.println("Sorry, this array only has columns 0, 1, and 2.");
				System.out.println("Please choose again.");
				System.out.println();
				System.out.println("Which column would you like to get the sum of? (0, 1, or 2)");
			}
		}
		
	}
}
