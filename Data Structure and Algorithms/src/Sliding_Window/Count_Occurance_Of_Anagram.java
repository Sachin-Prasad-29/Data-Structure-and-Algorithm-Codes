package Sliding_Window;

import java.util.HashMap;

public class Count_Occurance_Of_Anagram {

	public static void main(String[] args) {
		String s="aabaabaa";
		String p="baaa";
		
		System.out.println("Occurance of AnaGram is "+searchAnagram(s,p));
	}

	private static int searchAnagram(String s, String p) {
		int n=s.length();
		int window_size=p.length();
		HashMap<Character,Integer> map=new HashMap<>();
		for(char c:p.toCharArray())
			map.put(c, map.getOrDefault(c,0)+1);
		
		
		//System.out.println(map);
		//System.out.println();
		int start=0,end=0;
		int count=map.size();
		int ans=0;
		
		while(end < n) {
			
			if(map.containsKey(s.charAt(end))) {
			//	System.out.println(s.charAt(end));
				map.put(s.charAt(end),map.get(s.charAt(end))-1);
				if(map.get(s.charAt(end))==0) count--;
			}
		//	System.out.println(map);
			if(end-start+1< window_size)
				end++;
			
			else if(end-start+1 == window_size) {
				if(count==0) ans++;
				 if(map.containsKey(s.charAt(start))) {
					  map.put(s.charAt(start), map.get(s.charAt(start))+1);
					  if(map.get(s.charAt(start))==1) count++;
					  }
				 
				 start++;
				 end++;
			}
		}
		return ans; 
	}

}






