package Dynamic_Programming;

public class Count_Of__subset_sum_with_a_given_sum {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,0,1};
        int sum = 1;

        System.out.println("No of subset are"+countSubset(arr,sum,arr.length));
    }

    private static int countSubset(int[] arr, int sum, int N) {
        int[][] dp = new int[N+1][sum+1];
        // Initialization 
        for(int i = 0 ; i < N+1; i++)
           dp[i][0] = 1;
        for(int i = 1; i < sum+1; i++)
           dp[0][i] = 0;
        
        // Iteration process
        for(int i = 1; i < N+1; i++)
           for(int j = 1; j < sum+1; j++)
              if(arr[i-1] <= j){
                  dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j];
              }
              else
                 dp[i][j] = dp[i-1][j];
               
        return dp[N][sum];
    }
}
