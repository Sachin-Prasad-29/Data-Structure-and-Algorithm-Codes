package Graph;
import java.util.*;
import java.util.Comparator;

class WeiPair {
    
    int u;
    int v;
    int w;

    public int getU(){
        return u;
    }

    public int getW(){
        return w;
    }
    public int getV(){
        return v;
    }
    WeiPair(int Node1, int Node2, int Weight ){
        this.w = Weight;
        this.u = Node1;
        this.v = Node2;
    }
     
}

class SortComparator implements Comparator<WeiPair>{
    public int compare(WeiPair node1, WeiPair node2){
        if(node1.w < node2.w)
           return -1;
        if(node1.w > node2.w)
           return 1;
         return 0;    
    }
}

public class KruskalsAlgoForMinimumSpanningTree {
     public static void main(String[] args) {
        int noOfNode = 7;
        ArrayList<WeiPair> adj = new ArrayList<>();

        adj.add(new WeiPair(0 , 1, 2));
        adj.add(new WeiPair(0 , 3, 6));
        adj.add(new WeiPair(1 , 3, 8));
        adj.add(new WeiPair(1 , 2, 3));
        adj.add(new WeiPair(1, 4, 5));
        adj.add(new WeiPair(2 , 4, 7));

        kriskalFun(adj,noOfNode);

        System.out.println(adj);
     }

     public static void kriskalFun(ArrayList<WeiPair> adj,int N ){
         
         Collections.sort(adj, new SortComparator());
         int[] parent = new int[N+2];
         int[] rank = new int[N+2];

         //  set the initial set
         for(int i = 0 ; i <N ; i++){
             parent[i] = i;
             rank[i] = 0;
         }

         int minCost = 0;
        ArrayList<WeiPair> mst = new ArrayList<>();
         for(WeiPair Node : adj){
             if(parent[Node.getU()]  != parent[Node.getV()]){
                 Union(Node.getU(), Node.getV(),parent,rank);
                 mst.add(Node);
                 minCost += Node.getW();
             }
         }
     
         System.out.println(minCost);
         for(WeiPair ele: mst){
             System.out.println(ele.u+" "+ele.v+" "+ ele.w);
         }

     }

     public static int findParent(int Node,int[] parent){
            if(Node == parent[Node]) return Node;
            
            parent[Node] = findParent(parent[Node], parent);

            return parent[Node];

     }

     public static void Union(int u, int v , int[] parent, int[] rank){
            u = parent[u];
            v = parent[v];
            if(rank[u] > rank[v]){
                parent[v] = u;
            }else if( rank[v] > rank[u]){
                parent[u] = v;
            }else {
                parent[v] = u;
                rank[u]++;
            }
     }
}
