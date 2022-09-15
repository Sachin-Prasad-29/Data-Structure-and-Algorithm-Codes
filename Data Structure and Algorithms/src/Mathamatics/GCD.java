package Mathamatics;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("GCD of "+a+" & "+b+" is "+gcd(a,b));
		
		sc.close();
	}
    public static int gcd(int a,int b) {
    	if(b==0)
    		return a;
    	return gcd(b,a%b);
    }
}
