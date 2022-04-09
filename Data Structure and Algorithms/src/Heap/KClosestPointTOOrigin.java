package Heap;

import java.util.*;

class Pairs{
   int dis;
   int x;
   int y;
    
     Pairs(int dis , int x , int y){
         this.dis = dis;
         this.x = x;
         this.y = y;
     }
         
}
class PairComparator implements Comparator<Pairs>{
    public int compare (Pairs p1 , Pairs p2){
        return p2.dis - p1.dis;
    }
}

public class KClosestPointTOOrigin {
    public static void main(String[] args) {
        int[][] arr = {
                {5,6},
                {1,2},
                {3,-2},
                {-2,-6},
        };
        int k = 2;
        PairComparator com = new PairComparator();
        PriorityQueue<Pairs> heap = new PriorityQueue<>(10,com);
        HashMap<Integer,List<Integer>> map = new HashMap<>();

        for(int[] a : arr){
            List<Integer> list = new ArrayList<>();
            list.add(a[0]);
            list.add(a[1]);
            map.put((a[0]*a[0])+(a[1]*a[1]), list);
        }
        
        Iterator<Map.Entry<Integer,List<Integer>>> it = map.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<Integer,List<Integer>> entry = it.next();
            heap.offer(new Pairs(entry.getKey(),entry.getValue().get(0),entry.getValue().get(1)));
            if(heap.size() > k)
              heap.poll();
        }
        int[][] ans =new int[k][2];
        int count = 0;
        while(!heap.isEmpty()){
            Pairs p = heap.poll();
            ans[count][0]= p.x;
            ans[count++][1]=p.y;
            System.out.println(p.dis+"  "+p.x+"  "+p.y);
        }
    }
}
