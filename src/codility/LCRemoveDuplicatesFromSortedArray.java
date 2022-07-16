package codility;

import java.util.Arrays;
import java.util.List;

public class LCRemoveDuplicatesFromSortedArray {
	public static void main(String[] args) {
		//Listedeki tekrar edenlerin sayisini, tekrar etmeyen sayisi ve tekrar etmeyenlerin listesini veren program
		LCRemoveDuplicatesFromSortedArray lc = new LCRemoveDuplicatesFromSortedArray();
		int[] array = {0,0,1,1,1,2,2,3,4};
		lc.removeDuplicates(array);
	}

	public void removeDuplicates(int[] nums) {
		List<Integer> list1 = Arrays.stream(nums).boxed().toList();

		List<Integer> list2 = Arrays.stream(nums).boxed().distinct().toList();
	
		int count = list1.size() - list2.size();
		
		System.out.println("Liste = " + list1);
		System.out.println("Tekrar eden eleman sayisi = " + count);
		System.out.println("Kalan eleman sayisi = " + (list1.size() - count));
		System.out.println("Kalan elemanlar = " + list2);
	}
}