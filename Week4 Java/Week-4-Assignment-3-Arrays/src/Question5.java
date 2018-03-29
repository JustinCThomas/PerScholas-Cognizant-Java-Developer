import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a list of words separated by commas (,) ");
		String[] arr = input.nextLine().split(",");
		
		for (String str: arr) {
			str = str.trim();
			System.out.println(str);
		}
	}
}
