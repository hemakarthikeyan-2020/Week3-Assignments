package week3Assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		
		Set<Character> uniqueChar = new HashSet<Character>();
		String name = "hemaah";
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			 boolean add = uniqueChar.add(charArray[i]);
			 if(!add) {
				if(uniqueChar.contains(charArray[i])) {
					uniqueChar.remove(charArray[i]);
				}
				else {
					uniqueChar.add(charArray[i]);
				}
			 }

			 	 
		}
		System.out.println(uniqueChar);
		

		
					
	}

}
