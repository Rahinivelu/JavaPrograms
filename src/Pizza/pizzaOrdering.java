package Pizza;

import java.util.ArrayList;
import java.util.Scanner;

public class pizzaOrdering {



    public static void main (String[] args){

        ArrayList<store> piz=new ArrayList<>();

        System.out.println("Welcome to Online Pizza Store");
        System.out.println("1.Book pizza\n2.Exit");

        System.out.println("Select one from the above");
        Scanner scan=new Scanner(System.in);

        int orderUser=scan.nextInt();
        while(orderUser==1){

            if(orderUser==1)
            System.out.println("booking started---------");
            System.out.println("1.Chicken tikka masala pizzas\n2.Rainbow pizzas\n3.Panner pizzas\n4.Exit");
        }

    }
}
