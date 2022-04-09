package Recursion;
import java.util.*;

// What is Subsequence ?
// It is a subset of array of contigous and non contigous but must follow same order 
public class ArraySubsequences {
    public static void main(String[] args) {
        int[]  arrs = {3,2,1};
        List<Integer> list = new ArrayList<>();
        printSubseq(0,arrs,list);
    }
    public static void printSubseq(int i, int[] arr,List<Integer> list){
        if(i == 3){
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
}
