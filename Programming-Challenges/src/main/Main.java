package main;

import main.calculator.dates.DateCalc;
import main.menu.Menu;
import main.text.morse.MorseGenerator;

public class Main {
	
	public static void main(String[] args) {
		showMenu(new MorseGenerator());
	}
	
	
	public static void showMenu(Menu menu) {
		menu.show();
	}
}
