package Sliding_Window;
import java.util.*;
public class Count_Occurance_Of_Anagram_II {

	public static void main(String[] args) {
		String s="forxxorfxdofr";
		String p="for";
		
		System.out.println("Occurance of AnaGram is "+searchAnagram(s,p));

	}

	private static int searchAnagram(String s, String p) {
		int sn=s.length();
		int pn=p.length();
		int[] pArr=new int[26];
		int[] sArr=new int[26];
		
		for(char c:p.toCharArray())
			pArr[c-'a']++;
		System.out.println(Arrays.toString(pArr));
		
		int start=0, end=0;
		int count=0;
		while(end<sn) {
			sArr[s.charAt(end)-'a']++;
			
			if(end-start+1 < pn) end++;
			
			else if( end-start+1 == pn) {
				if(compareArray(sArr,pArr)) count++;
				sArr[s.charAt(start)-'a']--;
				start++;
				end++;
			}
		}
		
		return count;
		
	}

	private static boolean compareArray(int[] sArr, int[] pArr) {
		for(int i=0;i<26;i++)
			if(sArr[i]!=pArr[i]) return false;
		return true;
	}

}
