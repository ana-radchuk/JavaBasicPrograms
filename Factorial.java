package recursionPrograms;

import java.util.Scanner;

public class Factorial {
	
	int calculateFactorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		int output = calculateFactorial(n-1) * n;
		return output;
	}
	
//	static int calculateFactorial(int n) { 
//	if(n == 0 || n == 1) {
//		return 1;
//	}
//	int output = calculateFactorial(n - 1) * n;
//	return output;
//}

	public static void main(String[] args) {

		Factorial f = new Factorial();
		System.out.print("Enter number: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		int output = f.calculateFactorial(n);
		System.out.println("Factorial is: " + output);
		
//		System.out.print("Enter number: ");
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		in.close();
//		
//		int factorial = calculateFactorial(n);
//		System.out.println("Factorial is: " + factorial);
		
	}

}
