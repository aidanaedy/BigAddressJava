package com.aa.bigass;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

	// to select one of the listed functions.
	public static void menu() {
		Scanner user_scan = new Scanner(System.in);
		System.out.println("Your Choice of Menu is:- #");
		Data.setusers_choice(user_scan.nextInt());
		// Data.setusers_choice(Integer.parseInt(System.console().readLine()));
		int userChoice = Data.getusers_choice();
		System.out.println();

		switch (userChoice) {
			case 1:
				// add function to add new entries
				user_scan.close();
				Add.add();
				break;
			case 2:
				// delete function is to be added here
				user_scan.close();
				break;
			case 3:
				// display function to show all the entries
				Display.display();
				user_scan.close();
				break;
			case 4:
				// find menu function is to be added here
				user_scan.close();
				break;
			case 5:
				// to exit the menu and system
				user_scan.close();
				break;
			default:
				System.out.println("You Have Made An Incorrect Choice");
				user_scan.close();
		}
	}// ********************** END MAIN MENU FUNC. *********************
}
