package Recursion;

import java.util.Scanner;

public class Josephus {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers of players and K value - ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println("the final player is - "+jos(m,n));
		

	}
	public static int jos(int n,int m) {
		if(n==1) {    //base condition 
			return 0;
		}
		return (jos(n-1,m)+m)%n ; //Trust your function 

}
}