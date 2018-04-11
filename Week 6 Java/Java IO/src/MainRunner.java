import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MainRunner {
	public static void main(String[] args) {
//		Part 1
		System.out.println("Part 1:");
		IOMethods.printLetter();
		System.out.println("The method has finished running.\r\n");
		
//		Part 2
		System.out.println("Part 2:");
		String path = System.getProperty("user.dir") + "\\letter.txt";
		File file1 = new File(path);
		try {
			IOMethods.printToFile(file1);
		} catch (IOException e) {
			System.out.println("Uh Oh. It looks like there was an error.");
			e.printStackTrace();
		} finally {
			System.out.println("The method has finished running.\r\n");
		}
		

//		Part 3
		System.out.println("Part 3:");
		Scanner sc = new Scanner(System.in);
		String scorePath = System.getProperty("user.dir") + "\\score.txt";
		File scoreFile = new File(scorePath);
		try {
			IOMethods.storeName(scoreFile, sc);
		} catch (IOException e) {
			System.out.println("Uh Oh. It looks like there was an error.");
			e.printStackTrace();
		} finally {
		System.out.println("The method has finished running.\r\n");
		}
		
//		Part 4
		System.out.println("Part 4:");
		String nums1Path = System.getProperty("user.dir") + "\\nums1.txt";
		File nums1File = new File(nums1Path);
		try {
			IOMethods.readIntegersFromFile(nums1File);
		} catch (IOException e) {
			System.out.println("Uh Oh. It looks like there was an error.");
			e.printStackTrace();
		} finally {
			System.out.println("The method has finished running.\r\n");
		}
		
//		Part 5
		System.out.println("Part 5:");
		Scanner scan = new Scanner(System.in);
		IOMethods.chooseFile(scan);
		System.out.println("The method has finished running.\r\n");
		
//		Part 6
		System.out.println("Part 6:");
		Scanner cipherScan = new Scanner(System.in);
		
		try {
			IOMethods.chooseCipherFile(cipherScan);
		} catch (IOException e) {
			System.out.println("Uh Oh. It looks like there was an error.");
			e.printStackTrace();
		} finally {
			System.out.println("The method has finished running.\r\n");
		}
		
//		Part 7
		System.out.println("Part 7:");
		String crazyTextPath = System.getProperty("user.dir") + "\\CrazyText.txt";
		File crazyTextFile = new File(crazyTextPath);
		
		String crazyTextModifiedPath = System.getProperty("user.dir") + "\\CrazyTextModified.txt";
		File crazyTextModifiedFile = new File(crazyTextModifiedPath);
		
		try {
			IOMethods.capitalizeVowelsInFile(crazyTextFile, crazyTextModifiedFile);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("The method has finished running.\r\n");
		}
	}
}
