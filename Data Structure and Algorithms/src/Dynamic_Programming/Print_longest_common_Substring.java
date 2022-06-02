package Dynamic_Programming;
import java.util.*;
public class Print_longest_common_Substring {
    public static void main(String[] args) {
        String s1 = "ABffffCDaaEF";
        String s2 = "AB   ";
        int M = s1.length();
        int N = s2.length();
        
        System.out.println(printLCSub(s1,s2,M,N));
        
    }

    private static String printLCSub(String s1, String s2, int m, int n) {
        int[][] t = new int[m+1][n+1];

        // Filling every gap with -1
    for(int[] row : t)
        Arrays.fill(row,-1);

        // Initalization
    for(int i = 0; i < m+1; i++)
        t[i][0] = 0;
    for(int i = 0; i < n+1; i++)
        t[0][i]= 0;
    
        // Iteration process
        for(int i = 1; i < m+1; i++){
            for(int j =1; j< n+1; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1))
                    t[i][j] = 1+ t[i-1][j-1];
                else 
                    t[i][j]= 0;
            }
        }

        for(int i = 0 ; i < m+1; i++){
            System.out.print(" [ ");
            for(int j  = 0 ; j < n+1; j++){
                System.out.print(t[i][j]+" , ");
            }
            System.out.print(" ] ");
            System.out.println();
        }
        int index = 0;
        int endpoint = 0;
        for(int i = 0; i < m+1; i++){
            for(int j = 0 ; j < n+1 ; j++){
                if(index < t[i][j]){
                    index = t[i][j];
                    endpoint = j;
                }
            }
        }
        System.out.println(index+"  "+ endpoint);
        String ans = s2.substring(endpoint-index,endpoint);
        return ans;
    }
}
