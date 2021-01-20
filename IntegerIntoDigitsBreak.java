package numberPrograms;

import java.util.Scanner;

public class IntegerIntoDigitsBreak {

	public static void main(String[] args) {
		int digit, count = 0;
		
		System.out.print("Enter number: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		
		int temp = num; 
		
		while(num > 0) {
			num /= 10;
			count ++;
		}
		
		while(temp > 0) {
			digit = temp % 10;
			System.out.println("Digit at place No. " + count + " is: " + digit);
			temp /= 10;
			count--;
		}

	}

}
