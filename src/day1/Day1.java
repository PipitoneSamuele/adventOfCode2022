package day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Day1 {
	
	public Day1() {};
	
	public long getAnswer() throws IOException {
		
		//variables
		List<String> ret = readtxt();
		long max = 0;
		long current = 0;
		
		//calculate calories for single elf
		for(String s : ret) {
			if(s.length() < 1) { //if \n this is another elf
				if(current > max) { //check if the current elf is carrying more than the max elf
					max = current;
				}
				current = 0;
			} else {
				current += Long.parseLong(s);
			}
		}
		return max;
	}
	
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

}
