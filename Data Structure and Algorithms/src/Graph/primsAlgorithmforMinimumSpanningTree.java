package Graph;

import java.util.*;

class Node implements Comparator<Node>{
    int val ;
    int weight;
    Node(int val , int weight){
        this.val = val;
        this.weight = weight;
    }
    Node(){}

    int getVal() {
        return  val;
    }
     int getWeight(){
         return weight;
     }

     public int compare(Node node1, Node node2){
         if(node1.weight < node2.getWeight())
            return -1;
         if(node1.weight > node2.getWeight())
            return 1;
          return 0;    
     }
}
public class primsAlgorithmforMinimumSpanningTree {
    public static void main(String[] args) {
        ArrayList<ArrayList<Node>>  graph = new ArrayList<>();
        int n = 6;
        for(int i = 0 ; i < n ; i++ )
            graph.add(new ArrayList<Node>());

        graph.get(0).add(new Node(1,1));
        graph.get(1).add(new Node(0,1));

        graph.get(0).add(new Node(2,1));
        graph.get(2).add(new Node(0,1));

        graph.get(0).add(new Node(3,3));
        graph.get(3).add(new Node(0,3));

        graph.get(1).add(new Node(5,5));
        graph.get(5).add(new Node(1,5));

        graph.get(2).add(new Node(1,2));
        graph.get(1).add(new Node(2,2));

        graph.get(2).add(new Node(3,1));
        graph.get(3).add(new Node(2,1));

        graph.get(2).add(new Node(4,1));
        graph.get(4).add(new Node(2,1));

        graph.get(3).add(new Node(5,3));
        graph.get(5).add(new Node(3,3));

        graph.get(4).add(new Node(5,2));
        graph.get(5).add(new Node(4,2));

        minimumSpammingTree(0,graph);
    }
    private static void minimumSpammingTree(int s, ArrayList<ArrayList<Node>> graph){
        int N = graph.size();
        int[] dist = new int[N];
        boolean[] visited = new boolean[N];
        int[] paraent = new int[N];
        for(int i = 0; i < N ; i++){
            dist[i] = Integer.MAX_VALUE;
            paraent[i] = -1;
        }
        PriorityQueue<Node> pq = new PriorityQueue<>();
        dist[s] = 0;
        pq.offer(new Node(0,dist[0]));
        
        for(int i =0; i < N-1 ; i++){
            s= pq.poll().getVal();
            visited[s]= true;
            for(Node ele : graph.get(s)){
                if(ele.getWeight() < dist[ele.getVal()] && visited[ele.getVal()] == false) {
                    dist[ele.getVal()] = ele.getWeight();
                    paraent[ele.getVal()] = s;
                    pq.offer(new Node(ele.getVal(),ele.getWeight()));
                }
            }

        }

      for(int i = 0; i< N ;i++){
          System.out.println(" paraent - "+paraent[i]+ " child -"+i );
      }

    }
}
