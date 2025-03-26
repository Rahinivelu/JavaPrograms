//Java Program to Remove a Specific Element From a Collection

//Iterating the values
package JavaProgram;

import java.util.*;

public class Collection2 {
    public static void main(String [] args) {
        List<Integer> number=new ArrayList<Integer>();
        number.add(3);
        number.add(5);
        number.add(18);
        number.add(4);
        number.add(6);
        System.out.println("Before Removing"+number);
        number.remove(1);
        System.out.println("After Removing"+number);
        number.remove(1);
        System.out.println("After Removing"+number);

        Iterator itr= number.iterator();
        while (itr.hasNext()){
           System.out.println( itr.next());
        }

        ListIterator li= number.listIterator();
        while(li.hasNext())
        {
            System.out.println(li.next()+ "-"+li.nextIndex());
        }

    }
}
