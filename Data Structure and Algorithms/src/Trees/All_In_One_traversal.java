package Trees;
import java.util.*;

public class All_In_One_traversal {
    
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
    static class  Pair{
        Node node;
        int key;
        Pair(Node node, int key){
            this.node = node;
            this.key = key;
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
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = buildTree(nodes);
        System.out.println("Using PostOrder traversal using stack");
        allInOne(root);
    }

    public static void allInOne(Node root){
        if(root == null){
            System.out.println(" There is no node in the tree");
            return;
        }
        Stack<Pair> s1 =new Stack<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();

        Node currNode = root;

        s1.push(new Pair(currNode,1));
        while(!s1.isEmpty()){
            Pair valpair = s1.pop();

            if(valpair.key == 1){
                a1.add(valpair.node.data);
                s1.push(new Pair(valpair.node,valpair.key+1));
                if(valpair.node.left != null)
                    s1.push(new Pair(valpair.node.left, 1));
            }
           else if(valpair.key == 2){
                a2.add(valpair.node.data);
                s1.push(new Pair(valpair.node,valpair.key+1));
                if(valpair.node.right != null)
                     s1.push(new Pair(valpair.node.right, 1));
            }
            else{
                a3.add(valpair.node.data);
            }
        }
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }
}
