import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		char[][] twoDArray = new char[3][3];
		
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray.length; j++) {
				twoDArray[i][j] = ' ';
			}
		}
		
		int turnNumber = 1;
		int completionTest = 0;
		
		
		while (completionTest < 9) {
			completionTest = 0;
			
			Scanner input = new Scanner(System.in);
			System.out.println();
			System.out.println("Where do you want to place your mark?");
			System.out.println("Use this format: (x, y).");
			String [] arr = input.nextLine().split(",");
			int x = Integer.parseInt(arr[0].trim());
			int y = Integer.parseInt(arr[1].trim());
			
			if ((turnNumber % 2 == 0)) {
				if (twoDArray[x][y] == ' ') {
					twoDArray[x][y] = 'X';
				}
				turnNumber++;
			} else {
				if (twoDArray[x][y] == ' ') {
					twoDArray[x][y] = 'Y';
				}
				turnNumber++;
			}
			
			System.out.println("Current Board: ");
			System.out.println();
			for (int i = 0; i < twoDArray.length; i++) {
				for (int j = 0; j < twoDArray.length; j++) {
					System.out.print(twoDArray[i][j] + " ");
					if (twoDArray[i][j] != ' ') {
						completionTest++;
					}
				}
				System.out.println();
			}
			
		}
		
		System.out.println();
		System.out.println("The 2D array has been completely filled!");
		
	}
}
