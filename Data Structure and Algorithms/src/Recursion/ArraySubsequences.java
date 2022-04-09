package Recursion;
import java.util.*;

import javax.print.PrintService;

// What is Subsequence ?
// It is a subset of array of contigous and non contigous but must follow same order 
public class ArraySubsequences {
    public static void main(String[] args) {
        int[]  arrs = {2, 3, 6, 7};
        int target = 7;
        List<Integer> list = new ArrayList<>();
        printSubseq(0,arrs,list);

        System.out.println(" With condition");
        printSequence(0,arrs,list,0,4);

        System.out.println(" Is any sequence present in the array : "+validSequence(0, arrs, 0, 6));
        
        System.out.println(" Total number of sequence are "+ countSequence(0, arrs, 0 , 8));
    }

    // we need to print all the sequence of the array without any conditions
    public static void printSubseq(int i, int[] arr,List<Integer> list){
        if(i == arr.length){
            System.out.println(list);
            return;
        }
        // take the next index element
        list.add(arr[i]);
        i++;
        printSubseq(i, arr, list);
        i--;
        list.remove(list.size()-1);
        printSubseq(i+1, arr, list);
    }

    // when we need to print the sequence with any condition 
     private static void printSequence(int i,int[] arr, List<Integer> list,int sum,int condition){
         if( i == arr.length){
                if(sum == condition){
                    System.out.println(list);
                }
                return;
         }
         list.add(arr[i]);
         sum += arr[i];
         printSequence(i+1,arr,list,sum,condition);
         list.remove(list.size()-1);
         sum -= arr[i];
         printSequence(i+1,arr,list,sum,condition);
       
     }
    // when we just need to find that there exist a answer or not (true or false)
    private static boolean validSequence(int i, int[] arr, int sum, int condition){
        if(i == arr.length){
            if(sum == condition)
                return true;
            else 
               return false;
        }

        
        sum += arr[i];
        if(validSequence(i+1, arr, sum, condition)== true)
            return true;

        sum -= arr[i];
        
        if(validSequence(i+1, arr,  sum, condition)== true)
            return true;

        return false;
    }

    // when we need to print all find the total number of sequence which stisfies the condition
     private static int countSequence(int i, int[] arr,int sum , int condition){
         if(i == arr.length){
                if(sum == condition ){
                    return 1;
                }
                else 
                    return 0;
         }
         sum +=arr[i];
         int l = countSequence(i+1, arr, sum, condition);
         sum -= arr[i];
         int j = countSequence(i+1, arr, sum , condition );

         return l+j;

     }
}
