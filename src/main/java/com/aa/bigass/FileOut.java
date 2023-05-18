package com.aa.bigass;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileOut {

	// this class outputs the amended data back to the file
	static void fileOut() {
		int poo;

		try {
			// open the file
			BufferedWriter writer1 = new BufferedWriter(new FileWriter("bigdos.in"));

			// write the data
			for (poo = 0; poo < Data.addressBook.size(); poo++) {
				writer1.append(Data.addressBook.get(poo) + "\n");
			}
			// close the writer
			writer1.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	// *********************** END File Out FUNC. **********************
}