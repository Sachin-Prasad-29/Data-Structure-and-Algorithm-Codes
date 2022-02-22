package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayCompare {

	public static void main(String[] args) {
		String s= "cbaebabacd";
		String p= "abc";
		ArrayList<Integer> res= findAnagrams(s,p);
		System.out.println(res);
	}

	private static ArrayList<Integer> findAnagrams(String s, String p) {
		ArrayList<Integer> res= new ArrayList<>();
		int n1=s.length();
		int n2=p.length();
		
		
	// here if size of any one of the string is zero or size of p string is greater then the s string 
	  if(n1==0 || n2==0 || n2>n1 ) return res;
	  
	  // Now create two 26 size int size array to store the frequency of s and p stirng character
	  
	  int[] P_fre=new int[26];
	  for(char c:p.toCharArray())
				P_fre[c-'a']++;
				
	// we have to take 
	  
		return null;
	}

}
