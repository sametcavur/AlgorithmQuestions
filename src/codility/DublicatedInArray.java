package codility;

public class DublicatedInArray {
	// Listedeki tekrar edeni konsola yazdirir.
	public static void main(String[] args) {
		String[] array = { "ali", "samet", "sefa", "mehmet", "sefa" };

		System.out.println(solution(array));
	}

	private static String solution(String[] array) {
		
		String dublicatedWord = "";
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			String word = array[i];
			count = 0;
			for (int j = 0; j < array.length; j++) {
				if(word.equals(array[j])) {
					count ++;
				}
				if(count == 2) {
					dublicatedWord = word;
				}
			}
		}
		return dublicatedWord;
	}
	
}
