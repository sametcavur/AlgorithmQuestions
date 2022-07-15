package codility;

public class BinaryGap {
	public static void main(String[] args) {

		System.out.println(binaryGap(10110));
	}

	public static int binaryGap(int number) {
		char[] charArray = Integer.toBinaryString(number).toCharArray();

		int total = 0;
		int result = 0;

 		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '0') { 
				total++;
				continue;
			} else {
				if (total > result) {
					result = total;
					total = 0;
				}
			}
		}
		return result;
	}
}
