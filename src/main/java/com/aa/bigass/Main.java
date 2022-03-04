package com.aa.bigass;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.ArrayList;

public class Main {
		
		
		static ArrayList<String> address_book = new ArrayList<>();
		//static int count = 0;

		 static String  name1;
		 static String  address1;
		 static String  sex1;
		 static String  age1;
		 static String  phone1;
		 static String  birthday1;
		 static ZonedDateTime	date1;
	  	 

		public static void main(String[] args) throws IOException {
			int users_choice = 0;

			
			FileIn.fileIn();    
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

			

		
			System.out.println("         Thank You For Using The ADDRESS BOOK");
			Credits.credits();
			System.out.println();
			System.out.println("          You Will Now Return To The Console.")	;
			FileOut.fileOut();
		  }

}
