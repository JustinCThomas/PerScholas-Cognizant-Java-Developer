import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your message?");
		String message = input.nextLine();
		for (int i = 0; i < message.length(); i++) {
			System.out.println(i + ": '" +  message.charAt(i) + "'" );
		}
	}
}
