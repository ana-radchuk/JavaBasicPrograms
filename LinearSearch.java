package sortingSearchingPrograms;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int i;
		
		System.out.print("How many numbers do you wish to enter?: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("Enter " + n + " numbers: ");
		for(i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}
		
		System.out.print("What element do you wish to find?: ");
		int e = in.nextInt();
		in.close();
		
		for(i = 0; i < n; i++) {
			if(array[i] == e) {
				System.out.print(e + " is found at index " + i);
				break;
			}
		}
		
		if(i == n) {
			System.out.println(e + " is not found in the array.");
		}

	}

}
