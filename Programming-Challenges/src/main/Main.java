package main;

import java.util.Scanner;

import main.calculator.dates.DateCalc;
import main.menu.Menu;
import main.text.morse.MorseGenerator;

public class Main {

	public static void main(String[] args) {
		showOptions();
		Scanner keyboard = new Scanner(System.in);
		String option;
		do {
			option = keyboard.next();
			showMenu(option);
		} while (!option.equals("q"));

	}

	public static void showMenu(String option) {
		switch (option) {
		case "23":
			new DateCalc().show();
			break;
		case "q":
			System.out.println("Quiting the program");
			break;
		default:
			System.out.println("You didn't choose any available option");
			break;
		}
	}

	private static void showOptions() {
		System.out.println("Programming-Challenges-v2.0");
		System.out.println("Available options: ");
		System.out.println("#23 Calculate the days between two dates");
		System.out.println("");
		System.out.println("Choose one of available options or press q and confirm");
	}
}
