package question4;

public class Pythagorean {
	public static double getHypotenuseLength(double side1, double side2) {
		double c = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
		return c;
	}
}
