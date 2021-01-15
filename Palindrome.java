package stringsPrograms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

	public static void main(String[] args) {
		
		// to check if a string is a palindrome using stack 
		System.out.print("Enter string: ");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();
		
		Stack stack = new Stack();
		
		for(int i = 0; i < input.length(); i++) {
			stack.push(input.charAt(i));
		}
		
		String reverse = "";
		
		while(!stack.isEmpty()) {
			reverse += stack.pop();
		}
		
		if(input.equals(reverse)) {
			System.out.println("The String is a palindrome.");
		} else {
			System.out.println("The String is not a palindrome.");
		}
		
		// to check using queue
		System.out.print("Enter string: ");
		Scanner in2 = new Scanner(System.in);
		String input2 = in2.nextLine();
		in2.close();
		
		Queue q = new LinkedList();
		for(int i = input2.length()-1; i>=0; i--) {
			q.add(input2.charAt(i));
		}
		
		String reverse2 = "";
		
		while(!q.isEmpty()) {
			reverse2 += q.remove();
		}
		
		if(input2.equals(reverse2)) {
			System.out.println("The input is a palindrome.");
		} else {
			System.out.println("The input is not a palindrome.");
		}
		
		// to check using for loop
		String reverse3 = "";
		System.out.print("Enter string: ");
		Scanner in3 = new Scanner(System.in);
		String input3 = in3.nextLine();
		in3.close();
		
		for(int i = input3.length() - 1; i >= 0; i-- ) {
			reverse3 += input3.charAt(i);
		}
		
		if(input3.equals(reverse3)) {
			System.out.println("The input is a palindrome.");
		} else {
			System.out.println("The input is not a palindrome.");
		}
		
	}

}
