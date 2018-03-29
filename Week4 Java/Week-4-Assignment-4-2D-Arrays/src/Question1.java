
public class Question1 {
	public static void main(String[] args) {
		int[][] twoDArray = new int[3][3];
		int largestNum = Integer.MIN_VALUE;
		
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray.length; j++) {
				twoDArray[i][j] = (int) (Math.random() * 100);
				System.out.print(twoDArray[i][j] + " ");
				if (largestNum < twoDArray[i][j]) {
					largestNum = twoDArray[i][j];
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("The largest number in the 2D array is " + largestNum + ".");
	}
}
