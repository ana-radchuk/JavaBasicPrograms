package numberPrograms;

import java.util.Scanner;

public class PerfectSquareCheck {
	
	static boolean checkPerfectSquare(double x) {
		double sq = Math.sqrt(x);
		return((sq - Math.floor(sq)) == 0);
	}
	

	public static void main(String[] args) {
		System.out.print("Enter number: ");
		Scanner in = new Scanner(System.in);
		double num = in.nextDouble();
		in.close();
		
		if(checkPerfectSquare(num)){
			System.out.println(num + " is a perfect square number.");
		} else {
			System.out.println(num + " is not a perfect square number.");
		}

	}

}
