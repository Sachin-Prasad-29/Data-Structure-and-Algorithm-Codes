package bitManupilation;

import java.util.ArrayList;
import java.util.*;

public class CountingBits {
    public static void main(String[] args) {
        int n = 37;
        
        int max= 0;
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i< 32; i++){
            if((n & 1<<i) != 0 ){
                ans.add(i);
                max = Math.max(max, i);
            }
        }
        int[] res = new int[ans.size()];
        for(int i = 0; i< ans.size();i++){
            res[i]=Math.abs(ans.get(i)-max)+1; 
        }
        Arrays.sort(res);
        System.out.println(res.length);
        for(int a : res)
         System.out.println(a);
    }
}
