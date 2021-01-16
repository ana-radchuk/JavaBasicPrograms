import java.util.Scanner;

public class AlphabeticalOrder {
	// arrange strings in alphabetical order
	public static void main(String[] args) {
		
		int count;
		String temp;
		
		System.out.print("Enter number of strings: ");
		Scanner in = new Scanner(System.in);
		count = in.nextInt();
		
		String [] str  = new String[count];
		
		System.out.print("Enter strings one by one: ");
		Scanner in2 = new Scanner(System.in);
		for(int i = 0; i < count; i++) {
			str[i] = in2.nextLine();
		}
		in.close();
		in2.close();
		
		for(int i = 0; i < count; i++) {
			for(int j = i + 1; j < count; j++) {
				if(str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		
		System.out.print("Sorted Strings: ");
		for(int i = 0; i <= count - 1; i++) {
			System.out.print(str[i] + " ");
		}
				
				
				
	}

}
