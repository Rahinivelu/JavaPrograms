package DSA;



public class BinaryTree {

    Node root;
     class Node{
         int data;
         Node left,right;

         Node(int data){
             this.data=data;
             left=null;
             right=null;
         }
     }

     public BinaryTree(int data){
         root=new Node(data);
     }

     public void insertLeft(Node n,int d){
          Node k=new Node(d);
          n.left=k;
     }

    public void insertRight(Node n,int d){
        Node k=new Node(d);
        n.right=k;
    }

    public static void preOrder(Node root){
         if(root!=null){
             System.out.print(root.data+" ");
             preOrder(root.left);
             preOrder(root.right);
         }
    }

    public static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    public static void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
}
