package JavaProgram;

import java.util.Iterator;

public class linkedList1 {
    public static void main(String [] args){

        linkedList<Integer> list=new linkedList<Integer> ();

        doublyLinkedList<Integer> dlist=new doublyLinkedList<Integer>();

        circularLinkedList<Integer> clist=new circularLinkedList<>();


       list.insertAtBegining(4);
//        list.insertAtBegining(7);
//        list.insertAtBegining(10);
//        list.insertAtBegining(14);
//        list.display();



//        System.out.println("\nInserting in the middle");
//        list.insertAtPos(2,6);
//        list.display();
//
//        list.deleteAtPos(0);
//        System.out.println("\nDeleting in the middle");
//        list.display();

//        list.getElement(1);
//
//        list.update(2,99);
//        list.display();

//        for(int a:list){
//            System.out.println(a);
//        }

//       Iterator<Integer> it= list.iterator();
//       while(it.hasNext())
//           System.out.println(" \n"+it.next());

//        list.reverse();
//        list.display();


        /**-------------Doubly linked list methods-------------**/

//        dlist.insertAtBeginning(6);
//        dlist.insertAtBeginning(9);
//        dlist.insertAtBeginning(2);
       // dlist.display();

//        System.out.println(" ");
//        dlist.displayRev();

//        dlist.insertAtPos(3,89);
//        System.out.println(" ");
//        dlist.display();
//
//        System.out.println(" ");
//        dlist.displayRev();
//
//       dlist.deleteAtPos(2);

        /**-------------Circular linked list methods-------------**/
        clist.insertAtBegining(4);
        clist.insertAtBegining(6);
        clist.insertAtBegining(8);
        clist.insertAtBegining(0);
        clist.insertAtEnd(7);
        clist.display();

        System.out.println(" \nDelete At begining");
        clist.deleteAtBegining();
        clist.display();

        System.out.println("\nDelete At last ");
        clist.deleteAtEnd();
        clist.display();


    }
}
