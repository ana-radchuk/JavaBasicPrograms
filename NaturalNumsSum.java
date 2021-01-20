package numberPrograms;

import java.util.Scanner;

public class NaturalNumsSum {

	public static void main(String[] args) {
		// using while loop		
		int num = 10, i = 1, total = 0;
		
		while(i <= num) {
			total += i;
			i++;
		}		
		System.out.println("Sum of first 10 natural numbers is: " + total);

		// using for loop
		int num2 = 10, total2 = 0;
		
		for(int i2 = 1; i2 <= num2; i++) {
			total2 += i2;
		}		
		System.out.println("Sum of the first 10 natural numbers is: " + total2);
				
		// using Scanner
		int total3 = 0;
		
		System.out.print("Enter number: ");
		Scanner in = new Scanner(System.in);
		int num3 = in.nextInt();
		in.close();
		
		for(int i3 = 1; i3 <= num3; i3++) {
			total3 += i3;
		System.out.println("Sum of the first " + num3 + " natural numbers is: " + total3);
		}
		
	}		

}
