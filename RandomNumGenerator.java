package numberPrograms;

import java.util.Random;

public class RandomNumGenerator {

	public static void main(String[] args) {
		Random r = new Random();
		System.out.println("Random Numbers: ");
		
		// while loop
		int i = 1;
		while(i <= 5) {
			i++;
			System.out.print(r.nextInt(500) + "\t");
		}
		
		// for loop
//		for(int i = 1; i <= 5; i++) {
//			System.out.println(r.nextInt(500));
//		}

	}

}
