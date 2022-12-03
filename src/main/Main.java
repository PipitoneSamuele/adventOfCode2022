package main;

import java.io.IOException;
import java.util.Scanner;

import day1.Day1;
import day2.Day2;
import day3.Day3;

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
		Day2 day2 = new Day2(); 
		Day3 day3 = new Day3(); 
		
		System.out.println("This is my take on advent of code 2022. Happy holidays!");
		
		while(repeat.equalsIgnoreCase("y")) {
			
			System.out.println("\nSelect the day to choose the answer");
			System.out.println("1");
			System.out.println("2");
			System.out.println("");
			answer = scInt.nextInt();
			
			switch(answer) {
				case 1: {
					System.out.println("Part 1:\n" + day1.getAnswer());
					System.out.println("Part 2:\n" + day1.getAnswerPart2() + " -> wrong");
					break;
				}
				case 2:{
					System.out.println("Part 1:\n" + day2.getAnswer());
					System.out.println("Part 2:\n" + day2.getAnswerPart2());
					break;
				}
				case 3:{
					System.out.println("Part 1:\n" + day3.getAnswer());
					System.out.println("Part 2:\n" + day2.getAnswerPart2());
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
