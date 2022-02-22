package practiceQuestion;

import java.util.HashSet;
import java.util.Scanner;

public class Solution {
	public static void main(String args[])
	{
		String s="thequickbrownfoxjumpsoverthelazydog";
		System.out.println(checkIfPangram(s));
	}

	public static boolean checkIfPangram(String s) {
        HashSet<Character>  hash=new HashSet<>();
        for(int i=0;i<s.length();i++){
            hash.add(s.charAt(i));
        }
        System.out.println(hash.size());
        
        if(hash.size()==27){
            return true;
        }
        
        return false;
    }
}


