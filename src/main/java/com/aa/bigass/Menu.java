package com.aa.bigass;

import java.util.Scanner;

public class Menu {
	
	// to select one of the listed functions.
	 public static int menu(int users_choice) 
	  
	  {      
		 	
			Scanner scan = new Scanner(System.in);
			System.out.println( "Your Choice of Menu is:- #");
			users_choice = scan.nextInt();
			System.out.println();

	         switch (users_choice)
	         { 
	           case 1:
	        	 //add function to add new entries
					Add.add ();          	           
	                break;
	           case 2:
	        	 //delete function is to be added here
					//delete ();                         
	                break;
			   case 3:
				 //display function to show all the entries
					Display.display();              
	          	    break; 
	           case 4:
	        	 //find menu function is to be added here
	          	    //Find (users_choice2);    
	          	    break;
	           case 5:
	        	// to exit the menu and system
	        	   	return users_choice = 5;  
	           default:  System.out.println("You Have Made An Incorrect Choice");	 
	         
	         }
	         // close the scanner
	         scan.close();
	         
	        // to be removed eventually, just for debugging
			System.out.println(Count.count);
			
			// to return the value of the menu decision
			return users_choice;
	  
	  }//**********************  END MAIN MENU FUNC. *********************

}
