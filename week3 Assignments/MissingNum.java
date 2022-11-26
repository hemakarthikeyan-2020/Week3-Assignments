package week3Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class MissingNum {

	public static void main(String[] args) {
		 
		int[] nums = {1,2,3,5,6,7,7,8,9,10};
		
		Set<Integer> removeDuplicates = new LinkedHashSet<Integer>();
		
		for (Integer dupl : nums) {
			removeDuplicates.add(dupl);
		}
		System.out.println(removeDuplicates);
		
		for(int i = 0; i<removeDuplicates.size()+1; i++) {
			if(!removeDuplicates.contains(i)) {
				System.out.println("Missing Number is: " +i);
			}
		}
			
		

	}

}
