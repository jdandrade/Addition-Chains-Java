package main;

import java.util.ArrayList;
import java.util.Scanner;

// needs optimization, using brute force algorithm
// needs to treat bad input, like when length > final number
public class MainAdditionChains {

	private static int LENGTH;
	private static int FINAL_NUMBER;
	private static ArrayList<Integer> previous_numbers;

	public static void main(String[] args) {

		getInput();
		while (!makeAdditionChain())
			;
		printRslt();
	}

	private static void printRslt() {
		for (Integer i : previous_numbers) {
			System.out.println(i);
		}
	}

	private static boolean makeAdditionChain() {

		int one = 1;
		int rslt = 1;

		previous_numbers = new ArrayList<Integer>();

		previous_numbers.add(one);

		for (int i = 0; i != LENGTH; i++) {

			rslt = one + rslt;
			previous_numbers.add(rslt);

			int tmp = (int) (Math.random() * previous_numbers.size());
			one = previous_numbers.get(tmp);

			if (i == LENGTH - 1 && rslt == FINAL_NUMBER)
				return true;
		}
		return false;

	}

	private static void getInput() {
		System.out.print("Length?  ");
		Scanner s = new Scanner(System.in);
		LENGTH = s.nextInt();
		System.out.print("Final Number? ");
		FINAL_NUMBER = s.nextInt();

	}

}
