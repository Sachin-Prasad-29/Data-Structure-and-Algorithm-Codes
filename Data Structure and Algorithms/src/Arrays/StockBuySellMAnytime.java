package Arrays;

import java.util.Scanner;

public class StockBuySellMAnytime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rate as per day basis :");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("The amx Profit is "+maxProfitStockmany(a,n));

	}

	private static int maxProfitStockmany(int[] a, int n) {
		int maxProfit=0;
		for(int i=1;i<n;i++) {
			if(a[i]>a[i-1]) {
				maxProfit+=a[i]-a[i-1];
			}
		}
		return maxProfit;
	}

}
