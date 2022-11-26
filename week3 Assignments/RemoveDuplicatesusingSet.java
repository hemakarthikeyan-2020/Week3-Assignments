package week3Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesusingSet {

	public static void main(String[] args) {
		String name = "We learn java basics as part of java sessions in java week1";
		
		String[] split= name.split(" ");
		
		Set <String> duplicates = new LinkedHashSet<String>();
		for (int i = 0; i < split.length; i++) {
			duplicates.add(split[i]);
		}
		
		
		System.out.println(duplicates.toString().replace(",",""));
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	

