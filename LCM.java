package numberPrograms;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		int temp, temp1, temp2;
		
		System.out.print("Enter first number: ");
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		System.out.print("Enter second number: ");
		int num2 = in.nextInt();
		in.close();
		
		temp1 = num1;
		temp2 = num2;
		
		while(temp2 != 0) {
			temp = temp2; 
			temp2 = temp1 % temp2;
			temp1 = temp;
		}
		
		int hfc = temp1;
		int lcm = (num1 * num2) / hfc;
		
		System.out.println("LCM is: " + lcm);
		

	}

}
