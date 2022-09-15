package Recursion;
import java.util.*;
public class reverseArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array ");
            int n = sc.nextInt();
            System.out.println("Enter the values for the array");
            int[] arr = new int[n];
            for(int i = 0;i < arr.length ; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(" before Reverse the array "+ Arrays.toString(arr));
            reverseArrays(arr,0,arr.length-1);
            System.out.println(" After Rever the Array " +Arrays.toString(arr));
        }
}

    private static void  reverseArrays(int[] arr, int l ,int r){
        if(l >= r)
            return;
        swap(arr,l,r);
        l++;
        r--;
        reverseArrays(arr,l,r);  
    }

    private static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

}