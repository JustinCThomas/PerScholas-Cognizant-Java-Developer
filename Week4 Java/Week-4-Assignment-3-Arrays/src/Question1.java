import java.util.Arrays;

public class Question1 {
	public static void main(String[] args) {
		int[] intArray = new int[10];
		intArray[0] = 4;
		intArray[1] = 14;
		intArray[2] = 24;
		intArray[3] = 34;
		intArray[4] = 44;
		intArray[5] = 54;
		intArray[6] = 64;
		intArray[7] = 74;
		intArray[8] = 84;
		intArray[9] = 94;
		int[] secondIntArray = new int[10];
		secondIntArray = Arrays.copyOf(intArray, intArray.length);
		for (int num: intArray) {
			System.out.println("intArray: " + num);
		}
		
		System.out.println();
		
		for (int num: secondIntArray) {
			System.out.println("secondIntArray: " + num);
		}
	}
}
