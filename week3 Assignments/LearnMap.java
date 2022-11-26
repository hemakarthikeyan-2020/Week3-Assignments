package week3Assignments;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) {
		String text = "Hema";
		//Output:a=3,m=1,z=1,o=1,i=2,d=1,n=2
		
		Map<Character,Integer> occ = new LinkedHashMap<Character,Integer>();
		
		char[] charArray = text.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			if(occ.containsKey(charArray[i])) {
				Integer value = occ.get(charArray[i]);//value =1
				occ.put(charArray[i], value+1); 
			}
			else {
				occ.put(charArray[i], 1);// H=1,e=1,m=1,a=1
			}
		}
		System.out.println(occ);

	}

}
