package question1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RunQ1 {
	public static void printForwards(String ...lines) {
		for (int i = 0; i < lines.length; i++) {
			System.out.println(lines[i]);
		}
	}
	
	public static void printBackwards(String ...lines) {
		for (int i = 0; i < lines.length; i++) {
			for (int j = 0; j < lines[i].length(); j++) {
				System.out.print(lines[i].charAt(lines[i].length() - 1 - j));
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		try {
			
			
			String location = "C:\\Users\\Students\\Desktop\\HWorld.txt";
			File file = new File(location);
			Scanner input = new Scanner(file);
			String line1 = input.nextLine();
			String line2 = input.nextLine();
			String line3 = input.nextLine();
			String line4 = input.nextLine();
			
			printForwards(line1, line2, line3, line4);
			System.out.println();
			printBackwards(line1, line2, line3, line4);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		}
		
	}
}
