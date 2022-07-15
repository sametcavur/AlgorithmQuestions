package codility;

public class LCRomenToInteger {
	/*
	 * Input: "III"   Output: 3 Explanation: III = 3. Example 2:
	 * 
	 * Input: "LVIII" Output: 58 Explanation: L = 50, V= 5, III = 3. Example 3:
	 * 
	 * Input: "MCMXCIV" Output: 1994 Explanation: M = 1000, CM = 900, XC = 90 IV = 4.
	 * 
	 *  NOTE:
	 *  I can be placed before V (5) and X (10) to make 4 and 9. 
	 *	X can be placed before L (50) and C (100) to make 40 and 90. 
	 *	C can be placed before D (500) and M (1000) to make 400 and 900.
	 */
	public static void main(String[] args) {
		LCRomenToInteger romenToInteger = new LCRomenToInteger();
		System.out.println(romenToInteger.romanToInt("M CMXCIV"));
	}

	public int romanToInt(String number) {
		int result = 0;
		for (int i = 0; i < number.length(); i++) {
			if (i < number.length() - 1) {
				String otherNumber = number.substring(i, i + 2);
				int otherNum = this.otherNumberConverter(otherNumber);
				result += otherNum;
				if (otherNum != 0) {
					i = i + 1;
					continue;
				}
			}

			String first = number.substring(i, i + 1);
			int converter = this.converter(first);
			result += converter;
		}

		return result;
	}

	public int otherNumberConverter(String number) {
		if (number.equals("IV")) {
			return 4;
		}
		if (number.equals("IX")) {
			return 9;
		}
		if (number.equals("XL")) {
			return 40;
		}
		if (number.equals("XC")) {
			return 90;
		}
		if (number.equals("CD")) {
			return 400;
		}
		if (number.equals("CM")) {
			return 900;
		}
		return 0;
	}

	public int converter(String number) {
		if (number.equals("I")) {
			return 1;
		}
		if (number.equals("V")) {
			return 5;
		}
		if (number.equals("X")) {
			return 10;
		}
		if (number.equals("L")) {
			return 50;
		}
		if (number.equals("C")) {
			return 100;
		}
		if (number.equals("D")) {
			return 500;
		}
		if (number.equals("M")) {
			return 1000;
		}
		return 0;
	}
}
