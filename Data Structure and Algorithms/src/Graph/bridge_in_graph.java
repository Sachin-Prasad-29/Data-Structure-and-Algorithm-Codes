package Graph;

/**
 * bridge_in_graph
 */
import java.util.*;
public class bridge_in_graph {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
           int V = 6;
           for(int i = 0; i<V; i++){
               adj.add(new ArrayList<>());
           }
           adj.get(0).add(1);
           adj.get(1).add(0);
    
           adj.get(0).add(2);
           adj.get(2).add(0);
    
           adj.get(2).add(1);
           adj.get(1).add(2);
    
           adj.get(0).add(3);
           adj.get(3).add(0);
    
           adj.get(3).add(4);
           adj.get(4).add(3);

           adj.get(3).add(5);
           adj.get(5).add(3);
    
           
    
           System.out.println(adj);

           int[] disc = new int[V];
           int[] low = new int[V];
           int[] parent = new int[V];
           
           for(int i = 0; i < V; i++){
               disc[i] = low[i] = parent[i] = -1;
           }
            dfs(0, adj, disc, low, parent, 0);
    
        }           
        private static void dfs(int i, ArrayList<ArrayList<Integer>> adj, int[] disc, int[] low, int[] parent,int timer){
                disc[i] = low[i] = timer;
                timer++;
                
                for(int ele : adj.get(i)){
                    
                    if(disc[ele] == -1){
                        parent[ele] = i;
                        dfs(ele, adj, disc, low, parent, timer);
                        low[i] = Math.min(low[i],low[ele]);

                        if(low[ele] > disc[i]){
                            System.out.println(" Bridege is  between "+i+" - "+ele);
                        }
                    }
                    
                    else if(parent[i] != ele){
                        low[i]= Math.min(low[i],disc[ele]);
                    }
                }
} 
 }