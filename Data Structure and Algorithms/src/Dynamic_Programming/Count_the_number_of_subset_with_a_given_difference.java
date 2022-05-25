package Dynamic_Programming;

public class Count_the_number_of_subset_with_a_given_difference {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        int diff = 3;
        System.out.println(giveCountSubset(arr,diff)) ;
    }

    private static int giveCountSubset(int[] arr, int diff) {
        int n = arr.length;
        int sum = 0;
        for(int i : arr) 
            sum +=i;
        
        int x= (sum+diff)/2;
        System.out.println(x+" "+n);
        int[][] dp = new int[n+1][x+1];

        // Initiliazation
        for(int i = 0; i < n+1; i++)
            dp[i][0] = 1; 
        
        // Iteration (Buttom -up approach )
        for(int i =1; i < n+1; i++)
          for(int j = 1; j < x+1; j++){
              if(arr[i-1] <= j)
                dp[i][j] = dp[i-1][j-arr[i-1]]+dp[i-1][j];
              else 
                 dp[i][j] = dp[i-1][j];
          }

        return dp[n][x];
    }
}
