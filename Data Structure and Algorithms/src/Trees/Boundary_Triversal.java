package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Boundary_Triversal {
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
        System.out.println("Using PreOrder traversal using stack");
        boundaryTraversal(root);
    } 
    // approach 
    // 1.  take the left boundary ending leaf
    // 2. take the leaf nodes
    // 3. right boundary on the reverse order exculding the leaf
    public static void boundaryTraversal(Node node){
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        findLeft(node.left,stack);
        findLeaf(node,stack);
        findRight(node.right,stack);
        int ind = stack.size();
        List<Integer> list = new ArrayList<>();
            for(int i=0;i<ind;i++){
                list.add(i, stack.pop().data);
            }
            System.out.println(list);
            return list;
        
    }
    private static void findLeft(Node node,Stack<Node> stack) {
            if(node == null )
            return;
            if(node.left != null || node.right != null)
                stack.push(node);
            while(node.left != null || node.right != null){
                if(node.left != null){
                    stack.push(node.left);
                    node=node.left;
                    continue;
                }
                 if(node.right != null){
                    stack.push(node.right);
                    node = node.right;
                    continue;
                }
                break;

            }
            stack.pop();
      return;
    }
    private static void findLeaf(Node node,Stack<Node> stack) {
        List<Node> list = new ArrayList<>();
        InOrder(node,list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).data);
            stack.push(list.get(i));
        }

    }
    private static void findRight(Node node,Stack<Node> stack) {
        List<Node> list =new ArrayList<>();
        if(node == null )
            return;
            if(node.left != null || node.right != null)
                list.add(node);
            while(node.left != null || node.right != null){
                if(node.right != null){
                    list.add(node.right);
                    node=node.right;
                    continue;
                }
                 if(node.left != null){
                    list.add(node.left);
                    node = node.left;
                    continue;
                }
                break;

            }
            list.remove(list.size()-1);
            for(int i=1;i<=list.size();i++)
                stack.push(list.get(list.size()-i));
        
            

      return;

    }
    private static void InOrder(Node node,List<Node> list){
        if(node == null)
        return;
        if(node.left == null && node.right == null){
            list.add(node);
            return;
        }
        InOrder(node.left,list);
        InOrder(node.right,list);
    }
}
