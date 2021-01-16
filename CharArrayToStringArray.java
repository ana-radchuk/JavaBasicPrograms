package arraysPrograms;

public class CharArrayToStringArray {

	public static void main(String[] args) {
		
		// 1. using string object
		char[] ch = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'm', 'y', ' ', 
				's', 'u', 'p', 'e', 'r', 'p', 'o', 'w', 'e', 'r' };
		
		String str = new String(ch);
		System.out.println(str);
		
		// 2. using valueOf() method
		String str2 = String.valueOf(ch);
		System.out.println(str2);

	}

}
