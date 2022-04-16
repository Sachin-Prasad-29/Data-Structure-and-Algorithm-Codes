package bitManupilation;

import java.util.*;

public class PowerSubSet {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        
        printSubSet(arr);
    }

    private static void printSubSet(int[] arr) {
        int n = arr.length;
       List<List<Integer>> ans = new ArrayList<>();
        for(int num = 0 ; num < Math.pow(2, n); num++){
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i< n;i++){
                if((num & ( 1<< i)) !=0){
                    list.add(arr[i]);
                }
            }
            ans.add(new ArrayList<>(list));
        }
        System.out.println(ans);
    }
}
