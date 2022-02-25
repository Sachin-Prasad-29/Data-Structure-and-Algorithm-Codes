package Trees;

import java.util.*;
public class PostOrder_traversal {
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
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = buildTree(nodes);
        System.out.println("Using PostOrder traversal using stack");
        postOrder(root);
    }


    public static void postOrder(Node root){
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        if(root == null){
            System.out.println("no nodes in the tree");
            return;
        }
        Node node = root;
        s1.push(node);
        while(!s1.isEmpty()){
            node = s1.pop();
            s2.push(node);
            if(node.left != null)
                s1.push(node.left);
            if(node.right != null)
                s1.push(node.right);
            
        }

        System.out.println(s2.pop().data);
        System.out.println(s2.pop().data);
        System.out.println(s2.pop().data);
        System.out.println(s2.pop().data);
        System.out.println(s2.pop().data);
        System.out.println(s2.pop().data);


    }

    // public static void postOrder(Node node){
    //     if(node == null)
    //       return;
    //      postOrder(node.left);
    //      postOrder(node.right);
    //      System.out.println(node.data);
    // }
}
