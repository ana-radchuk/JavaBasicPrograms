package numberPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestNums {

	public static void main(String[] args) 
			throws NumberFormatException, IOException {
		// if else
		int num1 = 10, num2 = 20, num3 = 17;
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println(num1 + " is the largest number.");
		} else if(num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " is the largest number.");	
		} else {
			System.out.println(num3 + " is the largest number.");
		}
		
		// nested if
		int num21 = 15, num22 = 28, num23 = 13;
		
		if(num21 >= num22) {
			if(num21 >= num23) {
				System.out.println(num21 + " is the largest number.");
			} else {
				System.out.println(num23 + " is the largest number.");
			}
		} else if (num22 >= num21) {
			if(num22 >= num23) {
				System.out.println(num22 + " is the largest number.");
			} else {
				System.out.println(num23 + " is the largest number.");
			}
		} 
		
		// ternary operator & bufferedReader
		
		System.out.print("Enter first number: ");
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		int num31 = Integer.parseInt(br.readLine());
		System.out.print("Enter second number: ");
		int num32 = Integer.parseInt(br.readLine());
		System.out.print("Enter third number: ");
		int num33 = Integer.parseInt(br.readLine());
		br.close();
		
		int result = num33 > (num31 > num32 ? num31 : num32) ? 
				num33 : ((num31 > num32) ? num31 : num32);
		
//		int temp = num31 > num32 ? num31 : num32;
//		int result = num33 > temp ? num33 : temp;
		
		
		System.out.println(result + " is the largest number.");
		
	}

}
