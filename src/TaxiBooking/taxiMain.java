package TaxiBooking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class taxiMain {
    public static void bookTaxi(int id, int pickUpTime, char pickUpPoint, char dropPoint, List<TaxiBooking> freetaxi){
        int min=999;

        int distanceBetweenPickUpandDropPoint=0;
        int earning=0;

        int nextFreeTime=0;
        char nextFreeSpot='Z';
        TaxiBooking booked=null;
        String tripDetails="";
    }
    public static List<TaxiBooking> noOfTaxies(List<TaxiBooking> taxi,int pickUptime,char pickUp){

      List<TaxiBooking> freetaxi=new ArrayList<>();
      for(TaxiBooking t:taxi){
         if(t.freeTime<=pickUptime && (Math.abs(t.currentSpot-'0')-(pickUp-'0'))<=pickUptime- t.freeTime){
             freetaxi.add(t);
         }
      }

      return freetaxi;

    }

    public static void main(String[] args){

        List<TaxiBooking> taxi=new ArrayList<>();
        for(int i=0;i<3;i++){
            taxi.add(new TaxiBooking());
        }
        int id=1;
        boolean value=true;
        Scanner scan=new Scanner(System.in);
        while(value){
            System.out.println("Welcome to SARA Taxi Service");
            System.out.println("1. CallTaxi Booking\n2. Display the taxi details\n3.Exit");
            int number=scan.nextInt();
            switch(number) {
                case 1:{
                    int customerId=id;
                    System.out.println("Enter the pickUpPoint :");
                    char pickUp=scan.next().charAt(0);
                    System.out.println("Enter the dropPoint :");
                    char dropPoint=scan.next().charAt(0);
                    System.out.println("Enter the pickUp time :");
                    int pickUptime=scan.nextInt();


                    if(pickUp<'A'|| dropPoint>'F'||dropPoint<'A'|| pickUp>'F'){
                        System.out.println("Enter the valid pickUp and drop point A,B,C,D,E,F");
                        return ;
                    }

                   List<TaxiBooking> freeTaxies=noOfTaxies(taxi,pickUptime,pickUp);


                    if(freeTaxies.size()<0)
                    {
                        System.out.println("Taxies are not allowed to book, Existing");
                        return;
                    }

                    Collections.sort(freeTaxies,(a,b)-> a.totalEarning-b.totalEarning);
                    bookTaxi(id,pickUptime,pickUp,dropPoint,freeTaxies);

                    //break;
                }


                case 2:
                    System.out.println("Hello number 2");
                    break;
                case 3:
                    System.out.println("Thank you for choosing us");
                    value = false;
                default:
                        return;

            }
        }
    }
}
