package stringsPrograms;

public class PhraseReverse {
	
	public void reverse(String str) {
		
//		// to reverse one word
//		String reverse = "";
//		for(int i = str.length() - 1; i >= 0; i--) {
//			reverse += str.charAt(i);
//		}
//		System.out.println(str);
//		System.out.println(reverse);
		
		//	to reverse a phrase with spaces	
		String[] words = str.split(" ");
		String reversePhrase = "";
		
		for(int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for(int j = word.length() - 1; j >= 0; j--) {
				reverseWord += word.charAt(j);
			}
			reversePhrase = reversePhrase + reverseWord + " ";
		}
		
		System.out.println(str);
		System.out.println(reversePhrase + "\n");
	}

	
	public static void main(String[] args) {
		PhraseReverse obj = new PhraseReverse();
		obj.reverse("java");
		obj.reverse("java is my superpower");
		
	}

}
