package JavaProgram;

public class QueueUsingArrayDemo {

    public static void main(String[] args){
       // QueueUsingArray queue=new QueueUsingArray();

       // QueueUsingArrays2 queue=new QueueUsingArrays2();

        QueueUsingLL queue=new QueueUsingLL();

        queue.enqueue(11);
        queue.enqueue(8);
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(5);


        System.out.println("DEQUEUED "+queue.dequeue());
        System.out.println("DEQUEUED "+queue.dequeue());
        System.out.println("DEQUEUED "+queue.dequeue());
        System.out.println("DEQUEUED "+queue.dequeue());

        queue.enqueue(81);
        queue.enqueue(21);
        queue.enqueue(71);

        System.out.println("DEQUEUED "+queue.dequeue());
        System.out.println("DEQUEUED "+queue.dequeue());
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
    }
}
