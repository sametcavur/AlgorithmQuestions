package codility;

import java.util.ArrayList;
import java.util.List;

public class LCValidParentheses {
	/*
	 * Input:"()" 	Output: true
	 * Input:"()[]{}" 	Output: true
	 * Input: "(]"	Output: false
	 */
	public static void main(String[] args) {
		LCValidParentheses parentheses = new LCValidParentheses();
		System.out.println(parentheses.isValid("[](){}"));
	}

	public boolean isValid(String word) {
		boolean result = true;
		char[] charArray = word.toCharArray();
		List<Character> list = new ArrayList<>();
		for (char c : charArray) {
			list.add(c);
		}
		
		if(list.size() % 2 ==1) {
			return false;
		}

		for (int i = 0; i < list.size(); i++) {
			Character character = list.get(i);
			if (character.equals('(')) {
				Character character2 = list.get(i + 1);
				if (!character2.equals(')')) {
					result = false;
				}
				i++;
				continue;
			}
			if (character.equals('{')) {
				Character character2 = list.get(i + 1);
				if (!character2.equals('}')) {
					result = false;
				}
				i++;
				continue;
			}
			if (character.equals('[')) {
				Character character2 = list.get(i + 1);
				if (!character2.equals(']')) {
					result = false;
				}
				i++;
				continue;
			}
		}
		return result;
	}
}
