package BackTracking;

public class NQueens {

	public static void main(String[] args) {
		NQueenProblem Queen =new NQueenProblem();
        Queen.solveNQ();
	}

}
class NQueenProblem {
	final int N=4;
	boolean solveNQ(){          //This is first method
		int[][] board= {
		        		{0,0,0,0},
		        		{0,0,0,0},
		        		{0,0,0,0},            //We created a empty board of4*4
		        		{0,0,0,0} };
		if(solveNQUtil(board,0)==false) {
			System.out.println("solution desnot exist");
			return false;
		}
		printSolution(board);
		return true;
	}
	
	
	boolean solveNQUtil(int board[][],int col){     //This is Second method
		if(col>=N)
			return true;       // if means that we reached last col an dother queen satisfies all condition
		
		for(int i=0;i<N;i++) {    // loop for the same column and all rows 
			
          if(isSafe(board,i,col)) {   //isSafe method will check thar we can place that queen in that loction or not
        	  board[i][col]=1;    // Check if the queen can be placed on board[i][col]
        	  
        	  if(solveNQUtil(board,col+1)==true)
        		  return true;   //basically it will can recurivisly and check 
        	                    //       wheather or a specific postion of queen is every queen can we palced 
        	                    //if not the change the postion of the queen and per form backtracking 
        	  board[i][col]=0; //BackTracking
          }
		}
		return false;
	}
	
	
	boolean isSafe(int board[][],int row ,int col){   //This id Third Method 
		int i,j;
		
		for(i=0;i<col;i++)
			if(board[row][i]==1)   //check this row on left side 
				return false;
		
		for(i=row,j=col;i>=0 && j>=0;i--,j--) {
			if(board[i][j]==1)      //check upper diagonal on the left side            
				return false;
		}
		for(i=row,j=col;j>=0 &&i<N;i++,j--)
			if(board[i][j]==1)
				return false;     //check lower diagonal on the left side
		
		return true;
		
	}
	
	
	void printSolution(int board[][]){
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(" "+board[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(" "+board[j][i]+" ");
				
			}
			System.out.println();
		}
	}
	
	
}
