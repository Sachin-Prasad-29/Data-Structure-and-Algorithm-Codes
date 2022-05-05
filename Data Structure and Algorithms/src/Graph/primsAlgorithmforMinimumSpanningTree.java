package Graph;

import java.util.*;

class Nodes implements Comparator<Nodes>{
    int val ;
    int weight;
    Nodes(int val , int weight){
        this.val = val;
        this.weight = weight;
    }
    Nodes(){}

    int getVal() {
        return  val;
    }
     int getWeight(){
         return weight;
     }

     public int compare(Nodes node1, Nodes node2){
         if(node1.weight < node2.getWeight())
            return -1;
         if(node1.weight > node2.getWeight())
            return 1;
          return 0;    
     }
}
public class primsAlgorithmforMinimumSpanningTree {
    public static void main(String[] args) {
        ArrayList<ArrayList<Nodes>>  graph = new ArrayList<>();
        int n = 6;
        for(int i = 0 ; i < n ; i++ )
            graph.add(new ArrayList<Nodes>());

        graph.get(0).add(new Nodes(1,1));
        graph.get(1).add(new Nodes(0,1));

        graph.get(0).add(new Nodes(2,1));
        graph.get(2).add(new Nodes(0,1));

        graph.get(0).add(new Nodes(3,3));
        graph.get(3).add(new Nodes(0,3));

        graph.get(1).add(new Nodes(5,5));
        graph.get(5).add(new Nodes(1,5));

        graph.get(2).add(new Nodes(1,2));
        graph.get(1).add(new Nodes(2,2));

        graph.get(2).add(new Nodes(3,1));
        graph.get(3).add(new Nodes(2,1));

        graph.get(2).add(new Nodes(4,1));
        graph.get(4).add(new Nodes(2,1));

        graph.get(3).add(new Nodes(5,3));
        graph.get(5).add(new Nodes(3,3));

        graph.get(4).add(new Nodes(5,2));
        graph.get(5).add(new Nodes(4,2));

        minimumSpammingTree(graph);
    }
    private static void minimumSpammingTree(ArrayList<ArrayList<Nodes>> graph){
        int N = graph.size();
        int[] dist = new int[N];
        boolean[] visited = new boolean[N];
        int[] paraent = new int[N];
        for(int i = 0; i < N ; i++){
            dist[i] = Integer.MAX_VALUE;
            paraent[i] = -1;
        }
        PriorityQueue<Nodes> pq = new PriorityQueue<>();
        dist[0] = 0;
        pq.add(new Nodes(0,dist[0]));
        
        for(int i =0; i < N-1 ; i++){
            int u= pq.poll().getVal();
            visited[u]= true;
            for(Nodes ele : graph.get(u)){
                if(ele.getWeight() < dist[ele.getVal()] && visited[ele.getVal()] == false) {
                    dist[ele.getVal()] = ele.getWeight();
                    paraent[ele.getVal()] = u;
                    pq.offer(new Nodes(ele.getVal(),ele.getWeight()));
                }
            }

        }

      for(int i = 0; i< N ;i++){
          System.out.println(" paraent - "+paraent[i]+ " child -"+i );
      }

    }
}
