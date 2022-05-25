package Dynamic_Programming;
import java.util.*;
public class print_longest_common_subsequence {
   public static void main(String[] args) {
       String s1 = "ABCDEF";
       String s2 = "ABGKEF";
       int M = s1.length();
       int N = s2.length();
       
       System.out.println(printLCS(s1,s2,M,N));
       
   }

private static String printLCS(String s1, String s2, int M, int N) {
    int[][] t = new int[M+1][N+1];
    // Filling every gap with -1
    for(int[] row : t)
        Arrays.fill(row,-1);

    // Initalization
    for(int i = 0; i < M+1; i++)
        t[i][0] = 0;
    for(int i = 0; i < N+1; i++)
        t[0][i]= 0;
    
    // TABULATION APPROACH (BUTTOM UP )
    for(int i = 1; i < M+1; i++)
        for(int j = 1; j < N+1; j++){
            if(s1.charAt(i-1) == s2.charAt(j-1))
               t[i][j] = 1+ t[i-1][j-1];

            else
                t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
        }

    
    for(int i = 0 ; i < M+1; i++){
        System.out.print(" [ ");
        for(int j  = 0 ; j < N+1; j++){
            System.out.print(t[i][j]+" , ");
        }
        System.out.print(" ] ");
        System.out.println();
    }
    
    int i = M;
    int j = N;
    StringBuilder sb = new StringBuilder();
    while(i != 0 || j != 0){
        if(s1.charAt(i-1) == s2.charAt(j-1)){
            sb.append(s1.charAt(i-1));
            i--;
            j--;
        }
        else if(t[i-1][j] > t[i][j-1]){
            i--;
        }
        else 
           j--;
        
    }
    System.out.println(sb.toString());
    return sb.reverse().toString();
} 
}
