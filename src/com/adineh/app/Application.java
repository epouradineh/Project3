package com.adineh.app;

public class Application {

	private static int menuSelected;

	public static void main(String[] args) {
		selectionHub(mainMenu());

	}

	private static void selectionHub(int mainMenu) {
		switch (mainMenu) {
		case 1:
			membersMenu();
			break;
		case 2:
			booksMenu();
			break;

		case 3:
			System.exit(0);
			break;

		default:

		}
	}

	private static void booksMenu() {
		System.out.println("Welcome Books Menu");
		System.out.println("1) ADD a Book");
		System.out.println("2) Remove a Book");
		System.out.println("3) Find a Book");
		System.out.println("4) Edit a Book");
		System.out.println("5) Back to Main Menu");
	}

	private static void membersMenu() {
		System.out.println("Welcome Members Menu");
		System.out.println("1) ADD Memeber");
		System.out.println("2) Remove Member");
		System.out.println("3) Search Member");
		System.out.println("4) Edit Member's information ");
		System.out.println("5) Back to Main Menu");
	}

	private static int mainMenu() {
		System.out.println("Welcome Library Project");
		System.out.println("1) Memebers Menu");
		System.out.println("2) Books Menu");
		System.out.println("3) Exit");
		return menuSelected;
	}

}
