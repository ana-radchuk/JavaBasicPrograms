package numberPrograms;

//import java.util.Scanner;

public class ArmstrongCheck {

	public static void main(String[] args) {
		int num = 370, total = 0;
		
		int i = num;
		while(i != 0) {
			int temp = i % 10;
			total += Math.pow(temp, 3);
			i /= 10;
		}
		
		if(total == num) {
			System.out.println(num + " is an Armstrong number.");
		} else {
			System.out.println(num + " is not an Armstrong number.");
		}

		// using scanner
//		int total = 0;
		
//		System.out.print("Enter 3-digit number: ");
//		Scanner in = new Scanner(System.in);
//		int num = in.nextInt();
//		in.close();
//		
//		for(int i = num; i != 0; i /= 10) {
//			int temp = i % 10;
//			total += Math.pow(temp, 3);
//		}
//		
//		if(total == num) {
//			System.out.println(num + " is an Armstrong number.");
//		} else {
//			System.out.println(num + " is not an Armstrong number");
//		}
		
	}

}
