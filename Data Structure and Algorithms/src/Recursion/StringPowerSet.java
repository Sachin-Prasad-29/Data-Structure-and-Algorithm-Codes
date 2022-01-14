package Recursion;

import java.util.Scanner;

public class StringPowerSet {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		powerSet(s,0,"");

	}
	public static void powerSet(String s,int i,String cur) {
		if(i==s.length()) {
			System.out.println(cur);
			return;
		}
		powerSet(s,i+1,cur+s.charAt(i));
		powerSet(s,i+1,cur);
	}

}
