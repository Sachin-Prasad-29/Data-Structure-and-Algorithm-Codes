package Heap;
import java.util.*;

// here the most important thing is we seen how to implement the pair pairority queuepublic
class Pairs{
    int key ;
     int value;
    
     Pairs(int key , int value){
         this.key = key;
         this.value = value;
     }
}
class PairComparator implements Comparator<Pairs>{
    public int compare (Pairs p1 , Pairs p2){
        return p2.key - p1.key;
    }
}
public class KclosestNUmber {

   
    public static void main(String[] args) {
        int[] arr = { 5,6,7,8,9};
        int k = 3;
        int x = 7;
        PairComparator com = new PairComparator();
        PriorityQueue<Pairs> heap = new PriorityQueue<>(10,com);
        
        for(int i : arr){
            heap.offer(new Pairs(Math.abs(x-i), i));
            if(heap.size()>k)
                heap.poll();
        }
        Iterator<Pairs> it = heap.iterator();
        while(it.hasNext()){
            Pairs p = it.next();
            System.out.println(p.key + " & "+p.value);
        }
        
        while(! heap.isEmpty()){
            System.out.println("key = "+heap.peek().key+" value = "+heap.peek().value);
            heap.poll();        }
        
    }
        
}


