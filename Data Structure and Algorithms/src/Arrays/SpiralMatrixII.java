package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class SpiralMatrixII {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(Arrays.toString(generateMatrix(n)));
        sc.close();

	}
	public static int[][] generateMatrix(int n) {
        int[][] m=new int[n][n];
        
        int left=0;
        int right=n;
        int bottom=n;
        int top=0;
        int count=1;
        while(left < right && top < bottom ){
            
            //from left to right ( top end )
            for(int i=left;i<right;i++)
                   m[top][i]=count++; 
            top=top+1;
            //from top to bottom ( right end )
            for(int i=top;i<bottom;i++)
                 m[i][right-1]=count++;
            
            right =right-1;
            //from right to left (bottom end)
            for(int i=right-1;i>=left;i--)
                m[bottom-1][i]=count++;
                
            bottom =bottom -1;
            //form bottom to top (left end )
            for(int i=bottom-1;i>=top;i--)
                m[i][left]=count++;
                
            left=left+1;
        }
        return m;
    }

}
