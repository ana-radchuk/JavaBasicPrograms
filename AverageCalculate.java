package arraysPrograms;

import java.util.Scanner;

public class AverageCalculate {

	public static void main(String[] args) {
		double[] array = {25, 7.45, 51, 12.7};
		double total = 0;
		
		for(int i = 0; i < array.length; i++) {
			total += array[i];
		}
		
		double average = total / array.length; 
		
		System.out.printf("The average is: %.2f", average);
		
		
		// same method but using Scanner
		System.out.print("How many numbers you wish to enter: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		double[] array2 = new double[n];
		double total2 = 0;
		
		for(int i = 0; i < array2.length; i++) {
			System.out.print("Enter Element No." + (i + 1) + ": ");
			array2[i] = in.nextDouble();
		}
		in.close();
		
		for(int i = 0; i < array2.length; i++) {
			total2 += array2[i];
		}
		
		double average2 = total2 / array2.length;
		System.out.printf("The average is %.2f", average2);
	}

}
