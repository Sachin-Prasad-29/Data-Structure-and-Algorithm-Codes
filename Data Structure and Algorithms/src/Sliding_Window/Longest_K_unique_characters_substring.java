package Sliding_Window;

import java.util.HashMap;

public class Longest_K_unique_characters_substring {

	public static void main(String[] args) {
		String s="aabacccaba";
		int n=s.length();
		int k=2;
		System.out.println(longestkSubstr( s, k));

	}
	public static  int longestkSubstr(String s, int k) {
        int max=0;
        boolean flag=false;
         HashMap<Character,Integer> map= new HashMap<>();
         int n=s.length();
         int i=0;
         int j=0;
         
         while( j < n ){
             if(map.containsKey(s.charAt(j)))
                 map.put(s.charAt(j),map.get(s.charAt(j))+1);
             else map.put(s.charAt(j),1);
             
             if(map.size()<k) j++;
             
             else if(map.size() == k){
            	 flag=true;
                 max=Math.max(max,j-i+1);
                 j++;
             }
             else if(map.size()> k){
                 while(map.size()>k){
                     if(map.get(s.charAt(i))==1)
                        map.remove(s.charAt(i));
                     else 
                       map.put(s.charAt(i),map.get(s.charAt(i))-1);
                     i++;
                 }
                 j++;
             }
             
         }
         if(flag) return max;
         return -1;
    }

}
