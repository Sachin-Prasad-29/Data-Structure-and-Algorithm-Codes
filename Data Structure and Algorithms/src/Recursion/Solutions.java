package Recursion;

import java.util.Scanner;

public class Solutions {
	 // function to find the smallest number
	 static int smallest(int num)
	 {
	     // initialize frequency of each digit to Zero
	     int[] freq = new int[10];
	     
	     while (num > 0)
	     {
	         int d = num % 10; 
	         freq[d]++; 
	         num = num / 10; 
	     }
	   
	    int result = 0;
  for (int i = 1 ; i <= 9 ; i++)
	         {
	                 if (freq[i] != 0)
	             {
	                     result = i;
	                     freq[i]--;
	                 break;
	             }
	         }
	   
	         
	         
	         for (int i = 0 ; i <= 9 ; i++)
	             while (freq[i]-- != 0)
	                 result = result * 10 + i;
	      
//	      
	     return result;
	 }
	   

	 public static void main(String args[])
	 {
		 Scanner sc =new Scanner(System.in);
	     int num = sc.nextInt();
	     System.out.println(smallest(num));
	      
	    
	 }
	}
