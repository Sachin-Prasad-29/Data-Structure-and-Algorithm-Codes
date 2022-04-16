package BackTracking;
import java.util.*;
public class NQueens {
    
	public static void main(String[] args) {
		int n = 4;
		solveNQueen(n);
	}

	public static void solveNQueen(int n){
		HashSet<List<String>> ans = new HashSet<>();
        char[][] pos = new char[n][n];
        for(int i = 0; i< n ; i++)
            for(int j = 0; j < n; j++)
                 pos[i][j]='.';
        for(int j=0;j<n;j++)
	  //  System.out.println(Arrays.toString(pos[j]));
		NQueen(0,ans,pos,n);
		System.out.println(ans);
	}
    public static void NQueen(int col, HashSet<List<String>> ans, char[][] pos, int n){
		if(col == n){
			// for(char[] c:pos){
			// 	System.out.println(Arrays.toString(c));
			// }
			ans.add(construct(pos));
			
			return;
		}
		for(int row = 0; row < n; row++){
			if(isSafeToPut(col,row,pos,n)){
				pos[row][col]='Q';
				//for(int j=0;j<n;j++)
	           //    System.out.println(Arrays.toString(pos[j]));

				//System.out.println(row+" "+col+" 1 "+pos.length);
				NQueen(col+1,ans,pos,n);
				pos[row][col]='.';
				//System.out.println("2");
			}
		}
	}

	public static boolean isSafeToPut(int col, int row, char[][] pos,int n){
		int c = col;
		int r = row;
		//System.out.println(c +" "+r);
		while(c>=0){
			if(pos[r][c]=='Q') return false;
			c--;
		}
		c=col;
		//System.out.println(c +" "+r);
		while(r >= 0 && c >=0){
			//System.out.println(c +" in "+r);
			if(pos[r][c]=='Q') return false;
			r--;
			c--;
		}
		r= row;
		c= col;
		//System.out.println(c +" "+r);
		while(r<n && c>=0){
			if(pos[r][c] =='Q') return false;
			r++;
			c--;
		}

		return true;
	}

	private static List<String> construct ( char[][] pos){
		List<String> list = new ArrayList<String>();
		for(int i =0 ; i < pos.length; i++){
			String s = new String(pos[i]);
			list.add(s);
		}
		//System.out.println(list);
		return list;
	}
}