package codility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonDublicated {

	public static void main(String[] args) {
		//Listede tekrar etmeyen tek sayiyi ekrana bastirir.
		int[] array = {1,1,7,7,2,3,3,4,4};
		System.out.println(solution(array));
	}

	public static int solution(int[] array) {
		
		int nonDublicated = 0;
		
		List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
		
		List<Integer> singularArray = list.stream()
				.distinct()
				.collect(Collectors.toList());
		
		for (Integer integer : singularArray) {
			if(list.contains(integer)) {
				list.remove(integer);
			}
		}
		
		for (Integer integer : singularArray) {
			if(list.contains(integer)) {
				list.remove(integer);
			}else {
				nonDublicated = integer;
			}
		}
		return nonDublicated;
	}
}

//STRÝNG NONDUBLÝCATED
/* 
List<String> asList = new ArrayList<String>();
asList.add("1");
asList.add("1");
asList.add("2");
asList.add("3");
asList.add("3");
asList.add("3");
asList.add("4");
asList.add("4");

List<String> collect = asList.stream()
.distinct()
.collect(Collectors.toList());


for (String str : collect) {
	if(asList.contains(str))
	asList.remove(str);
}
String nonDublicated ="Cant find any item.";
for (String str : collect) {
	if(asList.contains(str))
	asList.remove(str);
	else {
		nonDublicated = str;
	}
}

System.out.println(nonDublicated);
*/