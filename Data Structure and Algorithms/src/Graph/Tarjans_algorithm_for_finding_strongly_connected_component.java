package Graph;

import java.util.*;
/**
 * Tarjans_algorithm_for_finding_strongly_connected_component
 */
public class Tarjans_algorithm_for_finding_strongly_connected_component {
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();
        // lets make an dummy graph
        int n = 7;

        for(int i = 0; i < 7; i++){
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(3).add(4);
        adj.get(4).add(0);
        adj.get(4).add(5);
        adj.get(4).add(6);
        adj.get(5).add(6);
        adj.get(5).add(2);
        adj.get(6).add(5);

        System.out.println(adj);
        Stack<Integer> stack = new Stack<>();
        int[] Disc = new int[n];
        int[] Low = new int[n];
        boolean[] Instack = new boolean[n];
        for(int i =0; i < n; i++){
            Disc[i] = -1;
            Low[i] = -1;
            Instack[i] = false;
        }

        int timer = 0;
        for(int i = 0; i< n; i++){
            if(Disc[i] == -1)
            // making dfs call if we have different components
               dfs(0, adj, stack, Disc, Low, Instack,timer);
        }
      
    }

    private static void dfs(int index, ArrayList<ArrayList<Integer>> adj, Stack<Integer> stack, int[] Disc, int[] Low,
            boolean[] instack,int timer) {
       
            Disc[index] = timer; // at initail stage the dis and low is same as timer
            Low[index] = timer;
            stack.push(index);
            instack[index]= true;
            timer++;

            for(int ele : adj.get(index)){ // every linked node of index node
                if(Disc[ele] == -1){
                    // if not visited call dfs for it
                    dfs(ele,adj,stack,Disc, Low,instack,timer);
                    // after dfs call at return time update the low value 
                    Low[index] = Math.min(Low[ele],Low[index]);
                }else if(instack[ele]== true){
                    // if there is back edge the low value changes as followes
                    Low[index] = Math.min(Low[index],Disc[ele]); 
                }  
            } 
            // after dfs if disc and low of index is same print the SCC 
            if(Disc[index] == Low[index]){
                System.out.print("  The SCC is ->");

                while(stack.peek() != index){
                    System.out.print(" "+ stack.peek());
                    instack[stack.peek()] = false;
                    stack.pop();
                }
                System.out.println(" "+stack.peek());
                instack[index]= false;
                stack.pop();
            }
        }
    }
