package JavaProgram;

public class reverseLinkedList<Integer> {

    Node head,tail;
     class Node{
         int data;
         Node next;

         Node(int val){
             data=val;
             next=null;
         }
     }
    reverseLinkedList(){
         head=null;
         tail=null;
     }

    public void insertAtEnd(int val){
         Node newNode=new Node(val);

         if(head==null){
             head=newNode;
             tail=newNode;
         }
         else{
             tail.next=newNode;
             tail=newNode;
         }
    }

    public void display(){
         Node temp=head;
         while(temp!=null){
             System.out.print(temp.data);
             temp=temp.next;
         }
        //System.out.println("The last data. " +tail.data);
    }

    public void lastElement(){
         System.out.println(tail.data);
    }
    public void reverse(){
      Node prev=null;
      Node current=head;
      Node next =head.next;
         while(current!=null){
             next=current.next;
             current.next=prev;
             prev=current;
             current=next;
         }
         head=prev;

    }



}
