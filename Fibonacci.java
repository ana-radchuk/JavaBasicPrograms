package basicPrograms;

public class Fibonacci {

	public static void main(String[] args) {
		
		// for loop
		int count = 7, num1 = 0, num2 = 1;
		System.out.print("Fibonacci Sequence of " + count + " numbers: ");
		
		for(int i = 1; i <= count; i++) {
			System.out.print(num1 + " ");
			
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
		
		System.out.println();
		
		// while loop
		int count2 = 7, num21 = 0, num22 = 1;
		System.out.print("Fibonacci Sequence of " + count + " numbers: ");
		
		int i = 1; 
		while(i <= count) {
			System.out.print(num21 + " ");
			int sum2 = num21 + num22;
			num21 = num22;
			num22 = sum2;
			i++;
		}
		

	}

}
