package JavaProgram;

import java.util.Iterator;

public class linkedList <T> implements Iterable<T>{
//head is going to refer
    Node head;

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node temp=head;
            public boolean hasNext(){
                return temp!=null;
            }
            @Override
            public T next() {
                T val=temp.data;
                temp=temp.next;
                return val;
            }
        };
    }

    class Node{
        T data;
        Node next;

        Node(T i){
            data=i;
            next=null;
        }
    }

    linkedList(){
        head=null;
    }

    public void insertAtBegining(T i) {
        Node newNode=new Node(i);    ///passing value here the constructor will automatically set the data
        //newNode.data=i;

        //When the list is empty
        if(head==null)
          head=newNode;
        else {  //if the list is not empty
            newNode.next=head;
            head=newNode;
        }
    }

    public void display(){
        Node temp=head; //start from head
        while(temp!=null) //null implies the end of the node
        {
            System.out.print(temp.data+ " ");
            temp=temp.next; //Jump
        }
    }
     public void insertAtPos(int pos, T val) {
        if(pos==0){
            insertAtBegining(val);
            return;
        }
         Node newNode = new Node(val);
         Node temp = head;
         for (int i = 1; i < pos; i++) {
          temp=temp.next;
          if(temp==null){
              throw new IllegalArgumentException("Position is invalid");
//              System.out.println("Invalid Position");
//              return;
          }

         }
         newNode.next=temp.next;
         temp.next=newNode;
     }

     public void deleteAtPos(int pos){

        if(head==null){
            throw new IndexOutOfBoundsException("The list is Empty");
        }
        if(pos==0){
          deleteAtBegining();
          return;
        }

        Node temp=head;
        Node pre=null;
        //jump until node to be deleted
        for(int i=1;i<=pos;i++){
            pre=temp;//Keep track the pre node
            temp=temp.next;//Jump to the next node
        }
        pre.next=temp.next;
     }

     public void deleteAtBegining(){
         if(head==null){
             throw new IndexOutOfBoundsException("The list is Empty");
         }
         head=head.next;
     }

     public void getElement(int pos){
        Node temp=head;
        int index=0;
        while(temp!=null){

            if(index==pos){
                System.out.println("\n The Element is "+temp.data);
                return;
            }
            temp=temp.next;
            index++;
        }
     }

     public void update(int pos,T val) {
         Node temp = head;
         int index = 0;
         while (temp != null) {
            if(index==pos){
                temp.data=val;
            }
            index++;
            temp=temp.next;
         }
     }

     public void deleteAtEnd(){
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
        }
     }

     public void reverse(){
        if(head==null)
            throw new IndexOutOfBoundsException("List is empty");
        Node prev=null;
        Node current=head;
        Node next=head.next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
     }
}
