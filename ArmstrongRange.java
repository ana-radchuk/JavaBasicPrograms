package numberPrograms;

import java.util.Scanner;

public class ArmstrongRange {

	// program to print Armstrong numbers between a given range
	public static void main(String[] args) {
		int temp, num, rem, counter = 0;
		
		System.out.print("Enter start number: ");
		Scanner in = new Scanner(System.in);
		int start = in.nextInt();
		System.out.print("Enter end number: ");
		int end = in.nextInt();
		in.close();
		
		for(int i = start + 1; i < end; i++) {
			temp = i;
			num = 0;
			
			while(temp != 0) {
				rem = temp % 10;
				num += Math.pow(rem, 3);
				temp /= 10;
			}
			
			if(i == num) {
				if(counter == 0) {
					System.out.print("Armstrong numbers: ");
				}
				System.out.print(i + " ");
				counter++;
			}
		}
		
		if(counter == 0) {
			System.out.println("There are no Armstrong numbers.");
		}

	}

}
