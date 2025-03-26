package JavaProgram;

public class doublyLinkedList<T> {

    Node head;
    Node tail;

    class Node{
        T data;
        Node next;
        Node prev;

         Node(T i){
             data=i;
             next=null;
             prev=null;
         }
    }
    doublyLinkedList(){
        head=null;
        tail=null;
    }


    public void insertAtBeginning(T val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
        }
    }

    public void display(){
        if(head==null)
            System.out.println("List is empty");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
    }

    public void displayRev(){
        if(tail==null)
        System.out.println("List is empty");
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.prev;
        }
    }


    public void insertAtPos(int pos, T val){

        if(pos==0){
            insertAtBeginning(val);
            return;
        }

        Node newNode=new Node(val);
        Node temp=head;
        for(int i=1;i<pos;i++) {//jump to previous node
            temp = temp.next;
            if(temp==null)
                 throw new IndexOutOfBoundsException("Accessing beyond the limit");
        }
        //reassign pointer
         newNode.next =temp.next;
         newNode.prev=temp;

         if(temp==tail)
             tail=newNode;
         else
             temp.next.prev=newNode;
         temp.next=newNode;
    }


    public void deleteAtPos(int pos){

    }




}
