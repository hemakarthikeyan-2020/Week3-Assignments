package week3Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class MissingNumbers {

	public static void main(String[] args) {
//		Remove the duplicates using Set
//		 * b) Make sure the set is in the ascending order
//		 * c) Iterate from the starting number and verify the next number is + 1
//		 * d) If did not match, that is the number
//		 * 
		int[] num = {1,2,3,4,3,6,7,8,9,10};
		
		Set<Integer> missing = new LinkedHashSet<Integer>();
//		for (Integer integer : i) {
//			missing.add(i);
		for (int i = 0; i < num.length; i++) {
			missing.add(num[i]);
			
		}
		System.out.println(missing);
//		for(int j=1;j<missing.size()+1;j++) {
//			if(!missing.contains(j)) {
//				System.out.println(j);
//			}
//		}
		
	}

}
