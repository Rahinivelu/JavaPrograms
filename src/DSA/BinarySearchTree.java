package DSA;

public class BinarySearchTree {

    Node root;
    class Node{
        int Key;
        Node left,right;



        Node(int data){
            Key=data;
            left=null;
            right=null;
        }
    }

     BinarySearchTree(int number){
        root=new Node(number);
    }

    public void insert(int val){
        insert(root,val);
    }

    public Node insert(Node n,int val){
        if(n==null)
            return new Node(val);
        if(val<n.Key)
           n.left= insert(n.left,val);
        else
           n.right= insert(n.right,val);
        return n;
    }


    public void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.println(root.Key+" ");
            inOrder(root.right);
        }
    }
}
