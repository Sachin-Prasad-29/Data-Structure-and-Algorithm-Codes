package leetcodeDaily;

import java.util.Scanner;

public class AddBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		
		String b=sc.nextLine();
		System.out.println(addBinary(a,b));

	}
	
	 public static String addBinary(String a, String b) {
		 char[] aArray=a.toCharArray();
		 char[]  bArray=b.toCharArray();
		  int i= aArray.length-1;
		  int j= bArray.length-1;
		   int aCount;
		   int bCount;
		   int carry=0;
		   StringBuilder sb= new StringBuilder();
		   
		   while(i>-1 || j>-1 || carry==1) {
			   if(i>-1) 
				   aCount=Character.getNumericValue(aArray[i--]);
			   else
				   aCount=0; //here we are taking the last value of the a stirng as it is 1 or 0
			   if(j>-1) 
			        bCount=Character.getNumericValue(bArray[j--]);
			   else 
			    	bCount=0;
			   
			   sb.append(aCount^bCount^carry);
			    
			   carry=(aCount+bCount+carry>=2)?1:0;
		   }
		   sb.reverse();
		   return sb.toString();
		   }

}
