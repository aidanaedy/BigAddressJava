package com.aa.bigass;

import java.util.ArrayList;

//import java.util.Scanner;

	public class Main {
		
		
		 static ArrayList<String> address_book = new ArrayList<String>();
		 char  name1     [];
	  	 char  address1  [];
	  	 char  sex1      [];
	  	 char  age1      [];
	  	 char  phone1    [];
	  	 char  birthday1 [];

		public static void main(String[] args) {
			int users_choice = 0;

			
			//filein (count);    
			Credits.credits();
			
			do
			{ 
				System.out.println();
				System.out.println();
				System.out.println( "*** Enter Your Choice of Menu ***");
				System.out.println( "    -------------------------    ");
				System.out.println( "1.| To Add An Entry.");
				System.out.println( "2.| To Delete An Entry.");
				System.out.println( "3.| To Display All Entries.");
				System.out.println( "4.| To Goto Find Menu.");
				System.out.println( "5.| To Exit From The Program.");

				users_choice =  Menu.menu(users_choice);
				
			}  
			while (users_choice != 5);
			//system("cls");
			System.out.println("        Thank You For Using The ADDRESS BOOK..");
			Credits.credits();
			System.out.println();
			System.out.println("          You Will Now Return To The Console.")	;
		  }


		
	}


