package JavaProgram;

public class circularLinkedList <T> {
    Node last;

    class Node{
        T data;
        Node next;

        Node(T val){
            data= val;
            next=null;
        }
    }

    circularLinkedList(){
        last=null;
    }


    public void insertAtBegining(T val){
        Node newNode=new Node(val);
        if(last==null)
        {
            newNode.next=newNode;
            last=newNode;
        }else{
            newNode.next=last.next;
            last.next=newNode;
        }
    }

    public void insertAtEnd(T val){
        Node newNode=new Node(val);
        if(last==null){
            newNode.next=newNode;
            last=newNode;
        }else{
            newNode.next=last.next;
            last.next=newNode;
            last=newNode;
        }
    }

    public void deleteAtBegining(){
        if(last==null)
            throw new IllegalArgumentException("List is empty");
        if(last.next==last)
            last=null;
        else
            last.next=last.next.next;
    }

    public void deleteAtEnd(){
        if(last==null)
            throw new IllegalArgumentException("List is empty");
        if(last.next==last)
            last=null;
        else
        {
            Node temp=last.next;
            while(temp.next!=last)
            {
              temp=temp.next;
            }
            temp.next=last.next;
            last=temp;
        }
    }

    public void display(){
        if(last==null)
            return;
        Node temp=last.next;
        do{
           System.out.print(temp.data+ " ");
           temp=temp.next;
        }while(temp!=last.next);
    }
}
