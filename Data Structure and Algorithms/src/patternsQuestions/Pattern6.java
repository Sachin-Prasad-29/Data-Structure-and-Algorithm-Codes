package patternsQuestions;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		
		/*
				 
		       * 
		      * * 
		     * * * 
		    * * * * 
		   * * * * * 
		  * * * * * * 
		 * * * * * * * 
		* * * * * * * * 
		 * * * * * * * 
		  * * * * * * 
		   * * * * * 
		    * * * * 
		     * * * 
		      * * 
		       * 	 
				 
		*/
						
					 Scanner sc=new Scanner(System.in);
					 System.out.println(" Enter the no of rows in Pattern ");
					 int r=sc.nextInt();//c=sc.nextInt();
					 
					 for(int i=1;i<=2*r-1;i++) {
						 
						 if(i<=r) {
							 for(int j=1;j<=r-i;j++)
								 System.out.print(" ");
						    for(int j=1;j<=i;j++) 
						    	System.out.print("* ");
						 }
						 else {
							 for(int j=i-r;j>0;j--)
								 System.out.print(" ");
							 for(int j=2*r-i-1;j>=0;j--)
								 System.out.print("* ");
						 }
						 System.out.println();
						    
					 }

sc.close();
			}
	
}
