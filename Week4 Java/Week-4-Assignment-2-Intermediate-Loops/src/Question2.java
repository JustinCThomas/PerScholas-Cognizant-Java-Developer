import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer:");
		int num = input.nextInt();
		
		
		do {
			if (num <= 0) {
				System.out.println("HEY! That's against the rules.");
			} else if (num % 2 == 1) {
				num = num + 1;
				num = num / 2;
				System.out.println(num);
			} else {
				num = num / 2;
				System.out.println(num);
			}
		} while (num > 1);
		
	}
}
