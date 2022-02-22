package Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class MInimum_Window_subarray {

	public static void main(String[] args) {
		String s="qTqqqqqqqqqqqqAqqqqqqqqqqqqqqqT";
		String t="TAT";
		// we have given two string s is large and t is small string
	    /*
	     now we have to find string t in string s substrings and return the 
	     shortest among them
	     e.g- s= T W V T R T G A W A T G T 
	          T= T A T 
	          S substrings are IN which we get our string T as repeatition is 
	          allowed 1. T W V T R T G A W A T G T
	                  2. T W V T R T G A W A T
	                  3. T W V T R T G A
	                  4. T R T G A
	                  5. A T G T  (ANSWER BECAUSE IT IS MINIMUM SIZE FORM ALL)
	    */  
        System.out.println("the size of minimum subarray is "+minimum_Window_subarray(s,t));
	}

	private static String minimum_Window_subarray(String s, String t) {
		int n=s.length();
		// 	make one hashmap to store the character and there count in string 
		Map<Character,Integer> map=new HashMap<>();
		for(char c:t.toCharArray()) {
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c,1);
		}
		System.out.println(map);
		int count =map.size();
		int i=0, j=0;
		int min_length=Integer.MAX_VALUE;
		int final_start=0;
		int final_end=0;
		
		while(j < n) {
			if(map.containsKey(s.charAt(j))) {  // kya char at j present hai hamare map me ?agar ha then
				map.put(s.charAt(j),map.get(s.charAt(j))-1); // decrement its count value 
			   if(map.get(s.charAt(j))==0) count--;
			}
			if(count > 0)
				j++;
			
			else if(count==0) {
				if(min_length>j-i+1) {
					min_length=j-i+1;
					final_start=i;
					final_end=j;
				}
				while(count==0) {
					if(map.containsKey(s.charAt(i))) {
						map.put(s.charAt(i),map.get(s.charAt(i))+1);
						if(map.get(s.charAt(i))>0) count++;
						i++;
					}
					else i++;
					if(count==0)
						if(min_length>j-i+1) {
							min_length=j-i+1;
							final_start=i;
							final_end=j;
						}
				}
				j++;
			}
		}
		
		if(min_length==Integer.MAX_VALUE) return "";
		return s.substring(final_start, final_end+1);
	}

}








