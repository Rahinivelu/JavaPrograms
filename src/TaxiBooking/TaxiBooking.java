package TaxiBooking;

import java.util.List;

public class TaxiBooking {

    static int id=0;
    int taxiCount;
    char currentSpot;
    int totalEarning;
    int freeTime;
    Boolean booked;
    List<String> tips;


    TaxiBooking(){
     booked=false;
     currentSpot='A';
     freeTime=6;
     totalEarning=0;
     id++;
     taxiCount=id;
    }

}
