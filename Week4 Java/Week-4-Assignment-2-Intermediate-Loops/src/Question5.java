
public class Question5 {
	
	public static void method1() {
		for (int i = 10; i <= 20; i = i + 2) {
			if (i == 16) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	public static void method2() {
		for (int i = 10; i <= 20; i++) {
			if (i == 16 || i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	public static void method3() {
		int i = 10;
		while (true) {
			
			if (i == 16) {
				i += 2;
				continue;
			}			
			
			System.out.println(i);
			if (i >= 20) {
				break;
			}
			
			i += 2;
		}
	}
	
	public static void main(String[] args) {
		method1();
		System.out.println();
		
		method2();
		System.out.println();
		
		method3();
	}
}
