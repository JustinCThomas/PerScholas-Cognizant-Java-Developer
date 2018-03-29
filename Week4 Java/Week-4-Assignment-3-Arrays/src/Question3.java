
public class Question3 {
	public static void main(String[] args) {
		int[] intArray = {0, 5, 88, 15, 20, 15, 30, 13, 15, 40};
		
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
		
		int largestNum = Integer.MIN_VALUE; 
		for (int num: intArray) {
			if (largestNum < num) {
				largestNum = num;
			}
		}
		
		int counter2 = 0;
		for (int num: intArray) {
			if (largestNum == num) {
				System.out.println("The largest number in the array is " + largestNum + " and its position is " + counter2 + "." );
			}
			counter2++;
		}
	}
}
