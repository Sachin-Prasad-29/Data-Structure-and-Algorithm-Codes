package Recursion;

import java.util.Scanner;

public class towerOfHanoi {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		char s='a';
		char h='b';
		char d='c';
		solve(n,s,h,d,Example.a);
		System.out.println(Example.a);
	}
	public static void solve(int n,char s,char h,char d,int a) {
		if(n==1) {
			System.out.println(s+" -> "+d);
			return;
			
		}
		solve(n-1,s,d,h,Example.a+1);
		System.out.println(s+" -> "+d);
		solve(n-1,h,s,d,Example.a+1);
     }

}
class Example {
    public static int a=0;
}