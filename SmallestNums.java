package numberPrograms;

import java.util.Scanner;

public class SmallestNums {

	public static void main(String[] args) {
		System.out.print("Enter first number: ");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		System.out.print("Enter second number: ");
		int num2 = in.nextInt();
		System.out.print("Enter third number: ");
		int num3 = in.nextInt();
		in.close();
		
		int temp = num1 <= num2 ? num1 : num2;
		int result = num3 < temp ? num3 : temp;
		
		System.out.print(result + " is the smallest number");
		
	}

}
