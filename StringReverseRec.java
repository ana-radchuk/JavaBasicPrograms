package recursionPrograms;

import java.util.Scanner;

public class StringReverseRec {
	
	public static String reverse(String str) {
		if(str.isEmpty()) {
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		
		String str = "Java is my superpower";
		String revs = reverse(str);
		System.out.println("String in reverse order: " + revs);
		
		// using Scanner
		System.out.print("Enter string: ");
		Scanner in = new Scanner(System.in);
		String str2 = in.nextLine();
		in.close();
		
		String revs2 = reverse(str2);
		System.out.println("Reverse order: " + revs2);
		

	}

}
