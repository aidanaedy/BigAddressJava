package com.aa.bigass;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileOut {

	// this class outputs the amended data back to the text file (currently a
	// separate file but will be the input file when ready)
	static void fileOut() {
		int poo;

		try {
			// open the file
			BufferedWriter writer1 = new BufferedWriter(new FileWriter("bigdos.in"));

			// write the data
			for (poo = 0; poo < Data.address_book.size(); poo++) {
				writer1.append(Data.address_book.get(poo) + "\n");
				// writer1.close();
			}
			// close the writer
			writer1.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	// *********************** END File Out FUNC. **********************
}