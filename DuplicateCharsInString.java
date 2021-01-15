package stringsPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {
	
	public void countDupChars(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] chars = str.toCharArray();
		
		for(Character ch:chars) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		
		Set<Character> keys = map.keySet();
		
		for(Character ch:keys) {
			if(map.get(ch) > 1) {
				System.out.println("Char " + ch + " " + map.get(ch));
			}
		}
	}
	
	public static void main(String[] args) {
		
		DuplicateCharsInString obj = new DuplicateCharsInString();
		System.out.println("String: TechDebra");
		System.out.println("---------------");
		obj.countDupChars("TechDebra");

		System.out.println("\nString: take it easyyyy");
		System.out.println("---------------");
		obj.countDupChars("take it easyyyy");
		
	}

}
