package day2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Day2 {
	
	public Map<String, Integer> mapPart1 = new HashMap<>();
	public Map<String, Integer> mapPart2 = new HashMap<>();
	
	//scoreboard for every case in part 1
	public void initializeMap1() {
		mapPart1.put("A X", 4);
		mapPart1.put("A Y", 8);
		mapPart1.put("A Z", 3);
		mapPart1.put("B X", 1);
		mapPart1.put("B Y", 5);
		mapPart1.put("B Z", 9);
		mapPart1.put("C X", 7);
		mapPart1.put("C Y", 2);
		mapPart1.put("C Z", 6);
	}
	
	
	
	/*scoreboard for every case in part 2
	 * 
	 * /* 9633 - 12856 - 13071
	 * A -> rock 1    | X -> lose 0
	 * B -> paper 2   | Y -> draw 3
	 * C -> scissor 3 | Z -> win 6
	 * 
	 */
	public void initializeMap2() {
		mapPart1.put("A X", 3);//3+0
		mapPart1.put("A Y", 4);//1+3
		mapPart1.put("A Z", 8);//2+6
		mapPart1.put("B X", 1);//1+0
		mapPart1.put("B Y", 5);//2+3
		mapPart1.put("B Z", 9);//3+6
		mapPart1.put("C X", 2);//2+0
		mapPart1.put("C Y", 6);//3+3
		mapPart1.put("C Z", 7);//1+6
	}
	
	public int getAnswer() {
		
		//variables
		String input = "";
		String lines[] = null;
		int tot = 0;
		
		initializeMap1();
		
		//read input
		try {
			input = Files.readString(Path.of("src/day2/input.txt"));
			lines = input.split("\\r?\\n");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		//calculate with our scoreboard
		for(String s : lines) {
			tot += mapPart1.get(s);
		}
		
		return tot;
	}
	
	public int getAnswerPart2() {
		
		//variables
		String input = "";
		String lines[] = null;
		int tot = 0;
				
		initializeMap2();
		
		//read input
		try {
			input = Files.readString(Path.of("src/day2/input.txt"));
			lines = input.split("\\r?\\n");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		//calculate with our scoreboard
		for(String s : lines) {
			tot += mapPart1.get(s);
		}
		
		return tot;
	}
	
}
