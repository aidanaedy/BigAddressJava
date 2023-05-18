package com.aa.bigass;

import java.util.ArrayList;

/*********************** Class for counting START **********************/
public class Data {
	private static int count;
	private static int usersChoice;
	// this has been moved to the data class to clean the main class
	static ArrayList<String> addressBook = new ArrayList<>();

	// using getters and setters to use or keep the counter updated
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Data.count = count;
	}

	// using getters and setters to use or keep the users_choice updated
	public static int getUsersChoice() {
		return Data.usersChoice;
	}

	public static void setUsersChoice(int usersChoice) {
		Data.usersChoice = usersChoice;
	}

}
