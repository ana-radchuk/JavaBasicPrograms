package stringsPrograms;

public class VowelConsonantCount {

	public static void main(String[] args) {
		String str = "Java Programming";
		str = str.toLowerCase();
		
		int v = 0, c = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				v++;
			} else if(ch >= 'a' && ch <= 'z') {
				c++;
			}
		}
		
		System.out.println("Vowels: " + v);
		System.out.println("Consonants: " + c);

	}

}
