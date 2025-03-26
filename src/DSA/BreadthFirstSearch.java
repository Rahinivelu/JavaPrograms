package DSA;// Java Program to traverse a binary
// tree in zigzag manner.
import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = null;
        right = null;
    }
}

class GfG {

//    // function to print the zigzag traversal
//    static ArrayList<Integer> zigZagTraversal(Node root) {
//
//        ArrayList<Integer> ans = new ArrayList<>();
//
//        // if null then return
//        if (root == null)
//            return ans;
//
//        // declare two stacks
//        Stack<Node> currentLevel = new Stack<>();
//        Stack<Node> nextLevel = new Stack<>();
//
//        // push the root
//        currentLevel.push(root);
//
//        // check if stack is empty
//        boolean leftToRight = true;
//        while (!currentLevel.isEmpty()) {
//
//            int size = currentLevel.size();
//            System.out.println(size);
//            while (size-- > 0) {
//
//                // pop out of stack
//                Node curr = currentLevel.pop();
//
//                // push the current node
//                ans.add(curr.data);
//
//                // store data according to current
//                // order.
//                if (leftToRight) {
//                    if (curr.left != null)
//                        nextLevel.push(curr.left);
//                    if (curr.right != null)
//                        nextLevel.push(curr.right);
//                }
//                else {
//                    if (curr.right != null)
//                        nextLevel.push(curr.right);
//                    if (curr.left != null)
//                        nextLevel.push(curr.left);
//                }
//            }
//
//            leftToRight = !leftToRight;
//            Stack temp = currentLevel;
//           // System.out.println("Temp " +temp);
//            currentLevel = nextLevel;
//            nextLevel = temp;
//        }
//
//        return ans;
//    }
static ArrayList<Integer> zigZagTraversal(Node root) {
    ArrayList<Integer> values=new ArrayList<Integer>();
    if(root==null)
        return values;

    Stack<Node> currentStack=new Stack<>();
    Stack<Node> nextStack=new Stack<>();
    boolean leftToRight=true;
    currentStack.push(root);

    while(!currentStack.isEmpty())
    {
        int size=currentStack.size();
        while(size-- >0){


            Node curr=currentStack.pop();
            values.add(curr.data);

            if(leftToRight){
                if(curr.left!=null)
                    nextStack.push(curr.left);
                if(curr.right!=null)
                    nextStack.push(curr.right);
            }else{
                if(curr.right!=null)
                    nextStack.push(curr.right);
                if(curr.left!=null)
                    nextStack.push(curr.left);
            }
        }

        leftToRight=!leftToRight;
        Stack<Node> temp=currentStack;
        currentStack=nextStack;
        nextStack=temp;
    }

    return values;

}
    static void printList(ArrayList<Integer> v) {
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create a hard coded tree.
        //         20
        //       /   \
        //      8     22
        //    /  \     \
        //   4   12    11
        //      /  \
        //     10   14
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.right.left = new Node(15);
        root.right.right = new Node(11);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        ArrayList<Integer> ans = zigZagTraversal(root);
        printList(ans);
    }
}