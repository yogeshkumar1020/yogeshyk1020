package week3;

public class day4_odd_index_uppercase {

	public static void main(String[] args) {
		String name1="yogesh";
	char[] word=name1.toCharArray();
	for (int i = 0; i < word.length; i++) {
		if (i%2!=0) {
			System.out.println(Character.toUpperCase(word[i]));
		} else {
			System.out.println(Character.toLowerCase((word[i])));
		}
			
		

	}
	
			
	}
	
}
