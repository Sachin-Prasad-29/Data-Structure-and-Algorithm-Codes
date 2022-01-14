package maths;

public class FastPower {

	public static void main(String[] args) {
		System.out.println(fastPowerSimple(2,4));
		System.out.println(fastPowerMod(256778,466,10000000));
		System.out.println(solve(9,8));

	}
public static int fastPowerSimple(int a,int b) {
	int res=1;
	while(b>0) {
		if((b&1)!=0) {
			res=res*a;
		}
		a=a*a;
		b=b>>1;
    }
	return res;
}

public static long fastPowerMod(long a,long b,long n) {
	long res=1;
	while(b>0) {
		if((b&1)!=0) {
			res=(res%n * a%n)%n;
		}
		a=(a%n * a%n)%n;
		b=b>>1;
    }
	return res;
}


public static int solve(int A, int B) {
    int count=0;
    if(A<B)
        count =count+(A-1);  //count =1
    else
        count =count+(B-1);
    


    if(A<(9-B))
        count =count+(A-1); 
    else
        count =count+(9-B-1);
    


    if(A>(9-B))
        count =count+(8-A);
    else
        count =count+(8-9-B);
    


    if(A>B)
        count =count+(8-A);
    else
        count =count+(8-B);
    


    return count;
}

}
