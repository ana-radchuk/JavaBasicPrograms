package numberPrograms;

import java.util.Scanner;

public class SquareRoot {
	
	// to find square root without sqrt() method
	static double calculateSquareRoot(int number) {
		double temp;
		double sr = number / 2;
		
		do {
			temp = sr;
			sr = (temp + (number / temp)) / 2;
		} while ((temp - sr) != 0);
		
		return sr;	
	}
	
	public static void main(String[] args) {
		System.out.print("Enter number: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		
		System.out.println("Square root of " + num + " is: " + calculateSquareRoot(num));
		
		

	}

}
