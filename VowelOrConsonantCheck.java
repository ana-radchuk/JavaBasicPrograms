package basicPrograms;

import java.util.Scanner;

public class VowelOrConsonantCheck {
	
	public static void main(String[] args) {
		
		boolean isVowel = false;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Letter: ");
		char l = in.next().toLowerCase().charAt(0);
		in.close();
		
		switch(l) {
			case 'A' :
			case 'E' :
			case 'I' :
			case 'O' :
			case 'U' :
				isVowel = true;
		}
		
		if(isVowel == true) {
			System.out.println(l + " is a Vowel.");
		} else {
			if(l >= 'a' && l <= 'z') {
				System.out.println(l + " is a Consonant.");
			} else {
				System.out.println("Input is not a letter.");
			}
		}
			
		
			
	}

}
