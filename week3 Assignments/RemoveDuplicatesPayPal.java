package week3Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesPayPal {

	public static void main(String[] args) {
		String text = "PayPal India";
		
		char[] charArray = text.toCharArray();
		
		Set<Character> pay = new LinkedHashSet<Character>();
		for (Character each : charArray) {
			if(!each.equals(' ')) {
				pay.add(each);	
			}
			
		}
		System.out.println(pay);
		
		String output = "";
		for (Character character : pay) {
			output = output+character;
			
		}
		System.out.println(output);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Set<Character>charSet = new LinkedHashSet<Character>();
//		for (Character each : charArray) {
//			if (!each.equals(' ')) {
//				charSet.add(each);
//			}
//		}
//		System.out.println(charSet);
//		
//		String output ="";
//		for (Character character : charSet) {//P,a,y
//			output=output+character;
//		}
//		
//		System.out.println(output);
//		
//		
//		
//		
//		
//		
		
		
		
		
		
		
		
		
		
		

	
		
		
		
	