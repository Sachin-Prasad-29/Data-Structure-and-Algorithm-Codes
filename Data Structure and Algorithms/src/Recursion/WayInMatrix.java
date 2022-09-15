package Recursion;

import java.util.Scanner;

public class WayInMatrix {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter rows and column of the matrix");
			int m=sc.nextInt();
			int n=sc.nextInt();
			System.out.println("No of ways are - "+countWay(m,n));
		}

	}
	public static int countWay(int n,int m) {
		if(m==1 || n==1) {
			return 1;
		}
		return countWay(n-1,m)+countWay(n,m-1);
	}

}
