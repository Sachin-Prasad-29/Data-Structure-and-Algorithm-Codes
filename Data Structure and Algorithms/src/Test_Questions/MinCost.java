package Test_Questions;
import java.util.*;
public class MinCost {
    public static void main(String[] args) {
        int[] arr = {-30,-67,-47,64,-67,-89,-68,-48,-6,48,35,8,23,-33,76,33,89};
        System.out.println(" The minimum cost of the arr is :"+find_Min_Cost(arr));
    }

    private static int find_Min_Cost(int[] arr) {
        int n = arr.length;
        int ans = 0;
        Arrays.sort(arr);
        for(int i = 1 ; i < n-1; i++){
            int a = Math.abs(arr[i-1] - arr[i]);
            int b = Math.abs(arr[i] - arr[i+1]);
            ans += a+b;
             System.out.println(+arr[i]+" a = "+a+" b = "+b+" ans = "+ans);
            i++; 
        }
        return ans;
    }
    
}
