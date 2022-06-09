public class Word {
	public static void main(String[] args) {
		Word word = new Word("Hello World");
		System.out.println(word.isVowel(0));
		System.out.println(word.isVowel(1));
	}
	private String letters;
	
	public Word(String letters) {
		this.letters = letters.toLowerCase();
		// this.letters = new String(letters.toLowerCase());
	}
	
	// i 번째 글자가 모음인지 a,i,u,e,o
	public boolean isVowel(int i) {
		boolean result;
		switch (letters.charAt(i)) {
		case 'a' :
			result = true;
			break;
		case 'i' :
			result = true;
			break;
		case 'e' :
			result = true;
			break;
		case 'u' :
			result = true;
			break;
		case 'o' :
			result = true;
			break;
		default :
			result = false;
		}
		return result;
	}
}
