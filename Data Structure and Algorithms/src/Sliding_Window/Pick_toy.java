package Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class Pick_toy {

	public static void main(String[] args) {
		String toys="abaccab";
		int max_toy_type=2;
        System.out.println("max no of toys is "+ pickToys(toys,max_toy_type));
	}

	private static int pickToys(String s, int k) {
		int n=s.length();
		int i=0,j=0;
		int max=0;
		 Map<Character,Integer> map=new HashMap<>();
		 
		while(j<n) {
			if(map.containsKey(s.charAt(j)))
				map.put(s.charAt(j),map.get(s.charAt(j))+1);
			else map.put(s.charAt(j), 1);
			
			if(map.size()<k) j++;
			
			if(map.size()==k) {
				max=Math.max(max,j-i+1);
				j++;
			}
			if(map.size()>k) {
				while(map.size()>k) {
					if(map.get(s.charAt(i))==1) 
						map.remove(s.charAt(i));
					else 
						map.put(s.charAt(i),map.get(s.charAt(i))-1);
					i++;
				}
				if(map.size()==k)
					max=Math.max(max, j-i+1);
				j++;
			}
		}
		return max;
	}

}
