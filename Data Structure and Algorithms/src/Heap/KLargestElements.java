package Heap;

import java.util.PriorityQueue;
import java.util.*;

public class KLargestElements {
    public static void main(String args[]){
        int[] arr = {56,34,23,45,63,23,12,34,67,86};
        int k = 4;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i : arr){
            minHeap.offer(i);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        int[] ans = new int[k];
        int index = 0;
        while(!minHeap.isEmpty()){
             ans[index++]= minHeap.poll();
        }
        System.out.println(Arrays.toString(ans));
    }
    
}
