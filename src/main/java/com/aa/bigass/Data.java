package com.aa.bigass;

import java.util.ArrayList;

/*********************** Class for counting START **********************/
public class Data {
	private static int count;
	private static int users_choice;
	// this has been moved to the data class to clean the main class
	static ArrayList<String> address_book = new ArrayList<>();

	// using getters and setters to use or keep the counter updated
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Data.count = count;
	}

	// using getters and setters to use or keep the users_choice updated
	public static int getusers_choice() {
		return Data.users_choice;
	}

	public static void setusers_choice(int users_choice) {
		Data.users_choice = users_choice;
	}

}
