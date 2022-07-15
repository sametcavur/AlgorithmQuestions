package codility;

import java.util.ArrayList;
import java.util.List;

public class LCPalindromeWords {
	public static void main(String[] args) {

		LCPalindromeWords clas = new LCPalindromeWords();
		System.out.println(clas.isPalindrome("saas"));
	}

	public boolean isPalindrome(String word) {
		char[] wordArray = word.toCharArray();
		List<Character> wordList = new ArrayList<>();
		List<Character> reverseList = new ArrayList<>();

		for (Character character : wordArray) {
			wordList.add(character);
		}

		for (int i = wordList.size(); i > 0; i--) {
			reverseList.add(wordList.get(i - 1));
		}

		if (reverseList.equals(wordList)) {
			return true;
		} else {
			return false;
		}
	}
}
