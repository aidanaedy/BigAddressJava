package com.aa.bigass;

import java.util.Scanner;

class Find {
	public static void find() {

		Scanner userScan = new Scanner(System.in);
		System.out.println("Your Choice of Find Menu is:- #");
		System.out.println(
				"*** Enter The Type Of Find You Require ***\n"
						+ "\n"
						+ " 1.| To Find A Named Entry.\n"
						+ " 2.| To Find Persons With A Particular Birthday.\n"
						+ " 3.| To Find Persons That Are A Certain Age.\n"
						+ " 4.| To Find Persons With A Phone Number.\n"
						+ " 5.| To Exit From The Find Menu.\n");
		Data.setUsersChoice(userScan.nextInt());
		// Data.setusers_choice(Integer.parseInt(System.console().readLine()));
		int userChoice = Data.getUsersChoice();
		// user_scan.close();
		System.out.println();

		switch (userChoice) {
			case 1:
				// named METHOD
				Find.named();
				break;
			case 2:
				// birthday METHOD
				Find.birthday();
				break;
			case 3:
				// age METHOD
				Find.age();
				break;
			case 4:
				// phone METHOD
				Find.phone();
				break;
			case 5:
				// to exit the menu and system
				break;
			default:
				System.out.println("You Have Made An Incorrect Choice");
		}
	}

	private static void named() {
		// To Find a person by their name

		int length1 = Data.addressBook.size();
		@SuppressWarnings("resource")
		Scanner userScan2 = new Scanner(System.in);
		System.out.println("Please Enter The Persons Name To Search For -  ");
		String new1 = userScan2.nextLine().toUpperCase();
		System.out.println(new1 + " Is The Name We Are Searching For");

		for (int i = 0; i < length1; i += 7) {
			if (new1.contentEquals(Data.addressBook.get(i).toUpperCase())) {
				System.out.println(
						""
								+ "          Name          - " + Data.addressBook.get(i) + "\n"
								+ "          Address       - " + Data.addressBook.get(i + 1) + "\n"
								+ "          Sex           - " + Data.addressBook.get(i + 2) + "\n"
								+ "          Age           - " + Data.addressBook.get(i + 3) + "\n"
								+ "          Phone         - " + Data.addressBook.get(i + 4) + "\n"
								+ "          Date of Birth - " + Data.addressBook.get(i + 5) + "\n"
								+ "          Date of Entry - " + Data.addressBook.get(i + 6) + "\n");
			}
		}
		System.out.println("\n We Have Finished Looking And Found No More \n");
	}

	private static void age() {
		// To Find a person by their age

		int length1 = Data.addressBook.size();

		@SuppressWarnings("resource")
		Scanner userScan3 = new Scanner(System.in);
		System.out.println("Please Enter The Persons Age To Search For -  ");
		String new2 = userScan3.nextLine().toUpperCase();
		System.out.println(new2 + " Is The Age We Are Searching For");

		for (int i = 0; i < length1; i += 7) {
			if (new2.contentEquals(Data.addressBook.get(i + 3).toUpperCase())) {
				System.out.println(
						""
								+ "          Name          - " + Data.addressBook.get(i) + "\n"
								+ "          Address       - " + Data.addressBook.get(i + 1) + "\n"
								+ "          Sex           - " + Data.addressBook.get(i + 2) + "\n"
								+ "          Age           - " + Data.addressBook.get(i + 3) + "\n"
								+ "          Phone         - " + Data.addressBook.get(i + 4) + "\n"
								+ "          Date of Birth - " + Data.addressBook.get(i + 5) + "\n"
								+ "          Date of Entry - " + Data.addressBook.get(i + 6) + "\n");
			}
		}
		System.out.println("\n We Have Finished Looking And Found No More \n");
	}

	private static void phone() {
		// To Find a person by their phone number

		int length1 = Data.addressBook.size();
		@SuppressWarnings("resource")
		Scanner userScan4 = new Scanner(System.in);
		System.out.println("Please Enter The Persons Phone Number To Search For -  ");
		String new3 = userScan4.nextLine().toUpperCase();
		System.out.println(new3 + " Is The Number We Are Searching For");

		for (int i = 0; i < length1; i += 7) {
			if (new3.contentEquals(Data.addressBook.get(i + 4).toUpperCase())) {
				System.out.println(
						""
								+ "          Name          - " + Data.addressBook.get(i) + "\n"
								+ "          Address       - " + Data.addressBook.get(i + 1) + "\n"
								+ "          Sex           - " + Data.addressBook.get(i + 2) + "\n"
								+ "          Age           - " + Data.addressBook.get(i + 3) + "\n"
								+ "          Phone         - " + Data.addressBook.get(i + 4) + "\n"
								+ "          Date of Birth - " + Data.addressBook.get(i + 5) + "\n"
								+ "          Date of Entry - " + Data.addressBook.get(i + 6) + "\n");
			}
		}
		System.out.println("\n We Have Finished Looking And Found No More \n");
	}

	private static void birthday() {
		// To Find a person by their birthday

		int length1 = Data.addressBook.size();
		@SuppressWarnings("resource")
		Scanner userScan5 = new Scanner(System.in);
		System.out.println("Please Enter The Persons Birthdate To Search For -  ");
		String new4 = userScan5.nextLine().toUpperCase();
		System.out.println(new4 + " Is The Birthdate We Are Searching For");

		for (int i = 0; i < length1; i += 7) {
			if (new4.contentEquals(Data.addressBook.get(i + 5).toUpperCase())) {
				System.out.println(
						""
								+ "          Name          - " + Data.addressBook.get(i) + "\n"
								+ "          Address       - " + Data.addressBook.get(i + 1) + "\n"
								+ "          Sex           - " + Data.addressBook.get(i + 2) + "\n"
								+ "          Age           - " + Data.addressBook.get(i + 3) + "\n"
								+ "          Phone         - " + Data.addressBook.get(i + 4) + "\n"
								+ "          Date of Birth - " + Data.addressBook.get(i + 5) + "\n"
								+ "          Date of Entry - " + Data.addressBook.get(i + 6) + "\n");
			}
		}
		System.out.println("\n We Have Finished Looking And Found No More \n");
	}
};