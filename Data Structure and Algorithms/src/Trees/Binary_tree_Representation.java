package Trees;

/**
 * Binary_tree_Representation
 */
public class Binary_tree_Representation {

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
    static int index = -1;
    
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
        System.out.println("Using PreOrder traversal");
        preOrder(root);
        System.out.println("Using In order traversal");
        inOrder(root);
        System.out.println("Usinf post Order traversal");
        postOrder(root);
    }

   public static void preOrder(Node node){
       if(node == null)
            return ;
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
   }

   public static void inOrder(Node node){
       if(node == null)
            return;
       inOrder(node.left);
       System.out.println(node.data);
       inOrder(node.right);
   }
   public static void postOrder(Node node){
       if(node == null)
         return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data);
   }
    /*
             (1)
        (2)        (3)
    (6)   (7)     (5)
    
    */
}