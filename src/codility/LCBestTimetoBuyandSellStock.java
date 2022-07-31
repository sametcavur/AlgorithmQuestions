package codility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LCBestTimetoBuyandSellStock {
	public static void main(String[] args) {
		int[] array = {2,4,1};
		System.out.println(maxProfit(array));
	}

	public static int maxProfit(int[] prices) {
		
		List<Integer> list = Arrays.stream(prices).boxed().collect(Collectors.toList());
		
		int smallValue = list.get(0);
		int smallValueIndexNo = 0;
		for (int i = 1 ;  i < list.size() ; i++) {
				if(smallValue > list.get(i)) {
					smallValue = list.get(i);
					smallValueIndexNo = i;
			}
		}
		
		if(smallValue == list.get(list.size()-1)) {
			return 0;
		}
		
		int bigValue = list.get(smallValueIndexNo);
		int bigValueIndexNo = 0;
		for (int i = smallValueIndexNo + 1; i < list.size(); i++) {
				if(bigValue < list.get(i)) {
					bigValue = list.get(i);
					bigValueIndexNo = i;
			}
		}
		
		Integer big = list.get(bigValueIndexNo);
		Integer small = list.get(smallValueIndexNo);
		
		return big-small;
	}

}
