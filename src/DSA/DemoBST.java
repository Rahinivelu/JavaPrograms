package DSA;

public class DemoBST {


    public static void main(String[] args) {
        BinarySearchTree bts=new BinarySearchTree(50);

        bts.insert(20);
        bts.insert(70);
        bts.insert(10);
        bts.insert(25);
        bts.insert(60);
        bts.insert(90);
        bts.inOrder(bts.root);




    }
}
