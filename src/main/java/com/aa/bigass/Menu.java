package com.aa.bigass;

import java.util.Scanner;

public class Menu extends Main{
	
	 public static int menu(int users_choice) // to select one of the listed func.
	  
	  {      
		 	
		 

		 	
			Scanner scan = new Scanner(System.in);
			System.out.println( "Your Choice of Menu is:- #");
			users_choice = scan.nextInt();
			System.out.println();

	         switch (users_choice)
	         { 
	           case 1:
					Add.Add ();          	//dec of Add func
	                break;
	           case 2:
					//Delete ();            //dec of Delete func
	                break;
			   case 3:
					Display.display();      //dec of Display func
	          	    break; 
	           case 4:
	          	    //Find (users_choice2); //dec of Find menu
	          	    break;
	           case 5:
	        	   	return users_choice = 5;
	           default:  System.out.println("You Have Made An Incorrect Choice");	 
	         
	         }
			System.out.println(count.count);
			return users_choice;
	  
	  }//**********************  END MAIN MENU FUNC. *********************

}
