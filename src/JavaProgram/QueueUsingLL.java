package JavaProgram;

public class QueueUsingLL {

     Node front,rear;

     class Node{
         int data;
         Node next;

         Node(int val){
             data=val;
             next=null;
         }
     }

     QueueUsingLL(){
         front=null;
         rear=null;
     }

     public void enqueue(int val){
         Node newNode=new Node(val);
         if(front==null)
             front=newNode;
         else
             rear.next=newNode;
         rear=newNode;
     }

     public int dequeue(){

         if(front==null)
             throw new IndexOutOfBoundsException("The Queue is empty");
         int temp= front.data;
         front=front.next;
         return temp;
     }

     public int peek(){
         return front.data;
     }

     public boolean isEmpty(){
         return front==null;
     }
}
