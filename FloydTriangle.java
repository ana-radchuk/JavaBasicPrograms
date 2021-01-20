package basicPrograms;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		int n = 1;
		
		System.out.print("How many rows for floyd's triangle do you wish?: ");
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();
		in.close();
		
		System.out.println("Floyd's triangle");
		
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(n + " ");
				n++;
			}
			System.out.println();
		}
		
	
	}

}
