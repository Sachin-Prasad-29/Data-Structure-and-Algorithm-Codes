package Recursion;
import java.util.*;
public class Print1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no ");
        int n = sc.nextInt();
        printNumOne(1,n);
        System.out.println("This is the second way :");
        printNumTwo(++n);
        System.out.println("Printing the number from N to 1");
        printNto1(0,--n);
    }
    private static void printNumOne(int i, int n){
            if(i > n)
                return;
            System.out.println(i);
            printNumOne(++i, n);
    }

    private static void printNumTwo(int n){
            if(n <= 1)
                return ;
            printNumTwo(--n);
            System.out.println(n);
    }
    private static void printNto1(int i,int n){
        if( i>=n)
            return ;
        printNto1(++i,n);
        System.out.println(i);
    }

}
