package codility;

import java.util.ArrayList;
import java.util.List;

public class LCPanlindromeNumber {
	//Verilen sayiyinin tersi ile düzü ayný ise palindromdur,
	
	public static void main(String[] args) {
		LCPanlindromeNumber clas = new LCPanlindromeNumber();
		System.out.println(clas.isPalindrome(989));
	}

	public boolean isPalindrome(int x) {
		char[] charArray = String.valueOf(x).toCharArray();
		List<Character> list = new ArrayList<>();
		for (char c : charArray) {
			list.add(c);
		}

		List<Character> prevList = new ArrayList<>();

		for (int i = list.size(); i > 0; i--) {
			prevList.add(list.get(i - 1));
		}
		System.out.println(prevList);

		if (list.equals(prevList))
			return true;
		else
			return false;
	}

}
