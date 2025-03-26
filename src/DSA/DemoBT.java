package DSA;

public class DemoBT {
    public static void main(String[] args) {
        BinaryTree Bt=new BinaryTree(10);


        Bt.insertLeft(Bt.root,5);
        Bt.insertRight(Bt.root,15);
        Bt.insertLeft(Bt.root.left,3);
        Bt.insertRight(Bt.root.left,8);

        Bt.insertLeft(Bt.root.right,12);

        BinaryTree.preOrder(Bt.root);
        System.out.println();
        BinaryTree.inOrder(Bt.root);
        System.out.println();
        BinaryTree.postOrder(Bt.root);
        System.out.println();


    }
}
