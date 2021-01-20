package numberPrograms;

import java.util.Scanner;

public class Bitwise {
	// swappint two numbers using bitwise operator
	public static void main(String[] args) {
		System.out.print("Enter first number: ");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		System.out.print("Enter second number: ");
		int num2 = in.nextInt();
		in.close();
		
		num1 = num1 ^ num2;
		num2 = num1 ^ num2; 
		num1 = num1 ^ num2; 
		
		System.out.println("First number after swap: " + num1);
		System.out.println("Second number after swap: " + num2);
		
	}
	
}
