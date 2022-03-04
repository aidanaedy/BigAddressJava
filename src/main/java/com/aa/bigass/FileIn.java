package com.aa.bigass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

class FileIn extends Main {

	// *******************************************************************

	/*************************** FILE INPUT START **********************/

	// *******************************************************************

	static void fileIn() {

		try {

			// String line;

			BufferedReader reader1 = new BufferedReader(new FileReader("bigdos.in"));

			for (String line; (line = reader1.readLine()) != null;) {

				String name1 = reader1.readLine();
				address_book.add(name1);

				String address1 = reader1.readLine();
				address_book.add(address1);

				String sex1 = reader1.readLine();
				address_book.add(sex1);

				String age1 = reader1.readLine();
				address_book.add(age1);

				String phone1 = reader1.readLine();
				address_book.add(phone1);

				String birthday1 = reader1.readLine();
				address_book.add(birthday1);

				String date1 = reader1.readLine();
				address_book.add(date1);

				count.count++;

			}

			// while ((reader1.readLine()) != null);
			reader1.close();

		} catch (

		IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		// I do not know why, but I am getting an extra set of null values at the end so
		// I am having to remove them below


		// address_book.remove("Name - ");

		count.count++;

		// The below sys.out will be removed but are just a check of the collected data
		System.out.println(address_book);
		System.out.println(count.count);
	}

}
/***************************************************************
 * * END FILE IN FUNC. *
 ***************************************************************/

/*
 * --- to try at some point in the future --- Stream<String> inputFile =
 * Files.lines(Paths.get("bigdos.in")); inputFile .sorted() .filter(.filter(x ->
 * x.length() > 13) .forEach(System.out::println); inputFile.close();
 * 
 */
