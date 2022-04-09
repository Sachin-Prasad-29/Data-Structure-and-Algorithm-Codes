import java.util.ArrayList;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        int[]  candidates = {1,1,1,2,2};
        int target = 4;

        List<List<Integer>> ans = new ArrayList<>();
        
         if(candidates.length == 0) 
             System.out.println(" no answer");
        allCombinationSum(0, candidates,ans, target,new ArrayList<>());
       System.out.println(ans);

    }
    private static void allCombinationSum(int index, int[] arr, List<List<Integer>> ans, int target, List<Integer> list){
        if(i == arr.length){
                if(target == 0){
                    System.out.println(list);
                    ans.add(new ArrayList<>(list));
                }
        }   
        int Prev = Integer.MIN_VALUE;
        for(int i = index; i< arr.length; i++){
            if(Prev != arr[i] && arr[i] <= target){
                list.add(arr[i]);
                allCombinationSum(i+1, arr, ans, target-arr[i], list);
                list.remove(list.size()-1);

            }
        }     
    }
}
