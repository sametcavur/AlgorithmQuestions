package codility;

import java.util.ArrayList;
import java.util.List;


public class LCMergeSortedArray{
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };

		merge(nums1, 3, nums2, 3);
	}

	static void merge(int[] nums1, int m, int[] nums2, int n) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		for (int i = 0; i < m; i++) {
			list1.add(nums1[i]);
		}
		for (int i = 0; i < n; i++) {
			list1.add(nums2[i]);
		}
		
		List<Integer> result = new ArrayList<Integer>();
		
		for (Integer integer : list1) {
			result.add(integer);
		}
		for (Integer integer : list2) {
			result.add(integer);
		}
		
		List<Integer> list = result.stream().sorted().toList();
		System.out.println(list);
		
	}
	
}
