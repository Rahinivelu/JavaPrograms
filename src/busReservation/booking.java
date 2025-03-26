package busReservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class booking {

    String passengerName;
    int busno;
    Date date;

    booking(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the passengerName");
        passengerName=scan.nextLine();
        System.out.println("Enter the busNumber");
        busno= scan.nextInt();
        System.out.println("Enter the date dd-MM-yyyy");
        String dateinput=scan.next();
        try {
            date= new SimpleDateFormat("dd-MM-yyyy").parse(dateinput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }


    public boolean isAvailable(ArrayList<booking> bookings, ArrayList<bus> buses) {
        int capacity=0;
         for(bus b:buses){
             if(b.getBusno()==busno)
             {
                 capacity=b.getCapacity();
             }
         }
         int booked=0;
         for(booking booking:bookings){
             if(booking.busno==busno && booking.date.equals(date)){
                 booked++;
             }
         }

         return booked<capacity?true:false;
    }
}
