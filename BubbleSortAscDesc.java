package sortingSearchingPrograms;

import java.util.Scanner;

public class BubbleSortAscDesc {

	public static void main(String[] args) {
		int temp;
		
		System.out.print("How many numbers do you wish to sort?: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("Enter " + n + " numbers: ");
		
		for(int i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}
		in.close();
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(array[i] > array[j + 1]) { // if you put here "<", you will get a descending order
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
		System.out.println("Sorted list: ");
		
		for(int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
		
	}

}
