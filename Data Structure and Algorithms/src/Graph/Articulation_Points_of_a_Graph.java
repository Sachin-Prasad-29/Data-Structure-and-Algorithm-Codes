package Graph;
import java.util.*;
public class Articulation_Points_of_a_Graph {
    public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
       int n = 6;
       for(int i = 0; i<n; i++){
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

       int[] disc = new int[n];
        int[] low = new int[n];
      int[] parent = new int[n];
          boolean[] AP = new boolean[n];

      for(int i = 0; i < n; i++){
           disc[i]=low[i]=parent[i]=-1;
            AP[i] = false;
     }
     int timer = 0;
        for(int i =0; i < n ;i++){
             if(disc[i]==-1){
                  dfs(0,adj,disc,low,parent,AP,timer);
              }
        }

        for(int i =0; i< n; i++){
            if(AP[i])
            System.out.println(i+" is an AP");
        }
    }

    private static void dfs(int i, ArrayList<ArrayList<Integer>> adj, int[] disc, int[] low, int[] parent, boolean[] AP,
            int timer) {

                disc[i]= low[i]= timer;
                timer++;
                int child = 0;
                for(int ele : adj.get(i)){
                    if(disc[ele] == -1){
                        child++;
                        parent[ele] = i;
                        dfs(ele,adj,disc,low,parent,AP,timer);
                        low[i] =  Math.min(low[i], low[ele] );

                        if(parent[i] == -1 && child > 1)    // case 1
                         {
                           AP[i] = true;
                           }
                        if(parent[i] != -1 && low[ele] >= disc[i]) { // case 2
                              AP[i] = true;
                             }
                    }
                    else if(ele != parent[i]){ // if next node is not the parent node
                        // but it is alreaddy visited that means its a back edge
                        low[i] = Math.min(low[i], disc[ele]);
                    }
                    
                }
                
    }
}
