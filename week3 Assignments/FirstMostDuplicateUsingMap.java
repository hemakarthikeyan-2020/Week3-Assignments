package week3Assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;	

public class FirstMostDuplicateUsingMap {

	public static void main(String[] args) {
		String text = "abbaba";
		//Output:b
		
		Map<Character,Integer> dup = new HashMap<Character,Integer>();
		char[] charArray = text.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			if(dup.containsKey(charArray[i])) {  //Next times find 'a' 
				Integer value = dup.get(charArray[i]); //Get the 'a'
				dup.put(charArray[i],value+1); //increases the value as a=2
			}
			else {
				dup.put(charArray[i], 1); //a=1
			}
		}
		System.out.println(dup);
		
		Set<Entry<Character,Integer>> entrySet = dup.entrySet();
		int maxOccurrence=0;
		char Key=0;
		for(Entry<Character,Integer>entry: entrySet) {
		    
		    if(entry.getValue()>maxOccurrence)
		{
		    Key=entry.getKey();
		    maxOccurrence=entry.getValue();
		}
		    
		    Key=entry.getKey();
		    maxOccurrence=entry.getValue();
		}
		
		System.out.println("No of Occurence: "+ " " +maxOccurrence);
		System.out.println("character: "+ " " +Key);

		

		}
	}


//String text="abbaba";
//Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
//char[] charArray= text.toCharArray();
//for(char ch : charArray)
//{
//    
//    map.put(ch, map.getOrDefault(ch,0)+1) ;   
//    }
//System.out.println(map);
//Set<Entry<Character,Integer>> entrySet = map.entrySet();
//int maxOccurrence=0;
//char Key=0;
//for(Entry<Character,Integer>entry: entrySet) {
//    
//
//    if(entry.getValue()>maxOccurrence)
//{
//    Key=entry.getKey();
//    maxOccurrence=entry.getValue();
//}
//    Key=entry.getKey();
//    maxOccurrence=entry.getValue();
//
//}
//System.out.println("no of occurence"+  maxOccurrence);
//System.out.println("character"+ Key);
