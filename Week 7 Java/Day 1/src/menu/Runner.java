package menu;

import java.sql.SQLException;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		boolean isRunning = true;
		
		while (isRunning) {
			System.out.println("Menu: "
					+ "\r\n1. Register "
					+ "\r\n2. Login "
					+ "\r\n3. Update Info"
					+ "\r\n4. Quit ");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				Menu.register(sc);
				break;
			case 2:
				Menu.login(sc);
				break;
			case 3:
				Menu.updateInfo(sc);
				break;
			case 4:
				isRunning = Menu.quit();
				break;
			default:
				System.out.println("Sorry the only valid options are 1, 2, 3, and 4.\r\n");
			}
		}
		
	}

}
