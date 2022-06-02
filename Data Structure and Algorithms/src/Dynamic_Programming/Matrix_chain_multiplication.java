package Dynamic_Programming;

public class Matrix_chain_multiplication {
    public static void main(String[] args) {
        int[] arr = {40,20,30,10,30};
        int N = arr.length;
       
        System.out.println("Minimum cost is : "+ minCost(arr, 1,N-1));
    }

    private static int minCost(int[] arr, int i, int j) {
        if(i >= j) return 0;
        int cost = Integer.MAX_VALUE;
        for(int k = i; k <= j-1;k++){
            int tempCost = minCost(arr, i, k) + minCost(arr, k+1, j)+ arr[i-1]*arr[k]*arr[j];
            if(tempCost < cost)
               cost = tempCost;
        }
        return cost;
    }
}
