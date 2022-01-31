package com.greatlearning.driver;

import com.greatlearning.services.BalancingBrackets;

public class DriverBalancingBracket {

	public static void main(String[] args) {
		String input = "([[{}]])";
		boolean check = BalancingBrackets.bracketCheck(input);

		if (check == true)
			System.out.println("Balanaced Brackets");
		else
			System.out.println("Unbalanaced Brackets");

	}
}
