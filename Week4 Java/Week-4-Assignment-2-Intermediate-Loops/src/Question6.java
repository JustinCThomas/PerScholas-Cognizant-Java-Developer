import java.util.Scanner;

public class Question6 {
	
	public static void evalSimpleExpression() {
		
		while (true) {
			double num1 = 0;
			String operator = "";
			double num2 = 0;
			
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter a simple 2 number equation:");
			
			String fullLine = input.nextLine();
			System.out.println(fullLine);		
			
			try {
				if (Double.parseDouble(fullLine)  == 0) {
				System.out.println("Exit Program.");
				break;
				}
			}
			catch (NumberFormatException e) {
				String[] splitString = fullLine.split("\\s+");
				num1 = Double.parseDouble(splitString[0]);
				operator = splitString[1];
				num2 = Double.parseDouble(splitString[2]);
//				System.out.println("Error: " + e);
			}

			switch (operator) {
			case "+":
				System.out.println(num1 + num2);
				break;
			case "-":
				System.out.println(num1 - num2);
				break;
			case "*":
				System.out.println(num1 * num2);
				break;
			case "/":
				System.out.println(num1 / num2);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		evalSimpleExpression();
	}
}
