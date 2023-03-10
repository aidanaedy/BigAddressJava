package com.aa.bigass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Add {

	public static void add() {

		/****************************************************************
		 ********************** Add Function ********************
		 ****************************************************************/
		int groo;
		int count = Data.getCount();
		//String get;
		//ZonedDateTime dateTime = ZonedDateTime.now();
		Scanner scan = new Scanner(System.in);

		System.out.println();
		System.out.println("********************************************************");
		System.out.println(Data.getCount());
		System.out.println();

		groo = (count + 1);

		System.out.println("Please input the persons details for:-");
		System.out.println("Name," + "Address," + "Sex," + "Age, ");
		System.out.println("Phone Numbers" + " and Birthday. ");
		System.out.println("This Is Entry # " + groo + " In Your Address Book.");

		/*------------------------------------------------------------
		              THIS IS THE MAIN INPUT SECTION
		 -----------------------------------------------------------*/

		// taking in the details one at a time and adding them to the address book

		System.out.println("\n Name             -  : ");
		String name1 = scan.nextLine();
		Data.address_book.add("Name          - " + name1);

		System.out.println();
		System.out.println("\n Address          -  : ");
		String address1 = scan.nextLine();
		Data.address_book.add("Address       - " + address1);
		// DO NOT CONVERT THE E-MAIL ADDRESS AS IT IS CASE SENSITIVE !

		System.out.println();
		System.out.println("\n Sex              -  : ");
		String sex1 = scan.nextLine();
		Data.address_book.add("Sex           - " + sex1);

		System.out.println();
		System.out.println("\n Age              -  : ");
		String age1 = scan.nextLine();
		Data.address_book.add("Age           - " + age1);

		System.out.println();
		System.out.println("\n Phone        - : ");
		String phone1 = scan.nextLine();
		Data.address_book.add("Phone         - " + phone1);

		System.out.println();
		System.out.println("\n Date of Birth    -  : ");
		String birthday1 = scan.nextLine();
		Data.address_book.add("Date of Birth - " + birthday1);

		// Date of File added by the system
		System.out.println("\n Date of File  - ");
		String pattern = "dd/MM/yy HH:mm:ss";
		DateFormat df = new SimpleDateFormat(pattern);
		Date today = Calendar.getInstance().getTime();
		String date1 = df.format(today);
		Data.address_book.add("Date of File  - " + date1);

		// this is debugging output and will be removed soon
		System.out.println(name1 + address1 + sex1 + age1 + phone1 + birthday1 + date1);
		System.out.println(Data.address_book);

		System.out.println("You will now return to the MAIN MENU. ");
		System.out.println();
		System.out.println();
		count++;
		Data.setCount(count); 
		scan.close();
		
	}

}
