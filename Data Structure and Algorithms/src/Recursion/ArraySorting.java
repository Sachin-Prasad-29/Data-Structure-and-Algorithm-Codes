package Recursion;

import java.util.ArrayList;
import java.util.Scanner;
//import java.util.List;

public class ArraySorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the size of array ");
		int size=sc.nextInt();
		ArrayList<Integer> n=new ArrayList<>();
		for(int i=0;i<size;i++) {
			int val =sc.nextInt();
			n.add(val);
		}
		
		System.out.println("Before Sorting"+n);
		System.out.println("After sorting"+sort(n));

	}
	public static  ArrayList sort(ArrayList<Integer> n) { 
		if(n.size()==1) {
			
			return n ;
		}
		int temp= n.get(n.size()-1);
		n.remove(n.size()-1);
		sort(n);
		insert(n,temp);
		
		return n;
	}
	
	public static ArrayList insert(ArrayList<Integer> n,int temp) {
		if(n.size()==0 || n.get(n.size()-1)<=temp) {
			n.add(temp);
			return n;
		}
		int val = n.get(n.size()-1);
		n.remove(n.size()-1);
		insert(n,temp);
		n.add(val);
		//System.out.println(n);
		return n;
	}

}
