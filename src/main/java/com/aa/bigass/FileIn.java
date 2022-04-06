package com.aa.bigass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import lombok.Data;

@Data

class FileIn  {

	// **********************************************************************

	/*************************** FILE INPUT START **********************/

	// **********************************************************************

	static void fileIn() {

		try {
			
			// using BufferedReader to read in the file one line (entry) at a time
			BufferedReader reader1 = new BufferedReader(new FileReader("bigdos.in"));

					do {

				String setName1 = reader1.readLine();
				Main.address_book.add(setName1);

				String setAddress1 = reader1.readLine();
				Main.address_book.add(setAddress1);

				String setSex1 = reader1.readLine();
				Main.address_book.add(setSex1);

				String setAge1 = reader1.readLine();
				Main.address_book.add(setAge1);

				String setPhone1 = reader1.readLine();
				Main.address_book.add(setPhone1);

				String setBirthday1 = reader1.readLine();
				Main.address_book.add(setBirthday1);

				String setDate1 = reader1.readLine();
				Main.address_book.add(setDate1);

				// and then increment the counter for each additional entry
				Count.count++;

			}

			 while ((reader1.readLine()) != null);
			// close the reader when done
			reader1.close();

		} catch (

		IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		// I do not know why, but I am getting an extra set of null values at the end - to do



		Count.count++;

		// The below sys.out will be removed but are just a check of the collected data
		System.out.println(Main.address_book);
		System.out.println(Count.count);
	}

}
/***************************************************************
 * * END FILE IN FUNC. *
 ***************************************************************/

