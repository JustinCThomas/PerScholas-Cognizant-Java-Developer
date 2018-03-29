import java.util.Scanner;

public class Question4 {
	public static void twoDPlaneMovement(){
		char[][] twoDArray = new char[5][5];
		
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray.length; j++) {
				twoDArray[i][j] = 'O';
			}
		}
		twoDArray[0][0] = 'X';
		int[] pos = {0, 0};
		
		
		while(true){
			System.out.println("Current Map:");
			System.out.println("=========");
			for (int i = 0; i < twoDArray.length; i++) {
				for (int j = 0; j < twoDArray.length; j++) {
					System.out.print(twoDArray[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("=========");
			System.out.println("Which direction would you like to move?");
			
			Scanner input = new Scanner(System.in);
			String direction = input.nextLine();
			
			
			try{
				switch(direction){
				case "up":
					twoDArray[pos[0]][pos[1]] = 'O';
					pos[0] -= 1;
					twoDArray[pos[0]][pos[1]] = 'X';
					break;
				case "down":
					twoDArray[pos[0]][pos[1]] = 'O';
					pos[0] += 1;
					twoDArray[pos[0]][pos[1]] = 'X';
					break;
				case "left":
					twoDArray[pos[0]][pos[1]] = 'O';
					pos[1] -= 1;
					twoDArray[pos[0]][pos[1]] = 'X';
					break;
				case "right":
					twoDArray[pos[0]][pos[1]] = 'O';
					pos[1] += 1;
					twoDArray[pos[0]][pos[1]] = 'X';
					break;
				default:
					System.out.println("Invalid input. Please enter up, down, left, or right.");
			
				}
				
				System.out.println();
			} catch (ArrayIndexOutOfBoundsException e){
				System.out.println();
				System.out.println("Error: You cannot move there from your current position.");
				System.out.println("You have gone out of bounds.");
				System.out.println("Exiting program...");
				break;
			}
			
		}
	}
	
	public static void main(String[] args) {
		twoDPlaneMovement();		
	}
}
