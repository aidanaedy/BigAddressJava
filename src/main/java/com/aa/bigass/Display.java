package com.aa.bigass;

import java.util.Scanner;

public class Display {

	/*********************************************************************
	 ************************* Display Function ************************
	 *********************************************************************/
	// this method displays all the entries one person at a time until the last
	static void display() {
		int poo;
		int sloo = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("***   This is the " + sloo + 1 + " of " + Count.count + " of your Address's stored.   ***");

		// looping through each persons name, age address etc.
		for (poo = 0; poo < Count.count * 6; poo++) {
			System.out.println(Main.address_book.get(poo));

			System.out.println(Main.address_book.get(poo + 1));

			System.out.println(Main.address_book.get(poo + 2));

			System.out.println(Main.address_book.get(poo + 3));

			System.out.println(Main.address_book.get(poo + 4));

			System.out.println(Main.address_book.get(poo + 5));

			System.out.println(Main.address_book.get(poo + 6));
			poo = poo + 6;
			sloo++;

			// pausing for a prompt before outputting the next person
			System.out.println(".......Are you ready for Another ?.......");
			String dummy = scan.nextLine();
			System.out.println();
			scan.close();
		}
		System.out.println("That was the last Entry.......");

		// exiting back to the menu after the last entry
		System.out.println("You will now return to the MAIN MENU. ");
		poo = 0;
		sloo = 0;

	} // *********************** END DISPLAY FUNC. **********************

}
