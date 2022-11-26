package week3Assignments;

import java.util.HashMap;
import java.util.Map;

public class NumberofOccurence {

	public static void main(String[] args) {
		int[] nums = {2,3,5,6,3,2,1,4,2,1,6,-1};
		//output: 2=3,3=2,5=1,6=2,1=2,4=1,-1=1
		
		Map<Integer,Integer> occ = new HashMap<Integer,Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			if(occ.containsKey(nums[i])) {
				Integer value = occ.get(nums[i]);
				occ.put(nums[i], value+1);
			}
			else {
				occ.put(nums[i], 1);
			}
		}
		System.out.println(occ);
		
	}

}
