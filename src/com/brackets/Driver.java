package com.brackets;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter String of Bracket input You want to check ");
		String input = scan.nextLine();
		ProcessBrackets processBrackets = new ProcessBrackets();
		boolean isBalanced = processBrackets.isBracketBalanced(input.trim());

		if (isBalanced) {
			System.out.println("Your Input String is balanced");
		} else {
			System.out.println("Your Input String is not balanced");
		}

	}

}
