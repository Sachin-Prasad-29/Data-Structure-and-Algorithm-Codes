package Arrays;

import java.util.Scanner;

public class StockBuyAndSell {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rate as per day basis :");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("The amx Profit is "+maxProfitStock(a,n));
	
	}

	private static int maxProfitStock(int[] a, int n) {
			int minSofar=a[0];
			int max_Profit=0;
			for(int i =0;i<n;i++) {
				minSofar=Math.min(minSofar, a[i]);
				int profit=a[i]-minSofar;
				max_Profit=Math.max(max_Profit, profit);
			}

		return max_Profit;
	}
	
	

}
