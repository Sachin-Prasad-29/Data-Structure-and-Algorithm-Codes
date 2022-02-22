package patternsQuestions;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
/*
 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 		 
 
*/
		
	 Scanner sc=new Scanner(System.in);
	 System.out.println(" Enter the no of rows in Pattern ");
	 int r=sc.nextInt();//c=sc.nextInt();
     
	 for(int i=1;i<=r;i++) {
		 for(int j=1;j<=i;j++) {
			 System.out.print(j+" ");
		 }
		 System.out.println();
	 }
	}

}
