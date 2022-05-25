package Graph;
import java.util.*;
public class Bellman_Ford_Algorithm {
    public static void main(String[] args) {
        // making an dummy graph 
        ArrayList<ArrayList<Node>>  graph = new ArrayList<>();
        int n = 3;
        for(int i = 0 ; i < n ; i++ )
            graph.add(new ArrayList<Node>());

        // graph.get(0).add(new Node(1,1));

        // graph.get(0).add(new Node(2,1));

        // graph.get(0).add(new Node(3,3));

        // graph.get(1).add(new Node(5,5));

        // graph.get(2).add(new Node(1,2));

        // graph.get(2).add(new Node(3,1));

        // graph.get(2).add(new Node(4,1));

        // graph.get(3).add(new Node(5,3));

        // graph.get(4).add(new Node(5,2));

        graph.get(0).add(new Node(1,2));
        graph.get(1).add(new Node(2,3));
        graph.get(2).add(new Node(0,-7));


       // System.out.println(graph);

        bellmanMethod(graph,n);
    }

    private static void bellmanMethod(ArrayList<ArrayList<Node>> graph,int n){
         int[] parent = new int[n];
         int[] cost = new int[n];
         int[] value  = new int[n];
         
         parent[0] = -1;
         cost[0] = 0;
         
         for(int i =0; i < n; i++){
             value[i] = Integer.MAX_VALUE;
         }
         value[0] = 0;
         boolean updated = false;
         // Relexing the n-1 times 
         for(int i = 0; i < n-1; i++){
             updated = false;
             for(int j =  0; j < n; j++){
                 for(Node ele : graph.get(j)){
                     int u = j;
                     int v = ele.val;
                     int w = ele.weight;
                    
                     if(value[v] > cost[u]+ w){
                         cost[v] = cost[u] + w;
                         parent[v] = u;
                         value[v] = cost[v];
                         updated = true;
                     }
                 }
             }
             //if(!updated) break;
         }

         // Relexing the last time 
         for(int j =  0; j < n && updated == true; j++){
            for(Node ele : graph.get(j)){
                int u = j;
                int v = ele.val;
                int w = ele.weight;
               
                if(value[v] > cost[u]+ w){
                   System.out.println("There is a -ve edge cycle in the graph");
                   return;
                }
            }

           
            }

            for(int i = 0; i < n ; i++){
                System.out.println(" U ->"+parent[i]+ " V -> "+i+ " Cost is "+ cost[i]);
        }
    }
}
