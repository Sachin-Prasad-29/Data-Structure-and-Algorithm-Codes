package Mathamatics;

public class SetIthBit {

	public static void main(String[] args) {
		// at pos position set that bit value to one either if its one or zero
		int n=32;
		int pos=4 ;
		int mask=1<<(pos-1);
		n=n|mask;
		System.out.println(n);
		

	}

}
