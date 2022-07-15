package codility;

import java.util.Arrays;

public class LCTwoSum {
	public static void main(String[] args) {
		/*
		Input: nums = [2,7,11,15], target = 9
		Output: [0,1]
		Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
		 */
		int[] array = {2,7,11,15};
		
		LCTwoSum solution = new LCTwoSum();
		int[] twoSum = solution.twoSum(array, 17);
		System.out.println(Arrays.toString(twoSum));
	}

	public int[] twoSum(int[] nums, int target) {
		
		int numberOne = 0;
		int numberTwo = 0;
		int[] solution = new int[2];
		for (int i = 0; i < nums.length; i++) {
			numberOne = nums[i];
			for (int j = 0; j < nums.length; j++) {
				numberTwo = nums[j];
				if(numberOne + numberTwo == target) {
					solution[0] = j;
					solution[1] = i;
					break;
				}
			}
		}
		return solution;
	}
}
