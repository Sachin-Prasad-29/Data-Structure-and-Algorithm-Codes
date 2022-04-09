package Heap;
import java.util.*;
public class kSortestelement {
    public static void main(String[] args) {
        int[] arr = {6,5,3,2,8,10,9};
        int k = 4;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int count = 0;
        for(int i : arr){
                minHeap.offer(i);
                if(minHeap.size() > k)
                  arr[count++] = minHeap.poll();
        }
        while(!minHeap.isEmpty()){
            arr[count++] = minHeap.poll();
        }
        System.out.println(Arrays.toString(arr));
    }
}
