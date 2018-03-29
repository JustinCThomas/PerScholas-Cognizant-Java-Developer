import java.util.Scanner;

public class Question4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the maximum x?");
		int x = input.nextInt();
		System.out.println("What is the maximum y?");
		int y = input.nextInt();
		
		if (x >=0 && y >= 0) {
			System.out.println("Here are your possible coordinates:");
		}
		
		for (int i = 0; i <= x; i++) {
			for (int j = 0; j <= y; j++) {
				System.out.println("(" + i + "," + j + ")");
			}
		}
	}
}
