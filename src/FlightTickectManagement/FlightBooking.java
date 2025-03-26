package FlightTickectManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class FlightBooking {
    public static void book(PassengerBooking currentBooking,int tickets,int passengerId){

        String passengerDetails="";
        passengerDetails="PassengerId: "+passengerId+"----NumberOfTickets: "+tickets+"----TotalCost: "+currentBooking.price*tickets;
        currentBooking.addPassengerDetails(passengerDetails,tickets,passengerId);
        currentBooking.flightSummary();
        currentBooking.printSummary();
    }

    public static void cancel(PassengerBooking cancelBooking,int passengerId){
        cancelBooking.cancelFlightTickets(passengerId);


    }

    public static void print(PassengerBooking f){
            f.printSummary();
    }

    public static void main(String [] args){
        System.out.println(" WELCOME TO AIRO AIRWAYS");
         boolean fly=true;

         while(fly){

             ArrayList<PassengerBooking> flights=new ArrayList<>();
             for(int i=0;i<2;i++){
                 flights.add(new PassengerBooking());
             }
            //  System.out.println(flights.size());
             int passengerId=1;

             System.out.println("1. Book Tickets\n2. Cancel Tickets\n3.Print the passenger details");
             Scanner scan=new Scanner(System.in);
             System.out.println("Enter the number");
             int number=scan.nextInt();
             switch (number){
                 case 1:
                 {
                     System.out.println("Enter the flight Id");
                     int fId= scan.nextInt();;

                     if(fId>=flights.size()){
                         System.out.println("Invalid flight id");
                         break;
                     }
                       PassengerBooking currentFlight=null;

                     for(PassengerBooking f:flights){
                        if(f.flightId==fId){
                            System.out.println(f.flightId);
                            currentFlight=f;

                            break;
                        }
                     }

                     System.out.println("Enter the number of tickets");
                     int noOfTickets=scan.nextInt();

                     if(noOfTickets>currentFlight.tickets){
                         System.out.println("Not Enough tickets");
                         break;
                     }

                     book(currentFlight,noOfTickets,passengerId);

                     passengerId+=1;
                     break;

                 }

                 case 2:
                     System.out.println("Enter the flight ID");
                     int CflightsId=scan.nextInt();
                     if(CflightsId>=flights.size()){
                         System.out.println("Invalid flight id");
                         break;
                     }
                      PassengerBooking currentboking=null;
                     for(PassengerBooking s:flights){
                         if(s.flightId==CflightsId){
                             currentboking=s;
                             break;
                         }
                     }
                     System.out.println("Enter the passenger id");
                     int id=scan.nextInt();
                     cancel(currentboking,id);

                     break;
                 case 3:
                    for(PassengerBooking f:flights){
                        if(f.passengersDetails.size()==0){
                            System.out.println("No passenger details for flight"+ f.flightId);
                        }else {
                            print(f);
                        };
                    }
                     break;
                 default:
                     System.out.println("Enter the correct number");
                     fly=false;
                     break;


             }
         }
    }
}
