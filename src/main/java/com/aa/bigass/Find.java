package com.aa.bigass;

import java.util.Scanner;


class Find {
    public static void find() {
    	
		Scanner user_scan = new Scanner(System.in);
		System.out.println("Your Choice of Find Menu is:- #");
		System.out.println(
		        "*** Enter The Type Of Find You Require ***\n"
		        + "\n"
		        + " 1.| To Find A Named Entry.\n"
		        + " 2.| To Find Persons with A Particular Birthday.\n"
		        + " 3.| To Find Persons in An Age Range.\n"
		        + " 4.| To Find Persons With A Phone Number.\n"
		        + " 5.| To Exit From The Find Menu.\n");
		Data.setusers_choice(user_scan.nextInt());
		// Data.setusers_choice(Integer.parseInt(System.console().readLine()));
		int userChoice = Data.getusers_choice();
		//user_scan.close();
		System.out.println();
    	


		switch (userChoice) {
		case 1:
			// named METHOD
			Find.named();
			break;
		case 2:
			// birthday METHOD
			break;
		case 3:
			// age METHOD
			
			break;
		case 4:
			// phone METHOD
			break;
		case 5:
			// to exit the menu and system
			//user_scan.close();
			Main.main();
			break;
		default:
			System.out.println("You Have Made An Incorrect Choice");
	}
    }

	private static void named() {
		// To Find a person by their name
		
		int length1 = Data.address_book.size() ;
        
		@SuppressWarnings("resource")
		Scanner user_scan2 = new Scanner(System.in);
		System.out.println("Please Enter The Persons Name To Search For -  ");
		String new1 = user_scan2.nextLine().toUpperCase() ;
		System.out.println(new1 + " Is the name we are searching for");
		

        for (int i = 0; i < length1; i += 7){
			if (new1.contentEquals(Data.address_book.get(i).toUpperCase()) ) { // change to uppertoString().toUpperCase().g 
	            	System.out.println(
	            			""
	            		  + "          Name          - " + Data.address_book.get(i) + "\n"
	                      + "          Address       - " + Data.address_book.get(i+1) + "\n"
	                      + "          Sex           - " + Data.address_book.get(i+2) + "\n"
	                      + "          Age           - " + Data.address_book.get(i+3) + "\n"
	                      + "          Phone         - " + Data.address_book.get(i+4) + "\n"
	                      + "          Date of Birth - " + Data.address_book.get(i+5) + "\n"
	                      + "          Date of Entry - " + Data.address_book.get(i+6) +"\n");
			}
			
        }	
        System.out.println("\n We have finished looking and found no more \n");
	}
};