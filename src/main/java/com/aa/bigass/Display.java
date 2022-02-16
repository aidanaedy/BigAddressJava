package com.aa.bigass;

import java.util.Scanner;

public class Display extends Main{
	
	
	   /*********************************************************************
	   *************************  Display Function   ************************
	   *********************************************************************/
	            
	 void display (int count) 
	   {
			Scanner scan = new Scanner(System.in);
			System.out.println();
			System.out.println("***   This is the First of your Address's stored.   ***");

	   int poo;
	   
	   for (poo=0;poo<count;poo++)
	    {	
			System.out.println("Name          - " + address_book[poo]);

			System.out.println("Address       - " + address_book[poo]);

			System.out.println("Sex           - " + address_book[poo]);

			System.out.println("Age           - " + address_book[poo]);
	   		
			System.out.println("Phone         - " + address_book[poo]);

			System.out.println("Date of Birth - " + address_book[poo]);

			System.out.println( ".......Are you ready for Another ?.......");
			String dummy = scan.nextLine();
			System.out.println();
	    }
		System.out.println("That was the last Entry.......");
		System.out.println("You will now return to the MAIN MENU. "); 	
	   

	} //***********************    END DISPLAY FUNC.   **********************

}
