package numberPrograms;

import java.util.Scanner;

public class FirstPrimeNums {

	public static void main(String[] args) {
		int status = 1, n = 3;
		
		System.out.print("Enter the value of n: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		
		if(num >= 1) {
			System.out.println("Prime numbers: ");
			System.out.println(2);
		}
		
		for(int i = 2; i <= num;) {
			for(int j = 2; j <= Math.sqrt(n); j++) {
				if(n % j == 0) {
					status = 0;
					break;
				}
			}
			if(status != 0) {
				System.out.println(n);
				i++;
			}
			status = 1;
			n++;
		}		

	}

}
