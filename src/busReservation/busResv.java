package busReservation;

import java.util.*;

public class busResv {



    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);

        ArrayList<bus> buses=new ArrayList<>();
        ArrayList<booking> bookings=new ArrayList<>();

        buses.add(new bus(1,true,2));
        buses.add(new bus(2,false,1));
        buses.add(new bus(3,true,0));
        int userout= 1;

        for(bus b:buses){
         b.displayBusInfo();
        }
        while(userout==1) {
            System.out.println("--------Bus Reservation---------");
            System.out.println("1. Booking  and 2.Exit");
            userout= sc.nextInt();
            if(userout==1){
                System.out.println("Booking started------");
                booking book=new booking();
                if(book.isAvailable(bookings,buses)){
                    System.out.println("your booking is confirmed");
                }else{
                    System.out.println("Sorry you cannot book the bus, try another bus or date ");
                }
            }
        }
    }
}
