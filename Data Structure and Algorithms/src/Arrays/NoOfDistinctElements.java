package Arrays;

public class NoOfDistinctElements {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,1,2,3,4,5,6,7};
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[j]==a[i] && j!=i)
					count++;	
			}
		}
		count=a.length-(count/2);
		System.out.println(count);

	}

}
