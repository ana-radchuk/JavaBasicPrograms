package numberPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCD {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// for loop
		int num1 = 55, num2 = 121, gcd = 0;
		
		for(int i = 1; i <= num1 && i <= num2; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		System.out.printf("GCD of %d and %d is: %d", num1, num2, gcd);
		System.out.println("\n");
		
		// while loop
		int num21 = 55, num22 = 121;
		
		while(num21 != num22) {
			if(num21 > num22) {
				num21 -= num22;
			} else {
				num22 -= num21;
			}
		}
		System.out.printf("GCD of %d and %d is: %d", num21, num22, num22);
		System.out.println("\n");

		// bufferedReader
		System.out.print("Enter first number: ");
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));	
		int num31 = Integer.parseInt(br.readLine());
		System.out.print("Enter second number: ");
		int num32 = Integer.parseInt(br.readLine());
		br.close();
		
		while(num31 != num32) {
			if(num31 > num32) {
				num31 -= num32;
			} else {
				num32 -= num31;
			}
		}		
		System.out.printf("CDG of %d and %d is: %d", num31, num32, num32);		
		
	}

}
