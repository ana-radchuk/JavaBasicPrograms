package recursionPrograms;

import java.util.Scanner;

public class PalindromeCheckRec {
	
	public static boolean isPal(String s) {
		if(s.length() == 0 || s.length() == 1) {
			return true;
		}
		if(s.charAt(0) == s.charAt(s.length() - 1)) {
			return isPal(s.substring(1, s.length() - 1));
		}
		return false;		
	}

	public static void main(String[] args) {
		
		System.out.print("Enter String: ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine().toLowerCase();
		in.close();
		
		if(isPal(str)) {
			System.out.println(str + " is a palindrome.");
		} else {
			System.out.println(str + " is not a palindrome");
		}

	}

}
