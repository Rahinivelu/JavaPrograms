package JavaProgram;

import java.util.Arrays;
import java.util.Scanner;

class dynamicArray{
         private int size;
         private int arr[];
         private int capacity;
         private static final int initalCapacity=4;

         dynamicArray(){
             size=0;
             arr=new int[initalCapacity];
             capacity=initalCapacity;
         }

         public void add(int value){
             if(size==capacity)
                expandArray();
             arr[size++]=value;
         }

         public void display(){
             System.out.println("Elements in the array: ");
             for(int i=0;i<size;i++){
                 System.out.print(arr[i]+ " ");
             }
         }

         public void insertAtPos(int pos,int val){
             if(size==capacity)
                 expandArray();
             for(int i=size-1;i<=pos;i--){
                 arr[i+1]=arr[i];
             }
             arr[pos]=val;
             size++;
         }

         public void delete(int pos){
             for(int i=pos+1;i<size;i++)
                 arr[i-1]=arr[i];

             size--;

             if(capacity>initalCapacity&& capacity>3*size)
                 shrinkArray();
         }

         public void deleteAtEnd(){
             for(int i=size-1;i<=0;i--)
                 arr[i]=arr[i];
             size--;
         }

         public void deleteAtBeg(){
             for(int i=1;i<size;i++){
                 arr[i-1]=arr[i];
             }
             size--;
         }

         public void get(int position){
             System.out.println("The value at the position is "+arr[position]);
         }
         private void shrinkArray(){
             capacity/=2;
             arr=Arrays.copyOf(arr,capacity);
         }

         private void expandArray(){
             capacity *= 2;
             arr= Arrays.copyOf(arr,capacity);
         }


}
public class dynamicArrayDemo {
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        int value,position;
        dynamicArray list=new dynamicArray();

        while(true){
            System.out.println("\n____________List Menu____________\n");
            System.out.println("1.Insert at End");
            System.out.println("2.Display the List");
            System.out.println("3.Insert at specified position");
            System.out.println("4.Delete from specified position");
            System.out.println("5.Delete at end");
            System.out.println("6.Delete at the beginning");
            System.out.println("7.Get element at particular index");
            System.out.println("8.Exit");
            System.out.println("\n_______________________\n");
            System.out.println("Enter you choice: \t");
            int choice=scan.nextInt();

            switch (choice){
                case 1:System.out.println("Enter the data");
                    value=scan.nextInt();
                    list.add(value);
                    break;
                case 2: list.display();
                    break;
                case 3: System.out.println("Enter the pos(Starts at 0): ");
                        position= scan.nextInt();
                        if(position<0){
                            System.out.println("Invalid position");
                            break;
                        }
                        System.out.println("Enter the data");
                        value=scan.nextInt();
                        list.insertAtPos(position,value);
                        break;
                case 4: System.out.println("Enter the pos(Starts at 0): ");
                        position= scan.nextInt();
                        if(position<0){
                             System.out.println("Invalid position");
                              break;
                         }
                        list.delete(position);
                        break;
                case 8: System.exit(0);
                case 7:System.out.print("Enter the index value to get the element");
                       position=scan.nextInt();
                       list.get(position);
                       break;
                case 6:list.deleteAtBeg();
                       break;
                case 5: list.deleteAtEnd();
                        break;

                default:System.out.println(" Invalid Choice");
            }
        }


    }
}
