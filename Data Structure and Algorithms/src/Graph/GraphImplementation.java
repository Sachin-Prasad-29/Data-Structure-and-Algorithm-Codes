package Graph;
import java.util.*;
public class GraphImplementation {
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
    }
}
