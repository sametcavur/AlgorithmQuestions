package codility;

public class LCCommonItemInLists {
	/*
	 * Input: strs = ["flower","flow","flight"] Output: "fl"
	 */

	public static void main(String[] args) {
		LCCommonItemInLists clas = new LCCommonItemInLists();
		String[] strings = { "flower", "flow", "flight" };

		System.out.println(clas.longestCommonresult(strings));
	}

	public String longestCommonresult(String[] array) {
		String result = array[0]; // flower
		for (int i = 1; i < array.length; i++) { // 3
			while (array[i].indexOf(result) != 0) {
				result = result.substring(0, result.length() - 1);
			}
		}

		return result;
	}
}
