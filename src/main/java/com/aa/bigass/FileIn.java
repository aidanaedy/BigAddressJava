package com.aa.bigass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileIn {
	/*************************** FILE INPUT START **********************/
	static void fileIn() {
		// int count = Data.getCount();
		try {
			// using BufferedReader to read in the file one line (entry) at a time
			BufferedReader reader1 = new BufferedReader(new FileReader("bigdos.in"));
			for (String setName1 = reader1.readLine(); setName1 != null; setName1 = reader1.readLine()) {
				Data.addressBook.add(setName1);

				String setAddress1 = reader1.readLine();
				Data.addressBook.add(setAddress1);

				String setSex1 = reader1.readLine();
				Data.addressBook.add(setSex1);

				String setAge1 = reader1.readLine();
				Data.addressBook.add(setAge1);

				String setPhone1 = reader1.readLine();
				Data.addressBook.add(setPhone1);

				String setBirthday1 = reader1.readLine();
				Data.addressBook.add(setBirthday1);

				String setDate1 = reader1.readLine();
				Data.addressBook.add(setDate1);

				// and then increment the counter for each additional entry
				Data.setCount(Data.getCount() + 1);
			}
			// close the reader when done
			reader1.close();
			// count--;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		// Data.setCount(count);
	}
}
/***************************************************************
 * * END FILE IN FUNC. *
 ***************************************************************/
