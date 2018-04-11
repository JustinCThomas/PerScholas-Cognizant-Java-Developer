import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IOMethods {
	public static String createLetter() {
		String str = ("+----------------------------------------------------------------+\r\n"
					+ "|                                                           #### |\r\n"
					+ "|                                                           #### |\r\n"
					+ "|                                                           #### |\r\n"
					+ "|                                                                |\r\n"
					+ "|                                                                |\r\n"
					+ "|                                            Justin Thomas       |\r\n"
					+ "|                                            42 Times Square     |\r\n"  
					+ "|                                            NYC, NY 11500       |\r\n" 
					+ "|                                                                |\r\n"
					+ "+----------------------------------------------------------------+");
		return str;
	}
	
	public static void printLetter() {
		System.out.println(createLetter());
	}
	
	public static void printToFile(File file) throws IOException {
		String str = createLetter();
		FileWriter outputStream = null;
		try {
			outputStream = new FileWriter(file);
			outputStream.write(str);
		}  finally {
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}
	
	public static void storeName(File file, Scanner sc) throws IOException {
		String str = "";
		
		System.out.println("Please enter your name: ");
		String name = sc.next();
		System.out.println("Please enter an integer: ");
		int number = sc.nextInt();
		str = String.format("%s got a %s in the Math test.", name, number);
		
		FileWriter outputStream = null;
		
		try {
			outputStream = new FileWriter(file);
			outputStream.write(str);
		} finally {
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}
	
	public static void readIntegersFromFile(File file) throws IOException {
		
		Scanner s = null;
		BufferedReader bufferStream = null;
		FileReader inputStream = null;
		
		List<Integer> threeNums = new ArrayList<Integer>(3);
		int total = 0; 
		
		try {
			inputStream = new FileReader(file);
			bufferStream = new BufferedReader(inputStream);
			s = new Scanner(bufferStream);
			
			int counter = 0;
			while (s.hasNext() && counter < 3) {
				threeNums.add(s.nextInt());
				counter++;
			}
		} finally {
			if (s != null) {
				s.close();
				for (int num: threeNums) {
					total += num;
				}
				System.out.println("The total of the 3 integers is " + total + ".");
			}
		}
	}
	
	public static void chooseFile(Scanner sc) {
		System.out.println("Please choose a file to open and parse:\r\n"
				+ "2: nums2.txt\r\n"
				+ "3: nums3.txt\r\n"
				+ "4: nums4.txt\r\n");
		
		int choice = sc.nextInt();
		String chosenPath = "";
		
		switch(choice) {
		case 2:
			System.out.println("2 has been chosen.\r\n");
			break;
		case 3:
			System.out.println("3 has been chosen.\r\n");
			break;
		case 4:
			System.out.println("4 has been chosen.\r\n");
			break;
		default:
			System.out.println("Only 2, 3, and 4 are valid options.\r\n"
					+ "Please try again next time.");
			return;
		}
		
		chosenPath = System.getProperty("user.dir") + "\\nums" + choice + ".txt";
		File chosenFile = new File(chosenPath);
		
		try {
			readIntegersFromFile(chosenFile);
		} catch (IOException e) {
			System.out.println("Uh Oh. It looks like there was an error.");
			e.printStackTrace();
		}
	}
	
	
	
	public static void chooseCipherFile(Scanner sc) throws IOException {
		System.out.println("Please choose a file to open and parse:\r\n"
				+ "1: puzzle.txt\r\n"
				+ "2: puzzle2.txt\r\n");
		
		int choice = sc.nextInt();
		String chosenPath = "";
		
		switch(choice) {
		case 1:
			System.out.println("1 has been chosen.\r\n");
			chosenPath = System.getProperty("user.dir") + "\\puzzle.txt";
			break;
		case 2:
			System.out.println("2 has been chosen.\r\n");
			chosenPath = System.getProperty("user.dir") + "\\puzzle2.txt";
			break;
		default:
			System.out.println("Only 1 and 2 are valid options.\r\n"
					+ "Please try again next time.");
			return;
		}
		
		BufferedReader bufferStream = null;
		FileReader inputStream = null;
		File chosenFile = new File(chosenPath);
		String message = "";
		
		try {
			inputStream = new FileReader(chosenFile);
			bufferStream = new BufferedReader(inputStream);
			
			int counter = 1;
			while (bufferStream.ready()) {
				
				if (counter == 3) {
					message += (char) bufferStream.read();
					counter = 0;
				} else {
					bufferStream.read();
				}
				counter++;
			}
		} finally {
			if (bufferStream != null) {
				bufferStream.close();
				System.out.println("The secret message is:");
				System.out.println(message);
			}
		}
	}
	
	public static void capitalizeVowelsInFile(File inputFile, File outputFile) throws IOException {
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		
		BufferedReader bufferStream = null;
		FileReader inputStream = null;
		FileWriter outputStream = null;
		
		inputStream = new FileReader(inputFile);
		bufferStream = new BufferedReader(inputStream);
		
		try {
			outputStream = new FileWriter(outputFile);	
			
			while (bufferStream.ready()) {
				char c = (char) bufferStream.read();
				boolean isVowel = false;
				
				for (char vowel: vowels) {
					if (vowel == Character.toLowerCase(c)) {
						outputStream.write(Character.toUpperCase(c));
						isVowel = true;
						break;
					}
				}
				if (!isVowel) {
					outputStream.write(c);
				}
				
			}
		} finally {
			if (bufferStream != null) {
				bufferStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}
	
}
