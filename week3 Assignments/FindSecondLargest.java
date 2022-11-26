package week3Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};

		Set<Integer> output = new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			output.add(data[i]);
	}
		System.out.println("The Element in the Treeset is: " +output);
		
		List<Integer> setToList = new ArrayList<Integer>(output);
		int size = output.size();
		System.out.println("The Size is:" +size);
		System.out.println("The Second largest Number is: " +setToList.get(size-2));

		
		
		
		
		 //Sample Program
//		Arrays.sort(data);
//		
//		for (int i = 0; i < data.length; i++) {
//			System.out.println(data[i]);
//			
//		}
//		
//		System.out.println("The Second Largest Number is :" +data[data.length-2]);
//		
	}

}
