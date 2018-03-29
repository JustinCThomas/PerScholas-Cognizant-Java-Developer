
public class Question1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			String fizzy = "";
			if( i % 3 == 0) {
				fizzy = fizzy + "Fizz";
			}
			if( i % 5 == 0) {
				fizzy = fizzy + "Buzz";
			}
			if (fizzy == "") {
				System.out.println(i);
			} else {
				System.out.println(fizzy);
			}
		}
	}
}
