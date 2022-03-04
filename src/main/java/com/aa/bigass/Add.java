package com.aa.bigass;

import java.time.ZonedDateTime;
import java.util.Scanner;

public class Add extends Main {
	
	public static int Add() {
		
		
	      /****************************************************************
	      **********************    Add Function       ********************
	      ****************************************************************/
		int groo; 
		String get;
		ZonedDateTime dateTime = ZonedDateTime.now();
		Scanner scan = new Scanner(System.in);


		System.out.println(); 	
		System.out.println("********************************************************" );
		System.out.println(count.count); 
		System.out.println(); 
	      
	    
	      groo=(count.count+1);
	       
			System.out.println("Please input the persons details for:-") ;
			System.out.println("Name," +  "Address," +  "Sex," + "Age, "); 
			System.out.println("Phone Numbers" + " and Birthday. "); 
			System.out.println("This Is Entry # " + groo + " In Your Address Book.");
	       
	       /*------------------------------------------------------------
	                     THIS IS THE MAIN INPUT SECTION
	        -----------------------------------------------------------*/              
	            
				System.out.println("\n Name             -  : ");
	            String name1 = scan.nextLine();
				address_book.add(name1);
	  		    
	  		    System.out.println() ;
	  		    System.out.println("\n Address          -  : ");
	            String address1 = scan.nextLine();
				address_book.add(address1);
	            //DO NOT CONVERT THE E-MAIL ADDRESS AS IT IS CASE SENSITIVE !
	            			
				System.out.println() ;
				System.out.println("\n Sex              -  : ");
	            String sex1 = scan.nextLine();
				address_book.add(sex1);
			    
			    System.out.println();
			    System.out.println("\n Age              -  : ");
	            String age1 = scan.nextLine();
				address_book.add(age1);
	            
	            System.out.println() ;
	            System.out.println("\n Phone Number     -  : ");
	            String phone1 = scan.nextLine();
				address_book.add(phone1);
	            
	            System.out.println(); 
	            System.out.println("\n Date of Birth    -  : ");
	            String birthday1 = scan.nextLine();
				address_book.add(birthday1);
				
				//Date of File  - 
				System.out.println("\n Date of File  - ");
				date1 = dateTime;
				//String date1 = scan.nextLine();

				
				
				///////////////////////////////////////////////////////
				//   Need to add the current time stamp as a field   //
				///////////////////////////////////////////////////////

	   			System.out.println(name1 + address1 + sex1 + age1 + phone1 + birthday1);
	   			System.out.println(address_book);
	   			
			System.out.println( "You will now return to the MAIN MENU. ");
			System.out.println();
			System.out.println();
			count.count++;
	  	    return count.count;
	}


}

