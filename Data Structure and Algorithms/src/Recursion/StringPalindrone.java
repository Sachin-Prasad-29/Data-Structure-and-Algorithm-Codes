package Recursion;
import java.util.Scanner;


public class StringPalindrone {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    System.out.println(stringPalindrone(a,0,a.length()-1));
  }
	public static boolean stringPalindrone(String a,int l,int r) {
		if(l>=r) {
			return true;
		}
		if(a.charAt(l) != a.charAt(r)) {
			return false;
		}
		return stringPalindrone(a,l+1,r-1);
	}
}
 