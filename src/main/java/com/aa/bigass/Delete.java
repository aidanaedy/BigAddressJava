
package com.aa.bigass;


import java.util.Scanner;
import java.lang.*;


public class Delete {
	public static void delete() {
		// To Find a person by their name
		
		int length1 = Data.address_book.size() ;
		String yes = "Y";
        
		@SuppressWarnings("resource")
		Scanner user_scan3 = new Scanner(System.in);
		Scanner user_scan4 = new Scanner(System.in);
		System.out.println("Please Enter The Persons Name To Delete -  ");
		String new1 = user_scan3.nextLine().toUpperCase() ;
		System.out.println(new1 + " Is the named entry we are deleting");
		
		  // Start of StringBuilder creation
	      
	      // System.out.println("Before deletion the string is: " + sb);
		

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
	                      + "          Date of Entry - " + Data.address_book.get(i+6) +"\n"
	                      + "---- ARE YOU SURE YOU WANT TO DELETE Y/N ---");
	            	String new2 = user_scan4.nextLine().toUpperCase() ;
	            	if (new2.contentEquals(yes.toUpperCase()) ) {
	            		StringBuilder sb = new StringBuilder(Data.address_book.toString());
	            		//StringBuilder new_str = sb.delete(i, i+6);
	            		Data.address_book.remove(i);
	            		Data.address_book.remove(i+1);
	            		Data.address_book.remove(i+2);
	            		Data.address_book.remove(i+3);
	            		Data.address_book.remove(i+4);
	            		Data.address_book.remove(i+5);
	            		Data.address_book.remove(i+6);
	            		length1 = length1-7;
	            		//System.out.println("The string to be deleted is " + sb + " and the address book data is " + Data.address_book.get(i));
	            	}
			}
			
        }	
        System.out.println("\n We have finished looking and found no more \n");
	}
	
}



/*
 void Delete (void)
 {

    int s;
    int loo;
    
    char dummy[50];
    char find[50];
	char findupr[50];
		
	  system("cls");	
	  fputs("Please Enter The Person's Name,", stdout);
	  cout << endl;
	  fputs(" Of The File You Want To Delete - ",stdout);
      gets(find);
			
	  strcpy (findupr, find);
	  _strupr(findupr);
      for  (s=0;s<=total;s++)
       {
             
         if (!strcmp(findupr, address_book[s].name))  
            {
              loo = s;
            }
	   }	 	
	  for (;loo<=count;loo++)		
        {
		  strcpy (address_book[loo].name, dummy);
 		  strcpy (address_book[loo].address, dummy);
 		  strcpy (address_book[loo].sex, dummy);
  		  strcpy (address_book[loo].age, dummy);
  		  strcpy (address_book[loo].phone, dummy);
  		  strcpy (address_book[loo].birthday, dummy);
	      int p=loo+1;
	  
		  strcpy (address_book[loo].name, address_book[p].name);
 		  strcpy (address_book[loo].address, address_book[p].address);
 		  strcpy (address_book[loo].sex, address_book[p].sex);
  		  strcpy (address_book[loo].age, address_book[p].age);
  		  strcpy (address_book[loo].phone, address_book[p].phone);
  		  strcpy (address_book[loo].birthday, address_book[p].birthday);
       
        }      
       if (loo=s)
       	{        
         	count--;
    		fputs("-- The File Is Now Erased --", stdout);
	         	
        }
       if (loo!=s)
        {
        	fputs( "----- There Were No Files Deleted -----", stdout) ;
        }
    
    fputs( "You Are Now Returning To The Main Menu.", stdout);

}//************* end of delete func. ***************
*/