package com.aa.bigass;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileOut {

	// this class outputs the amended data back to the text file (currently a separate file but will be the input file when ready)
	static void fileOut() {
		int poo;

		try {
			// open the file
			BufferedWriter writer1 = new BufferedWriter(new FileWriter("output.txt"));

			// write the data
			for (poo = 0; poo < Main.address_book.size(); poo++) {
				writer1.append(Main.address_book.get(poo) + "\n");
	
			}
			// close the writer
			writer1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// writer1.append("\n" + "Name          - " + address_book.get(poo));
	// writer1.append("\n" + "Address - " + address_book.get(poo));
	// writer1.append("\n" + "Sex - " + address_book.get(poo));
	// writer1.append("\n" + "Age - " + address_book.get(poo));
	// writer1.append("\n" + "Date of Birth - " + address_book.get(poo));
	
	// *********************** END File Out FUNC. **********************

}