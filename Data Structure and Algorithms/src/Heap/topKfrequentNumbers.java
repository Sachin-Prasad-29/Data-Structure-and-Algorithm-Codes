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
        return p2 .key - p1.key;
    }
}

public class topKfrequentNumbers {
    public static void main(String[] args) {
            int[] arr = {6,6,6,1,3,4,1,1,1,2,2,2,5};
            int k = 3;
        PairComparator com = new PairComparator();
         PriorityQueue<Pairs> heap = new PriorityQueue<>(100, com);

        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int i : arr)
              hash.put(i,hash.getOrDefault(i,0)+1);


        System.out.println(hash);
        Iterator<Map.Entry<Integer,Integer>> it = hash.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<Integer,Integer> entry = it.next();
            heap.offer(new Pairs(entry.getValue(),entry.getKey()));

        }
        System.out.println(heap);
        List<Integer> ans = new ArrayList<>();
        while(!heap.isEmpty()){
            for(int i = 0; i< heap.peek().key ;i++)
                ans.add(heap.peek().value);
            heap.poll();
        }
        
        System.out.println(ans);
     }
    
}
