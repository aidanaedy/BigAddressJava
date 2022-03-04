package com.aa.bigass;

import java.util.Scanner;

public class Display extends Main{
	
	
	   /*********************************************************************
	   *************************  Display Function   ************************
	   *********************************************************************/
	            
	 static void display () 
	   {
		   int poo;
		   int sloo = 0;
		   
			Scanner scan = new Scanner(System.in);
			System.out.println();
			System.out.println("***   This is the " + sloo+1 + " of " + count.count + " of your Address's stored.   ***");


	   for (poo=0;poo<count.count*6;poo++)
	    {	
			System.out.println("Name          - " + address_book.get(poo));

			System.out.println("Address       - " + address_book.get(poo+1));

			System.out.println("Sex           - " + address_book.get(poo+2));

			System.out.println("Age           - " + address_book.get(poo+3));
	   		
			System.out.println("Phone         - " + address_book.get(poo+4));

			System.out.println("Date of Birth - " + address_book.get(poo+5));
			
			System.out.println("Date of File  - " + address_book.get(poo+6));
			poo = poo + 6;
			sloo++;

			System.out.println( ".......Are you ready for Another ?.......");
			String dummy = scan.nextLine();
			System.out.println();
	    }
		System.out.println("That was the last Entry.......");
		System.out.println("You will now return to the MAIN MENU. "); 	
		poo = 0;
		sloo = 0;
	   

	} //***********************    END DISPLAY FUNC.   **********************


}
