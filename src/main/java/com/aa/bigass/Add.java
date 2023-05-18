package com.aa.bigass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
		Data.addressBook.add(name1);

		System.out.println();
		System.out.println("\n Address          -  : ");
		String address1 = scan.nextLine();
		Data.addressBook.add(address1);

		System.out.println();
		System.out.println("\n Sex              -  : ");
		String sex1 = scan.nextLine();
		Data.addressBook.add(sex1);

		System.out.println();
		System.out.println("\n Age              -  : ");
		String age1 = scan.nextLine();
		Data.addressBook.add(age1);

		System.out.println();
		System.out.println("\n Phone        - : ");
		String phone1 = scan.nextLine();
		Data.addressBook.add(phone1);

		System.out.println();
		System.out.println("\n Date of Birth    -  : ");
		String birthday1 = scan.nextLine();
		Data.addressBook.add(birthday1);

		// Date of File added by the system so no need to display on the screen
		String pattern = "dd/MM/yy HH:mm:ss";
		DateFormat df = new SimpleDateFormat(pattern);
		Date today = Calendar.getInstance().getTime();
		String date1 = df.format(today);
		Data.addressBook.add(date1);

		System.out.println("You Will Now Return To The MAIN MENU. \n\n");
		count++;
		Data.setCount(count);
		// scan.close();

	}
}
