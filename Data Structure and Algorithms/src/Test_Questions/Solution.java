package Test_Questions;

import java.util.*;

class Solution{
    
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,8};
            int VAL = 0;
        for(int i = 0 ; i < arr.length; i++){
            int count = 0;
            int n = 14;
            while(n != 0){
              int pow = minpower(n);
              n = n -(int) Math.pow(2,pow);
              count++;
        }
        VAL = Math.max(count,VAL);
      }
      System.out.println(VAL);
    }
    private static int minpower(int n)
    {
        int count =0;
        if(n==0 || n==1) { return 0; }
        while(n != 1)
        {
            n = n/2;
            count++;
            
        }
        return count;
    }

}
