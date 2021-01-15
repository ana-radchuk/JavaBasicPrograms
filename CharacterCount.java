package stringsPrograms;

public class CharacterCount {

	public void count(String str) {
		int[] counter = new int[256]; // ASCII values range up to 256

		for (int i = 0; i < str.length(); i++) {
			counter[str.charAt(i)]++;
		}

		char[] array = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			array[i] = str.charAt(i);

			int flag = 0;
			for (int j = 0; j <= i; j++) {
				if (str.charAt(i) == array[j]) {
					flag++;
				} 
			}	
			if (flag == 1) {
				System.out.println("Occurence: " + str.charAt(i) 
					+ " = " + counter[str.charAt(i)]);
			}
		}
	}

	public static void main(String[] args) {
		
		CharacterCount obj = new CharacterCount();
		obj.count("java");
	}

}
