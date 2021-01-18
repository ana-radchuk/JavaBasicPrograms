package recursionPrograms;

import java.util.Scanner;

public class NumberRecursion {

	public static void main(String[] args) {
		int num = 0;
		int reverse = 0;
		
		System.out.print("Enter number: ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		in.close();
		
		while(num != 0) {
			reverse = reverse * 10;
			reverse += num % 10;
			num = num / 10;
		}

		System.out.println("Reverse input: " + reverse);
		
	}

}
