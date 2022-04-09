package Recursion;
import java.util.*;
public class CombinationSumIWthReapeatation {
    public static void main(String[] args) {
        int[]  candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> ans = new ArrayList<>();
        
         if(candidates.length == 0) 
             System.out.println(" no answer");
        AllCombinationSum(0, candidates,ans, target,new ArrayList<>());
       System.out.println(ans);

    }

    private static void AllCombinationSum(int i, int[] arr, List<List<Integer>> ans, int target, List<Integer> list){
        
        if( i == arr.length){
            if(target == 0){
                System.out.println(list);
                ans.add(new ArrayList<>(list));
            }
                return;
            }
        
        if(target >= arr[i]){
            list.add(arr[i]);
            AllCombinationSum(i,arr,ans,target-arr[i],list);
            list.remove(list.size()-1); 
        }
        AllCombinationSum(i+1,arr, ans, target , list);
    }
    
}
