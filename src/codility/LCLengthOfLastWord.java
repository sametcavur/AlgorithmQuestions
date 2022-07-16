package codility;

public class LCLengthOfLastWord {
	public static void main(String[] args) {
		/*
		 Bir cumledeki son kelimeyi, kelimenin harf sayisini ve kelimenin basladigi index no yu bulan program.
		 */
		LCLengthOfLastWord clas = new LCLengthOfLastWord();
		clas.lengthOfLastWord("   flyme to the moon");
	}

	public void lengthOfLastWord(String word) {
		char[] array = word.toCharArray();
		String result = "";
		Integer indexNo = 0;
		
		for (int i = array.length-1; i > 0; i--) {
			if(word.substring(i-1,i).equals(" ")) {
				result = word.substring(i,array.length);
				indexNo = i-1;
				break;
			}
		}
		System.out.println("Son Kelime = " + result);
		System.out.println("Son Kelimenin Basladigi Index No = " + indexNo);
		System.out.println("Son Kelimedeki harf sayisi = "+result.length());
	}
}
