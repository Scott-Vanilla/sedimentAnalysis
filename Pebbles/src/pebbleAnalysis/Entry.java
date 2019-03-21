package pebbleAnalysis;

import java.util.Scanner;

public class Entry {

	static Scanner S = new Scanner(System.in);
	
	private static void shortWait() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		double wid;
		double len;
		double dep;
		char option = 'A';
		boolean isMenuDone = false;
		double result = 0;
		
		System.out.println("Welcome to Pebble Analysis.");
		shortWait();
		System.out.println("Please input the width of your pebble.");
		wid = S.nextDouble();
		System.out.println("Please input the length of your pebble.");
		len = S.nextDouble();
		System.out.println("Please input the depth of your pebble.");
		dep = S.nextDouble();
		Pebble peb = new Pebble(wid, len, dep);
		
		do {
		System.out.println("What Type of Analysis would you like to do?");
		System.out.println("K. Krumbian's Index of Sphericity");
		System.out.println("M. Mean Size");
		System.out.println("E. Exit");
		option = S.next().toUpperCase().charAt(0);
		isMenuDone = true;
		} while(isMenuDone == false);
		
		switch(option) {
		
		case 'K' : result = Pebble.sphericityIndex(peb);
				   	break;
		case 'M' : result = Pebble.meanSize(peb);
				   	break;
		case 'E' : System.exit(0);
				   	break;
		default : System.out.println("Please enter a valid response.");
				  isMenuDone = false;
				  	break;
		
		}
		
		System.out.println("The result is:" + result);
	}

}
