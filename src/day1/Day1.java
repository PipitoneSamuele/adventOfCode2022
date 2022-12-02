package day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day1 {
	
	public Day1() {};
	
public List<String> readtxt() throws IOException {
		
		//variables
		List<String> ret = new ArrayList<>();
		String input = "";
		String lines[] = null;
		
		//read input
		try {
			input = Files.readString(Path.of("src/day1/input.txt"));
			lines = input.split("\\r?\\n");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		//valorize list
		for(String s : lines) {
			ret.add(s);
		}
		return ret;
	}
	
	public long getAnswer() throws IOException {
		
		//variables
		List<String> lines = readtxt();
		long max = 0;
		long current = 0L;
		
		//calculate calories for single elf
		for(String s : lines) {
			if(s.length() < 1) { //if \n this is another elf
				if(current > max) { //check if the current elf is carrying more than the max elf
					max = current;
				}
				current = 0;
			} else { //add carried calories 
				current += Long.parseLong(s);
			}
		}
		return max;
	}
	
	/***
	 * 
	 * NOT WORKING
	 * 
	 */
	public long getAnswerPart2() throws IOException {
		
		//variables
		List<String> lines = readtxt();
		List<Long> topElves = new ArrayList<>();
		long current = 0L;
		
		for(String s : lines) {
			
			if(s.length() < 1) { //if \n this is another elf
				topElves.add(current);
				current = 0;
			} else {
				current += Long.parseLong(s);
			}
		}
		
		Collections.sort(topElves);
	
		return topElves.get(topElves.size()-1) + topElves.get(topElves.size()-2) + topElves.get(topElves.size()-3);
	}
	
}







