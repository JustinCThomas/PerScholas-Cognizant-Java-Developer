package question6;

public class RunQ6 {
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			 if (DivisibleBy.iseven(i)) {
				 System.out.println(i + " <");
			 }
			 if (DivisibleBy.isDivisibleBy3(i)) {
				 System.out.println(i + " =");
			 } 
			 if (!DivisibleBy.iseven(i) && !DivisibleBy.isDivisibleBy3(i)) {
				 System.out.println(i);
			 }
		}
	}
	
}
