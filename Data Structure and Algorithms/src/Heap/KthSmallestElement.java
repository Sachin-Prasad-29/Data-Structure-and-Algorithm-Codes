package Heap;
import java.util.*;
public class KthSmallestElement {
    public static void main(String[] args) {
        int[]  arr = { 7,10,26,3,20,30,15,8};
        int k = 3;
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i : arr){
            heap.offer(i);
            if(heap.size() > k){
                heap.poll();
            }
            System.out.println(heap);  
        }
        
        System.out.println(heap.peek());

        
    }
}
