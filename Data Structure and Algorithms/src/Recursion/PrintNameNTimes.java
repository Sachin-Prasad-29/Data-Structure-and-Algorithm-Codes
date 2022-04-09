package Recursion;

import java.util.*;

public class PrintNameNTimes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of times name should print");
        int n = sc.nextInt();
        printName(n);

    }
    private static void printName(int n){
            if(n < 1)
                return ;
            System.out.println("Sachin");
            printName(--n);

    }
    
}
