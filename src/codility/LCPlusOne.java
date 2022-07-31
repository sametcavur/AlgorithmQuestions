package codility;

import java.util.Arrays;

public class LCPlusOne {
	/*
	 * Input:  [1,2,3]   Output: [1,2,4] 
	 * Input:  [4,3,2,1]   Output: [4,3,2,2] 
	 * Input:  [9]    Output: [1,0]
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 9, 9 };
		System.out.println(Arrays.toString(plusOne(arr)));
	}

	public static int[] plusOne(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] < 9) {
				int value = array[i];
				array[i] = value + 1;
				return array;
			}
			array[i] = 0;
		}

		int[] nums = new int[array.length + 1];
		nums[0] = 1;
		return nums;
	}

}
