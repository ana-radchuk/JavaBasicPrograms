package numberPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositiveNegativeCheck {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.print("Enter number: ");
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		if(n > 0) {
			System.out.println(n + " is positive number.");
		} else if(n < 0) {
			System.out.println(n + " is negative number.");
		} else { 
			System.out.println(n + " is neither positive of negative");
		}
		
	}

}
