package com.aa.bigass;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	// this will be moved to a data class to clean the main class
	static ArrayList<String> address_book = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		int users_choice = 0;

		// calling the FileIn java file to read the stored data
		FileIn.fileIn();
		// calling the Credits java file to display the credits at the start
		Credits.credits();
		int count = Count.getCount();

		do {
			System.out.println("The Database has " + count + " entries");
			System.out.println();
			System.out.println("*** Enter Your Choice of Menu ***");
			System.out.println("    -------------------------    ");
			System.out.println("1.| To Add An Entry.");
			System.out.println("2.| To Delete An Entry.");
			System.out.println("3.| To Display All Entries.");
			System.out.println("4.| To Goto Find Menu.");
			System.out.println("5.| To Exit From The Program.");

			users_choice = Menu.menu(users_choice);
		}
		// when the choice is 5, exit the program
		while (users_choice != 5);

		// ending messages etc.
		System.out.println("         Thank You For Using The ADDRESS BOOK");
		// calling the Credits java file to display the credits at the end
		Credits.credits();
		System.out.println();
		System.out.println("          You Will Now Return To The Console.");
		// calling the FileOut java file to store the data
		FileOut.fileOut();
	}

}
