
public class Question7 {
	public static void firstSet() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(8);	
			}
			System.out.println();
		}
	}
	
	public static void secondSet() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; (j + i) < 4; j++) {
				System.out.print(8);	
			}
			System.out.println();
		}
	}
	
	public static void thirdSet() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; (j + i) < 5; j++) {
				System.out.print(" ");	
			}
			System.out.print(8);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		firstSet();
		System.out.println("///////////////////////");
		
		secondSet();
		System.out.println("///////////////////////");
		
		thirdSet();
	}
}
