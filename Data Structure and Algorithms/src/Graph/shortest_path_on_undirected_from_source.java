package Graph;
import java.util.*;
public class shortest_path_on_undirected_from_source {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        adj.add(new ArrayList<>(list));

        list.clear();
        list.add(0);
        list.add(2);
        list.add(3);
        adj.add(new ArrayList<>(list));

        list.clear();
        list.add(1);
        list.add(6);
        adj.add(new ArrayList<>(list));

        list.clear();
        list.add(0);
        list.add(4);
        adj.add(new ArrayList<>(list));

        list.clear();
        list.add(3);
        list.add(5);
        adj.add(new ArrayList<>(list));

        list.clear();
        list.add(4);
        list.add(6);
        adj.add(new ArrayList<>(list));

        list.clear();
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(8);
        adj.add(new ArrayList<>(list));

        list.clear();
        list.add(6);
        list.add(8);
        adj.add(new ArrayList<>(list));

        list.clear();
        list.add(6);
        list.add(7);
        adj.add(new ArrayList<>(list));


        System.out.println(adj);
        shortestPath(adj.size(), adj);
        sc.close();
    } 

    private static void shortestPath(int V,ArrayList<ArrayList<Integer>> adj){
        int[] distance = new int[V];
        for(int i = 0; i < V; i++){
            distance[i] = Integer.MAX_VALUE;
        }
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        distance[0] = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            for(int ele: adj.get(node)){
                if(distance[node]+1 < distance[ele]){
                    q.offer(ele);
                    distance[ele] = distance[node]+1;
                }
            }
        }

        System.out.println(Arrays.toString(distance));
    }
}
