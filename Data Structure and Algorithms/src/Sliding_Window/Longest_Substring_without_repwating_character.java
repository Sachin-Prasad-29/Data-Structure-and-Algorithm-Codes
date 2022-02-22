package Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class Longest_Substring_without_repwating_character {

	public static void main(String[] args) {
		String s="aabcaaabcade";
		
		
		System.out.println(longestStringWithoutRepeating(s));

	}

	private static int longestStringWithoutRepeating(String s) {
		int i=0;
		int n=s.length();
		Map<Character,Integer> map= new HashMap<>();
		int j=0;
		int maxLen=0;
		while(j< n) {
			if(map.containsKey(s.charAt(j)))
                map.put(s.charAt(j),map.get(s.charAt(j))+1);
            else map.put(s.charAt(j),1);
			
            if(map.size() > j-i+1) j++;
             
             else if(map.size() == j-i+1){
                 maxLen=Math.max(maxLen,j-i+1);
                 j++;
             }
             else if(map.size()< j-i+1){
                 while(map.size()< j-i+1){
                     if(map.get(s.charAt(i))==1)
                        map.remove(s.charAt(i));
                     else 
                       map.put(s.charAt(i),map.get(s.charAt(i))-1);
                     i++;
                 }
                 if(map.size()==j-i+1)
                	 maxLen=Math.max(maxLen,j-i+1);	 
                 j++;
             }
             
         }
		return maxLen;
	}

}
