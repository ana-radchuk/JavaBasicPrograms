package arraysPrograms;

import java.util.Scanner;

public class ArrayAsc {

	public static void main(String[] args) {
		
		int counter, temp;
		
		System.out.print("How many numbers do you want to enter?: ");
		Scanner in = new Scanner(System.in);
		counter = in.nextInt();
		
		int nums[] = new int[counter];
		for(int i = 0; i < counter; i++) {
			System.out.print("Array Element No. " + (i + 1) + ": ");
			nums[i] = in.nextInt();
		}
		in.close();
		
		for(int i = 0; i < counter; i++) {
			for(int j = i + 1; j < counter; j++) {
				if(nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		System.out.print("Array in Ascending Order: ");
//		for(int i = 0; i < counter; i++) {
//			System.out.print(nums[i] + " ");
//		}
		
		for(int i = 0; i < counter - 1; i++) {
			System.out.print(nums[i] + ", ");
		}
		System.out.print(nums[counter - 1]);
		
		
		
	}

}
