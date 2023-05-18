package com.aa.bigass;

import java.util.Scanner;

public class Display {

	/********************** display method **********************/
	// this method displays all the entries one person at a time
	static void display() {
		display_output();
		System.out.println("That Was The Last Entry.......");

		// exiting back to the menu after the last entry
		System.out.println("You Will Now Return To The MAIN MENU. ");
		// pause.close(); // keeps crashing if I add it ?

	} // *********************** end of display method. **********************

	// ************************* display_output method ************************
	// This contains the text to output to the screen
	static void display_output() {
		int poo = 0;
		int sloo = 1;

		Scanner pause = new Scanner(System.in);
		System.out.println();
		System.out.println("|**   This Is The " + sloo + " Of " + Data.getCount() + " Of Your Address's Stored.   **|");

		// looping through each persons name, age address etc.
		while (sloo < (Data.getCount() + 1)) {
			System.out.println("Name             -  : " + Data.addressBook.get(poo));
			System.out.println("Address          -  : " + Data.addressBook.get(poo + 1));
			System.out.println("Sex              -  : " + Data.addressBook.get(poo + 2));
			System.out.println("Age              -  : " + Data.addressBook.get(poo + 3));
			System.out.println("Phone            -  : " + Data.addressBook.get(poo + 4));
			System.out.println("Date Of Birth    -  : " + Data.addressBook.get(poo + 5));
			System.out.println("Date Of File     -  : " + Data.addressBook.get(poo + 6) + "\n");
			System.out.println("|* That Was Entry No : " + sloo + ".  Are You Ready For Another ? *|");
			sloo++;
			poo = poo + 7;
			// pausing for a prompt before outputting the next person
			pause.nextLine();
			System.out.println();
		}

	}
}
