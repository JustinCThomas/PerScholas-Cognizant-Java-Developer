import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		int[] intArray = {210, 5, 88, 5, 33, 6, 193, 15, 5, 73};
		
		int counter = 0;
		
		System.out.print("{");
		for (int num: intArray) {
		if ( (intArray.length - 1) == counter) {
			System.out.print(num + "}");
		} else {
			System.out.print(num + ", ");
		}
		counter++;
		}
		System.out.println("");
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer that you think is in the array:");
		int searchVal = input.nextInt();
		int numOfAppearances = 0;
		
		for (int num: intArray) {
			if (searchVal == num) {
				numOfAppearances++;
			}
		}
		
		if (numOfAppearances == 1) {
			System.out.println("The value that you entered appeared " + numOfAppearances + " time in the array.");
		} else {
			System.out.println("The value that you entered appeared " + numOfAppearances + " times in the array.");	
		}
		
	}
}
