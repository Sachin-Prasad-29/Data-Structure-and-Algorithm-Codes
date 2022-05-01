package Graph;

import java.util.*;

import javax.swing.event.SwingPropertyChangeSupport;
// Node class to store the Val and edge weight 
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
public class DIjKstras_Algorithm_for_shortestpath {
    public static void main(String[] args) {

        // making an dummy graph 
        ArrayList<ArrayList<Node>>  graph = new ArrayList<>();
        int n = 6;
        for(int i = 0 ; i < n ; i++ )
            graph.add(new ArrayList<Node>());

        graph.get(0).add(new Node(1,1));

        graph.get(0).add(new Node(2,1));

        graph.get(0).add(new Node(3,3));

        graph.get(1).add(new Node(5,5));

        graph.get(2).add(new Node(1,2));

        graph.get(2).add(new Node(3,1));

        graph.get(2).add(new Node(4,1));

        graph.get(3).add(new Node(5,3));

        graph.get(4).add(new Node(5,2));
        //DIjKstras_Algorithm_for_shortestpath obj = new DIjKstras_Algorithm_for_shortestpath();
        int N = graph.size();
        findShortestPath(0,graph,6 );

    }
    private   static void findShortestPath(int s, ArrayList<ArrayList<Node>> graph,int N){
          int[] distance = new int[N];
          
          for(int i = 0 ; i < N;i++)
            distance[i] = Integer.MAX_VALUE;
          distance[s] = 0;

          PriorityQueue<Node> pq = new PriorityQueue<>(N,new Node());
          pq.offer(new Node(s,0));

          while(!pq.isEmpty()){
              Node node = pq.poll();
              for(Node ele : graph.get(node.val)){
                  if(distance[node.getVal()]+ele.getWeight() < distance[ele.getVal()]){
                      distance[ele.getVal()] = distance[node.getVal()] + ele.getWeight();
                      pq.offer(new Node(ele.val, ele.weight));
                  }
              }
          }
       for(int i = 0; i < N ; i++){
           System.out.println("0-"+i+" -> "+distance[i]);
       }
          
    }

    
}
