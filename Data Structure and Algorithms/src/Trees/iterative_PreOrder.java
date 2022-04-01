package Trees;

import java.util.*;
public class iterative_PreOrder {
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
        Node root = buildTree(nodes);
        System.out.println("Using InOrder traversal using stack");
        inOrder(root);
    }

    // public static void inOrder(Node node){
    //     if(node == null)
    //          return;
    //     inOrder(node.left);
    //     System.out.println(node.data);
    //     inOrder(node.right);
    // }

    public static void inOrder(Node root){
        if(root == null ){
            System.out.println("No node in the stack");
            return;
        }

         Stack<Node> s = new Stack<>();
        Node node = root ;
         while(true){
             if(node != null){
                 s.push(node);
                 node = node.left;
             }
             else{
                 if(s.isEmpty())
                    break;
                node = s.pop();
                System.out.println(node.data);
                node = node.right;
             }
             
         }
    }


}
