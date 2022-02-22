package Recursion;

public class ReverseString {

	public static void main(String[] args) {
		String s="abcde";
		System.out.println(swap(s,0,4));
	}
	public static String swap(String str,int i, int j) {
		return str.substring(0, i) + str.charAt(j)
        + str.substring(i + 1, j) + str.charAt(i)
        + str.substring(j + 1, str.length());
	}

}
