package BruteForceSolution;

public class Four_Sum_II {

	public static void main(String[] args) {
		int[] num1= {1,2,-1,-2};
		int[] num2= {-2,-1,2,0};
		int[] num3= {-1,2,-2,3};
		int[] num4= {0,2,-1,-3};
		
		System.out.println("No of combination which given Zero of sum are" +fourSumCount(num1, num2, num3, num4));

	}

	private static int fourSumCount(int[] num1, int[] num2, int[] num3, int[] num4) {
		int count=0;
		for(int i:num1)
			for(int j:num2)
				for(int k:num3)
					for(int l:num4)
						if(i+j+k+l==0) {
							System.out.println(i+" "+j+" "+k+" "+l);
							count++;
						}
		return count;
	}

}
