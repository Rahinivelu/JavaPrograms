package JavaProgram;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ExpressionStack {
    public static void main (String [] args){
        Stack<Integer> s=new Stack<Integer>();
        s.push(4);
        s.push(5);
        s.push(9);
        System.out.println("The item is pooped"+ s.pop());
        System.out.println(s);
        Queue <Integer>Q=new ArrayDeque<Integer>();
        Q.add(5);
        Q.add(3);
        Q.add(1);

        System.out.println("The item is peeked"+Q.peek());
        System.out.println("The item is peeked"+Q.remove());
        System.out.println(Q);
    }
}
