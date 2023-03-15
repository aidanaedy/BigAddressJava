package com.aa.bigass;

import java.util.Scanner;

public class Display {

	/*********************************************************************
	 ************************* Display Function ************************
	 *********************************************************************/
	// this method displays all the entries one person at a time until the last
	static void display() {
		int poo = 0;
		int sloo = 1;
		int count = Data.getCount();

		Scanner pause = new Scanner(System.in);
		System.out.println();
		System.out.println("***   This is the " + sloo + " of " + count + " of your Address's stored.   ***");

		// looping through each persons name, age address etc.
		while (sloo < (count + 1)) {
			System.out.println("Name             -  : " + Data.address_book.get(poo));

			System.out.println("Address          -  : " + Data.address_book.get(poo + 1));

			System.out.println("Sex              -  : " + Data.address_book.get(poo + 2));

			System.out.println("Age              -  : " + Data.address_book.get(poo + 3));

			System.out.println("Phone            -  : " + Data.address_book.get(poo + 4));

			System.out.println("Date of Birth    -  : " + Data.address_book.get(poo + 5));

			System.out.println("Date of File     -  : " + Data.address_book.get(poo + 6));

			System.out.println("     Entry Number: " + sloo + ".......Are you ready for Another ?.......");
			sloo++;
			poo = poo + 7;

			// pausing for a prompt before outputting the next person
			pause.nextLine();
			System.out.println();
		}
		System.out.println("That was the last Entry.......");

		// exiting back to the menu after the last entry
		System.out.println("You will now return to the MAIN MENU. ");
		poo = 0;
		sloo = 0;
		// pause.close(); // keeps crashing if I add it ?

	} // *********************** END DISPLAY FUNC. **********************
}
