package FlightTickectManagement;

import java.util.ArrayList;

public class PassengerBooking {

    static int id;
    int flightId;
    int tickets;
    int price;

    ArrayList<String> passengersDetails;
    ArrayList<Integer> passengersId;
    ArrayList<Integer> bookTicketsPerPassenger;
    ArrayList<Integer> passengerCost;


    PassengerBooking(){
        tickets=50;
        price=5000;
         id+=1;
         flightId=id;
         passengersDetails=new ArrayList<>();
         passengersId=new ArrayList<>();
         bookTicketsPerPassenger=new ArrayList<>();
         passengerCost=new ArrayList<>();
    }

    public  void addPassengerDetails(String passengerDetails,int ticket,int passengerId){

        passengersDetails.add(passengerDetails);
        passengersId.add(passengerId);
        passengerCost.add(price* ticket);

        price+=200;
        tickets-=ticket;
        bookTicketsPerPassenger.add(ticket);
        System.out.println("Booked Successfully!!!!");
    }

    public void cancelFlightTickets(int passenId){
        int removeIndex=passengersId.indexOf(passenId);
        if(removeIndex<0){
            System.out.print("Passenger not found");
            return;
        }
        int ticketsToCancel=bookTicketsPerPassenger.get(removeIndex);
        tickets+=ticketsToCancel;

        price-=200;
        bookTicketsPerPassenger.remove(removeIndex);
        passengersId.remove(removeIndex);
        passengersDetails.remove(removeIndex);
        passengerCost.remove(removeIndex);

        System.out.println("Canceled successfully");
    }
    public void flightSummary(){
        System.out.println("flightid: "+flightId+"----Total no of Remaining tickets: "+ tickets+"----Currentprice: "+ price);
    }

    public void printSummary(){
        System.out.println("FlightId :"+ flightId);
        for(String s:passengersDetails){
            System.out.println(s);
        }
    }

}
