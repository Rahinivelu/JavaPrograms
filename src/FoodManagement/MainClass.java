package FoodManagement;

import java.util.Scanner;

public class MainClass {

     static void GenerateTheDeliveryExecutive(int number,String []Executive){
         for(int i=0;i<number;i++)
             Executive[i]="DE"+(i+1);
     }
      private static void handleNewBooking(){
         
      }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to Swiggy");
        Boolean value=true;
        System.out.println("Enter the number of delivery executive");

        int deliveryExecutive=scan.nextInt();
        String[] Executive =new String[deliveryExecutive];
        GenerateTheDeliveryExecutive(deliveryExecutive,Executive);
        while(value){
            System.out.println("1.Enter new Booking\n2.History Of DE\n3.Exit");
            System.out.println("Enter the number from the given option");
            int number=scan.nextInt();
            switch(number){
                case 1:
                    System.out.println("Book the food ");
                    handleNewBooking();
                    break;
                case 2:
                    System.out.println("Book the DE ");
                    for(String result:Executive)
                        System.out.println(result);
                    break;
                case 3:
                    value=false;
                    break;
            }
        }


    }
}
