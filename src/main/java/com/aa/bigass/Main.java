package com.aa.bigass;

import java.io.IOException;

public class Main {
	static int firstPass;

	public static void main(String[] args) throws IOException {

		if (firstPass < 1) {
			// calling the FileIn java file to read the stored data
			FileIn.fileIn();
			// calling the Credits java file to display the credits at the start
			Credits.credits();
			firstPass = 3;
		}
		// int count = Data.getCount();
		do {
			System.out.println(
					"The Database Has " + Data.getCount() + " Entries\n"
							+ "\n"
							+ "*** Enter Your Choice Of Menu ***\n"
							+ "    ------------------------- \n"
							+ "1.| To Add An Entry.\n"
							+ "2.| To Delete An Entry.\n"
							+ "3.| To Display All Entries.\n"
							+ "4.| To Goto Find Menu.\n"
							+ "9.| To Exit From The Program.");
			Menu.menu();

		} while (Data.getUsersChoice() != 9);
		// when the choice is 9, exit the program

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
