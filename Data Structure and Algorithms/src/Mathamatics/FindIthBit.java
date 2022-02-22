package Mathamatics;

public class FindIthBit {

	public static void main(String[] args) {
		int n=8;
		int pos=1;
		int mask=1<<(pos-1);
		if((mask & n)!=0)
			System.out.println("Its One at that position");
		else 
			System.out.println(" Its Zero at that position");

	}

}
