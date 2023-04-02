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
		// + "* E-MAIL ADDRESS BOOK PROGRAM *\n"
		do {
			System.out.println(
					"The Database has " + count + " entries\n"
							+ "\n"
							+ "*** Enter Your Choice of Menu ***\n"
							+ "    ------------------------- \n"
							+ "1.| To Add An Entry.\n"
							+ "2.| To Delete An Entry.\n"
							+ "3.| To Display All Entries.\n"
							+ "4.| To Goto Find Menu.\n"
							+ "5.| To Exit From The Program.");
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
