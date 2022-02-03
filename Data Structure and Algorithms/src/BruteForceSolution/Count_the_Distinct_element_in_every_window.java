package BruteForceSolution;

public class Count_the_Distinct_element_in_every_window {

	public static void main(String[] args) {
		int[] a= { 1,2,2,1,3,1,1,3};
		int k= 4;
		int n=a.length;
		for(int i=0;i<=n-k+1;i++) {
			int count=0;
			for(int j=i;j<k+i;j++) {
				 boolean flag=true;
				 
				for(int l=j;l>=i;l--) {
					if(a[j]==a[l] && j!=l)
						flag =false;
				}
				
				if(flag) count++;
				
			}
			System.out.println(count);
		}

	}

}
