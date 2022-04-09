package Recursion;

/**
 * fibonaciee
 */
 import java.util.*;
public class fibonaciee {
   public static void main(String[] args) {
       int n = 0;
       System.out.println(" Fibonachii oF N is "+ fibo(n));
   }
   private static int fibo(int n){
       if(n <= 1)
           return n;
        return fibo(n-1)+fibo(n-2);
   }
    
}