package com.aa.bigass;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileOut extends Main {

	static void fileOut() {
		int poo;

		try {
			BufferedWriter writer1 = new BufferedWriter(new FileWriter("output.txt"));
			//writer1.write(count.count + "             - # of Entries.");

			for (poo = 0; poo < address_book.size(); poo++) {
				writer1.append(address_book.get(poo) + "\n");
				
				

			}
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