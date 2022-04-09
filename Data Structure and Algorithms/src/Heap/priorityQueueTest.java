package Heap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        heap.offer(20);
        heap.offer(10);
        heap.offer(5);
        heap.offer(8);
        heap.offer(9);
        heap.offer(4);
        Iterator<Integer> it = heap.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
    }
    
}
