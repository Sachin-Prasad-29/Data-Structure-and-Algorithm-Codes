package Test_Questions;

import java.util.*;

class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter the no of test to be performed");
        int noOfTest = sc.nextInt();
        int t=1;
        while(t <= noOfTest){
        	//System.out.println("Enter the no of Bags");
            int noOfbags = sc.nextInt();
            //System.out.println("Enter the no of Students");
            int noOfStudents = sc.nextInt();
            
            int[] bagArr = new int[noOfbags];
            for(int i= 0; i < noOfbags; i++){
                bagArr[i]=sc.nextInt();
            }
            int totalCandies = 0;
            for(int i= 0; i < noOfbags; i++){
                totalCandies +=bagArr[i];
            }
            int noOfpieces = totalCandies / noOfStudents;
            int ans= totalCandies-(noOfStudents*noOfpieces);
            System.out.println("Case #"+t+": "+ans);
            t++;
        }
    }
}