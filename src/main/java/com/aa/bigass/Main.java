package com.aa.bigass;

import java.io.IOException;

public class Main {
	static int first_pass;

	public static void main(String[] args) throws IOException {

		if (first_pass < 1) {
			// calling the FileIn java file to read the stored data
			FileIn.fileIn();
			// calling the Credits java file to display the credits at the start
			Credits.credits();
			first_pass = 3;
		}
		int count = Data.getCount();
// 				+ "*	 E-MAIL ADDRESS BOOK PROGRAM 		*\n"
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
			Menu.menu();

		} while (Data.getusers_choice() != 5);
		// when the choice is 5, exit the program
		// while (users_choice != 5);

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
