package com.aa.bigass;

//import java.io.IOException;
import java.util.Scanner;

public class Menu {

	// to select one of the listed functions.
	public static void menu() {
		Scanner userScan = new Scanner(System.in);
		System.out.println("Your Choice Of Menu Is:- #");
		Data.setUsersChoice(userScan.nextInt());
		// Data.setusers_choice(Integer.parseInt(System.console().readLine()));
		int userChoice = Data.getUsersChoice();
		// user_scan.close();
		System.out.println();

		switch (userChoice) {
			case 1:
				// add function to add new entries
				Add.add();
				break;
			case 2:
				// delete function is to be added here
				Delete.delete();
				break;
			case 3:
				// display function to show all the entries
				Display.display();
				break;
			case 4:
				// find menu function is to be added here
				Find.find();
				break;
			case 9:
				// to exit the menu and system
				break;
			default:
				System.out.println("You Have Made An Incorrect Choice");
		}
	}// ********************** END MAIN MENU FUNC. *********************
}
