package JavaProgram;

public class arrayStackDemo {
    public static void main(String[] args){

        arrayStack arrays=new arrayStack();

        stackUsingLinkedList<Integer> stack=new stackUsingLinkedList<Integer>();

//        arrays.push(4);
//        arrays.push(6);
//        System.out.println(arrays.peek());
//
//        System.out.println("Popped :" + arrays.pop());
//        System.out.println("Peeked :"+ arrays.peek());

        stack.push(4);
        stack.push(6);
        //System.out.println(Stack.peek());

        System.out.println("Popped :" + stack.pop());
        System.out.println("IsEmpty :" + stack.isEmpty());
        System.out.println("peeked :" + stack.peek());
        //System.out.println("Peeked :"+ arrays.peek());
    }

}
