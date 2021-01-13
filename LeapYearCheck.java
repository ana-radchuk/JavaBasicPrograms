package basicPrograms;

import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
		
		int year;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Year: ");
		year = in.nextInt();
		in.close();
		
		boolean isLeap = false;
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					isLeap = true;
				}
			} else {
				isLeap = false;
			}
		} else {
			isLeap = false;
		}
		
		if(isLeap == true) {
			System.out.println("YES! " + year + " is a Leap Year.");
		} else {
			System.out.println("NO! " + year + " is not a Leap Year.");
		}
		
	}

}
