package com.aa.bigass;

import java.util.Scanner;

public class Add extends Main {
	
	public static int Add(int count) {
		
		
	      /****************************************************************
	      **********************    Add Function       ********************
	      ****************************************************************/
		int groo; 
		String get;
		
		Scanner scan = new Scanner(System.in);


		System.out.println(); 	
		System.out.println("********************************************************" );
		System.out.println(count); 
		System.out.println(); 
	      
	    
	      groo=(count+1);
	       
			System.out.println("Please input the persons details for:-") ;
			System.out.println("Name," +  "Address," +  "Sex," + "Age, "); 
			System.out.println("Phone Numbers" + " and Birthday. "); 
			System.out.println("This Is Entry # " + groo + " In Your Address Book.");
	       
	       /*__________________________________________________________
	                     THIS IS THE MAIN INPUT SECTION
	         __________________________________________________________*/              
	            
				System.out.println(" Name             -  : ");
	            String name1 = scan.nextLine();
				address_book.add (name1);
//				_strupr(address_book[count].name);
	    
	  		    
	  		    System.out.println() ;
	  		    System.out.println(" Address          -  : ");
	            String address1 = scan.nextLine();
				address_book.add (address1);
	            //DO NOT CONVERT THE E-MAIL ADDRESS AS IT IS CASE SENSITIVE !
	            			
				System.out.println() ;
				System.out.println(" Sex              -  : ");
	            String sex1 = scan.nextLine();
				address_book.add (sex1);
//		   		_strupr(address_book[count].sex);

			    
			    System.out.println();
			    System.out.println(" Age              -  : ");
	            String age1 = scan.nextLine();
				address_book.add (age1);
//	   			_strupr(address_book[count].age);

	            
	            System.out.println() ;
	            System.out.println(" Phone Number     -  : ");
	            String phone1 = scan.nextLine();
				address_book.add (phone1);
//	   			_strupr(address_book[count].phone);

	            
	            System.out.println(); 
	            System.out.println(" Date of Birth    -  : ");
	            String birthday1 = scan.nextLine();
				address_book.add (birthday1);
//	   			_strupr(address_book[count].birthday);

	   			System.out.println(name1 + address1 + sex1 + age1 + phone1 + birthday1);
	   			System.out.println(address_book);
	   			
			System.out.println( "You will now return to the MAIN MENU. ");
			System.out.println();
			System.out.println();
			count++;
	  	    return count;
	}
}

