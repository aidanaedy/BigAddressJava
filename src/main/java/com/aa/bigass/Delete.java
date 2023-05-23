
package com.aa.bigass;

import java.util.Scanner;

public class Delete {
	public static void delete() {
		// To Find a person by their name
		// getting the size of the address book for local comparison
		int lengthAddress = Data.addressBook.size();
		String yes = "Y";

		@SuppressWarnings("resource")
		Scanner userScan3 = new Scanner(System.in);
		Scanner userScan4 = new Scanner(System.in);
		System.out.println("Please Enter The Persons Name To Delete -  ");
		String new1 = userScan3.nextLine().toUpperCase();
		System.out.println(new1 + " Is The Named Entry We Are Deleting");

		for (int i = 0; i < lengthAddress; i += 7) {
			if (new1.contentEquals(Data.addressBook.get(i).toUpperCase())) {
				System.out.println(""
						+ "          Name          - " + Data.addressBook.get(i) + "\n"
						+ "          Address       - " + Data.addressBook.get(i + 1) + "\n"
						+ "          Sex           - " + Data.addressBook.get(i + 2) + "\n"
						+ "          Age           - " + Data.addressBook.get(i + 3) + "\n"
						+ "          Phone         - " + Data.addressBook.get(i + 4) + "\n"
						+ "          Date Of Birth - " + Data.addressBook.get(i + 5) + "\n"
						+ "          Date Of Entry - " + Data.addressBook.get(i + 6) + "\n"
						+ "---- ARE YOU SURE YOU WANT TO DELETE Y/N ---");
				String new2 = userScan4.nextLine().toUpperCase();
				if (new2.contentEquals(yes.toUpperCase())) {
					Data.addressBook.remove(i + 6);
					Data.addressBook.remove(i + 5);
					Data.addressBook.remove(i + 4);
					Data.addressBook.remove(i + 3);
					Data.addressBook.remove(i + 2);
					Data.addressBook.remove(i + 1);
					Data.addressBook.remove(i);
					Data.setCount(Data.getCount() - 1);
					System.out.println("The Database Now Has " + Data.getCount() + "Entries");
				}
			}

		}
		System.out.println("\n We Have Finished Looking And Have Found No More \n");
	}

}