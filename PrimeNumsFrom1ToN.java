package numberPrograms;

import java.util.Scanner;

public class PrimeNumsFrom1ToN {

	public static void main(String[] args) {
		String primeNums = "";
		
		System.out.print("Enter the value of n: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		
		for(int i = 1; i <= num; i++) {
			int counter = 0;
			
			for(int j = i; j >= 1; j--) {
				if(i % j == 0) {
					counter += 1;
				}
			}
			if(counter == 2) {
				primeNums = primeNums + i + " ";
			}
		}
		System.out.println("Prime numbers are: " + primeNums);

	}

}
