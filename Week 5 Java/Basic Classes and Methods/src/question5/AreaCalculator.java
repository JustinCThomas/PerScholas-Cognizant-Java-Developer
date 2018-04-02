package question5;

import java.util.Scanner;

public class AreaCalculator {
	private static double area_circle(double radius) {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	private static int area_rectangle(int length, int width) {
		int area = length * width;
		return area;
	}
	
	private static int area_square(int side) {
		int area = (int) Math.pow(side, 2);
		return area;
	}
	
	private static double area_triangle(double base, double height) {
		double area = 0.5 * base * height;
		return area;
	}
	
	public static String[] chooseMethod() {
		double area = 0;
		String shape = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Which object would you like to get the area of?");
		System.out.println("Here are your choices:");
		System.out.println("1: circle");
		System.out.println("2: rectangle");
		System.out.println("3: square");
		System.out.println("4: triangle");
		
		int choice = input.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Please enter a value for the circle radius.");
			double radius = input.nextDouble();
			shape = "cirlce";
			area = area_circle(radius);
			break;
		case 2:
			System.out.println("Please enter the length of the rectangle.");
			int length = input.nextInt();
			System.out.println("Please enter the width of the rectangle.");
			int width = input.nextInt();
			shape = "rectangle";
			area = area_rectangle(length, width);
			break;
		case 3:
			System.out.println("Please enter the length of the square side.");
			int side = input.nextInt();
			shape = "square";
			area = area_square(side);
			break;
		case 4:
			System.out.println("Please enter a value for the triangle height.");
			double height = input.nextDouble();
			System.out.println("Please enter a value for the triangle base.");
			double base = input.nextDouble();
			shape = "triangle";
			area = area_triangle(height, base);
			break;
		default:
			System.out.println("Sorry, please enter 1, 2, 3, or 4.");
			break;
		}
		area = Math.round(area * 100.0) / 100.0;
		String arr[] = new String[2];
		arr[0] = shape;
		arr[1] = Double.toString(area);
		input.close();
		return arr;
	}
}
