package Graph;

import java.util.ArrayList;

public class disJointSet {

   static ArrayList<Integer> parent = new ArrayList<>();
   static  ArrayList<Integer> rank = new ArrayList<>(); 
    
    public static void main(String[] args) {
     int n = 7;
     makeSet(n);
     System.out.println(parent);
     System.out.println(rank);

     // is 2 and 3 have same paraent 
     if(findParent(2) != findParent(3)){
         System.out.println("Not same parent ");
     }else
         System.out.println("HAve same parent");

    Union(2, 3);
    if(findParent(2) != findParent(3)){
        System.out.println("Not same parent ");
    }else
        System.out.println("HAve same parent");
    Union(1, 3);


    if(findParent(1) != findParent(2)){
        System.out.println("Not same parent ");
    }else
        System.out.println("HAve same parent");

     Union(3, 7);

     if(findParent(1) != findParent(7)){
        System.out.println("Not same parent ");
    }else
        System.out.println("HAve same parent");
    }  

    public static void makeSet(int n){
        parent.add(0);
        rank.add(0);
          for(int i = 1; i <= n; i++){
              parent.add(i, i);
              rank.add(i,0);
          }
    }

    public static int findParent(int Node){
        if(Node == parent.get(Node))
             return Node;

        parent.add(Node,findParent(parent.get(Node)));
        return parent.get(Node);
    }

    public static void Union(int Node1, int Node2){
        Node1 = findParent(Node1);
        Node2 = findParent(Node2);

        if(rank.get(Node1) > rank.get(Node2)){
            parent.add(Node1,Node2);
        }
        else if(rank.get(Node2) > rank.get(Node1)){
            parent.add(Node2,Node1);
        }
        else{
            parent.add(Node2,Node1);
            rank.add(Node1,rank.get(Node1)+1);
        }
    }
}
