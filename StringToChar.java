package stringsPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringToChar {

	public static void main(String[] args) {
		
		// string to char
		String str = "Hello";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.print("Character at " + i + " Position: " + ch);
			System.out.print("\n");
		}
		
		// char to string. method 1
		char chr = 'a';
		String strg = Character.toString(chr);
		System.out.println("String is: " + strg);
		
		// char to string. method 2
		String strg2 = String.valueOf(chr);
		System.out.println("String 2 is: " + strg2);
		
		
	}
}
