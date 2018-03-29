package day_of_the_week;

import java.util.Scanner;

public class DayOfTheWeek {

	public static String getDayOfWeek() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer (1-7):");
		int day = input.nextInt();
		
		String dayAsString;
		switch (day) {
		case 1:
			dayAsString = "Monday";
			return dayAsString;
		
		case 2:
			dayAsString = "Tuesday";
			return dayAsString;
		
		case 3:
			dayAsString = "Wednesday";
			return dayAsString;
			
		case 4:
			dayAsString = "Thursday";
			return dayAsString;
			
		case 5:
			dayAsString = "Friday";
			return dayAsString;
			
		case 6:
			dayAsString = "Saturdar";
			return dayAsString;
			
		case 7:
			dayAsString = "Sunday";
			return dayAsString;
			
		default:
			dayAsString = "Error";
			return dayAsString;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(getDayOfWeek());
	}

}
