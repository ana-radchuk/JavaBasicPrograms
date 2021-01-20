package numberPrograms;

public class PrimeNumsAlternate {
	
	static boolean checkPrime(int num) {
		boolean isPrime = true;
		
		for(int i = 2; i <= num / 2; i++) {
			if(num % i == 0) {
				isPrime = false; 
				break;
			}
		}
		if(isPrime == false) {
			return false; 
		} else {
			return true;
		}
	}
	
	static void printPrimes(int n) {
		int temp = 2;
		
		for(int num = 2; num <= n-1; num++) {
			if(checkPrime(num) == true) {
				if(temp % 2 == 0) {
					System.out.print(num + " ");
				}
				temp++;
			}	
		}
	}

	public static void main(String[] args) {
		int num = 27; 
		System.out.print("Alternate prime numbers up to " + num + " are: ");
		printPrimes(num);
	}

}
