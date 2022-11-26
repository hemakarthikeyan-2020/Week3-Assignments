package week3Assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		String name = "We learn java basics as part of java sessions in java week1";
		
		String[] split = name.split(" ");
		Set<String> duplicateString = new HashSet<String>();// This Set for print the duplicate string only which is '[java,java,java]'
		Set<String>duplicate = new HashSet<String>(); // This set for print the single string [java]alone
			for (int i = 0; i < split.length; i++) {
				boolean add = duplicateString.add(split[i]);
				if(!add) {
					duplicate.add(split[i]);
				}
			}
			System.out.println(duplicate);
	}

}
