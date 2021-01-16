package arraysPrograms;

public class ArraySum {

	public static void main(String[] args) {
		int[] array = {15, 45, 15, 67, 98};
		int total = 0;
		
		for(int nums: array) {
			total += nums;
		}
		
//		for(int i = 0; i < array.length; i++) {
//			total += array[i]; 
//		}

		System.out.println(total);
	}

}
