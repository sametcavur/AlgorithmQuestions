package codility;

import java.util.ArrayList;
import java.util.List;

public class LCSearchInsertPosition {

	/*
	 * Input olarak verdigimiz target'in listede geçebilecegi index numarasini donduren program
	 * 
	 * Input:[1,3,5,6], target = 5   -   Output: 2 
	 * 
	 * Input:[1,3,5,6], target = 2   -   Output: 1 
	 * 
	 * Input:[1,3,5,6], target = 7   -   Output: 4
	 */
	public static void main(String[] args) {
		LCSearchInsertPosition lc = new LCSearchInsertPosition();
		int[] array = { 1, 3, 5, 6, 7, 8, 9, 11 };
		System.out.println(lc.searchInsert(array, 10));
	}

	public int searchInsert(int[] nums, int target) {
		List<Integer> list = new ArrayList<>();
		for (int i : nums) {
			list.add(i);
		}

		Integer biggestValue = list.get(list.size() - 1);
		if (target > biggestValue) {
			return list.size();
		}

		for (int i = 0; i < list.size(); i++) {
			Integer value = list.get(i);
			if (value >= target) {
				return i;
			}
		}
		return -1;
	}
}
