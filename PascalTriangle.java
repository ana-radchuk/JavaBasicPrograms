package basicPrograms;

import java.util.Scanner;

public class PascalTriangle {

	static int fctrl(int num) {
		int f;

		for (f = 1; num > 1; num--) {
			f *= num;
		}

		return f;

	}

	static int ncrmnt(int n, int r) {

		return fctrl(n) / (fctrl(n - r) * fctrl(r));
	}

	public static void main(String args[]) {

		System.out.print("How many rows do you wish to enter?: ");
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();
		in.close();

		System.out.println("Pascal Triangle:");
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(" " + ncrmnt(i, j));
			}
			System.out.println();
		}
		
	}
}