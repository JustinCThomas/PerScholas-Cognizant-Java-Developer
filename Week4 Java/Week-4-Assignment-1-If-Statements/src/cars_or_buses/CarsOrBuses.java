package cars_or_buses;

public class CarsOrBuses {
	
	public static void main (String args[]) {
		int people = 50;
		int cars = 5;
		int buses = 5;
		
//		An "else if" statement only gets checked when the  preceding "if" statement does not run.
//		An "else" statement only runs when the preceding "if" and "else if" statements fail to run.
		
		if (cars > people){
			System.out.println("We should take the cars");
		} else if (cars < people) {
			System.out.println("We should not take the cars.");
		} else {
			System.out.println("We can't decide.");
		}
		
		if (buses > cars){
			System.out.println("That's too many buses.");
		} else if (buses < cars) {
			System.out.println("Maybe we should take the buses.");
		} else {
			System.out.println("We still can't decide.");
		}
		
		if (people > buses){
			System.out.println("Alright, let's just take the buses");
		} else {
			System.out.println("Let's just take the cars.");
		}
		
	}
}
