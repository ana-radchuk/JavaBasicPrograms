package numberPrograms;

import java.util.Scanner;

public class PrimeNumCheck {

	public static void main(String[] args) {
		boolean isPrime = true;
		
		System.out.print("Enter number: ");
		Scanner in = new Scanner(System.in);		
		int num = in.nextInt();
		in.close();
		
		// using while loop
		int i = 2;
		while(i <= num / 2) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
			i++;
		}
		
//		for(int i = 2; i <= num / 2; i++) {
//		int temp = num % i;
//		if(temp == 0 ) {
//			isPrime = false;
//			break;
//		}
//	}
		
				
		if(isPrime) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}

	}

}
