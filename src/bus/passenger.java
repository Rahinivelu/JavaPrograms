package bus;

import TrainReserv.Passenger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class passenger {

    String name;
    int busno;
    Date date;

 Scanner scan=new Scanner(System.in);
    passenger(){
        System.out.println("Enter the passenger name");
        name=scan.next();
        System.out.println("Enter the  busNo");
        busno=scan.nextInt();
        System.out.println("Enter the date dd-mm-YYYY");
        String dates=scan.next();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");

        try {
            date=dateFormat.parse(dates);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean isAvailable(ArrayList<busDetail> busList, ArrayList<passenger> passenList) {
        int cap=0;
        for(busDetail b:busList){
            if(b.getBusNo()==busno)
               cap=b.getCapacity();
        }

        int booked=0;
        for(passenger p:passenList){
            if(p.busno==busno && p.date.equals(date)){
                booked++;
            }
        }

        return booked>cap?false:true;
    }
}
