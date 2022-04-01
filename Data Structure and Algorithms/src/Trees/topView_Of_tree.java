package Trees;
import java.util.*;
public class topView_Of_tree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(){
        }
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        Node(int data,Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static int index = -1;
    
        public static Node buildTree(int[] nodes){
        index++;
        if(nodes[index] == -1)
        return null;
        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
        }  
    public static void main(String[] args) {
        int[] nodes = {1,2,4,8,-1,-1,9,-1,-1,5,-1,-1,3,6,10,-1,-1,-1,7,11,-1,-1,12,-1,-1};
       // int[] nodes = {1,2,-1,-1,3,-1,-1};
        Node root = buildTree(nodes);
        System.out.println(getTopView(root));
}
public static ArrayList<Integer> getTopView(Node root) {
    ArrayList<Integer> ans = new ArrayList<>();
    Queue<Pair> q = new LinkedList<>();
    
    if(root == null)
        return ans;
        q.offer(new Pair(root,0));
       // System.out.println(q.peek().node.data);
    TreeMap<Integer,Integer> map = new TreeMap<>();
    dfs(root,0,q,map);
   // System.out.println(map);
   for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
    
    ans.add(entry.getValue()) ;
  
    
  }
    return ans;
}
public static void dfs(Node node, int col,Queue<Pair> q, TreeMap<Integer,Integer> map ){
    if(node == null || q.isEmpty())
        return;
    if(!map.containsKey(col)){
        map.put(col,node.data);
    }
    if(node.left != null)
        q.offer(new Pair(node.left,col-1));
      //  System.out.println(q.peek().node.data);
    if(node.right != null)
            q.offer(new Pair(node.right,col+1));
         //   System.out.println(q.peek().node.data);
    q.poll();
    if(q.isEmpty()) return;
  //  System.out.println(q.peek().node.data);
    dfs(q.peek().node,q.peek().col,q,map);
}
static class Pair{
    Node node;
    int col;
    Pair(Node node,int col){
        this.node = node;
        this.col = col;
    }

}
}