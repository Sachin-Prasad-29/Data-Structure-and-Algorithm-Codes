package Trees;

public class Maximum_Depth_Of_BT {
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
        int[] nodes = {1,2,3,4,5,-1,-1,-1,-1,-1,-1};
        Node root = buildTree(nodes);
        System.out.println("Using PostOrder traversal using stack");
        System.out.println(depth(root));
    }
    public static int depth(Node node){
        if(node == null)
             return 0;
        return 1+ Math.max(depth(node.left), depth(node.right));

    }
}
