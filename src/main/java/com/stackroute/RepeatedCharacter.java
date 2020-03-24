package com.stackroute;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatedCharacter {

	// Do not print anything other than what's expected/asked in problem
	public static void main(String[] args) {
		// Use Scanner to get input from console
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Character character=findRepeatedCharacter(input);
		if(character.equals('0')) {
			System.out.println("No characters repeated");
		}
		else {
			System.out.println(character);
		}
		

	}

	public static Character findRepeatedCharacter(String input) {
		if (input == null || input.isBlank())
			return '0';
		char[] array = input.toCharArray();
		Arrays.sort(array);
		int count = 1;
		int max = 0;
		char maxChar = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] == array[i - 1]) {
				count++;
			} else {
				if (count > max) {
					max = count;
					maxChar = array[i - 1];

				}
				count = 1;
			}
		}
		if (count > max) {
			max = count;
			maxChar = array[array.length - 1];
		}
		return maxChar;

	}
}