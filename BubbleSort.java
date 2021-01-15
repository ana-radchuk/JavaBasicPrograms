package stringsPrograms;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		String str[] = {"Suzy", "Arthur", "Ricky", "Jack"};
		String temp;
		System.out.println("Array to be sort: " + Arrays.toString(str));
		System.out.println("Strings in sorted order: ");
		
		for(int i = 0; i < str.length; i++) {
			for(int j = i + 1; j < str.length; j++) {
				if(str[j].compareTo(str[i]) < 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
			System.out.println(str[i]);
		}
		
	}

}
