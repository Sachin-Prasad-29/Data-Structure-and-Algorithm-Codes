package patternsQuestions;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		/*
		 *   *****
             *****
             *****
             *****
             *****
 
		  */
		
	 Scanner sc=new Scanner(System.in);
	 System.out.println(" Enter the no of rows an column in Pattern ");
	 int r=sc.nextInt(),c=sc.nextInt();
	 
	 for(int i=1;i<=r;i++) {
		 for(int j=1;j<=c;j++)
			 System.out.print("*  ");
		 System.out.println();
	 }

	}

}
