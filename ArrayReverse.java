package arraysPrograms;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		
		int counter, i = 0, j = 0, temp;		
		
		System.out.print("How many numbers do you want to enter?: ");
		Scanner in = new Scanner(System.in);
		counter = in.nextInt();
		
		int[] nums = new int[counter];
		for(i = 0; i < counter; i++) {
			System.out.print("Enter Array No. " + (i + 1) + ": ");
			nums[i] = in.nextInt();
		}
		
		in.close();
		
		j = i - 1;
		i = 0;
		
		while(i < j) {
			temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}
		
		System.out.print("Array in reverse order: ");
		for(i = 0; i < counter; i++) {
			System.out.print(nums[i] + " ");
		}
		
		
		
		
	}

}
