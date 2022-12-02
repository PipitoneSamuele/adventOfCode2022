package main;

import java.io.IOException;
import java.util.Scanner;

import day1.Day1;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//variables
		int answer = 0;
		String repeat = "y";
		
		//Objects
		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		
		//Answers classes
		Day1 day1 = new Day1();
		
		System.out.println("This is my take on advent of code 2022. Happy holidays!");
		
		while(repeat.equalsIgnoreCase("y")) {
			
			System.out.println("\nSelect the day to choose the answer");
			System.out.println("1");
			System.out.println("");
			answer = scInt.nextInt();
			
			switch(answer) {
				case 1: {
					System.out.println("Part 1:\n " + day1.getAnswer());
					System.out.println("Part 2:\n " + day1.getAnswerPart2() + " -> wrong");
					break;
				}
				default: 
					repeat = "n";
			}
			
			System.out.println("");
			System.out.println("Would you like to get another answer? (y/n)");
			repeat = scString.nextLine();
		}
		
		scInt.close();
		scString.close();
	}
}
