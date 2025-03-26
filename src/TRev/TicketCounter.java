package TRev;

import java.util.Scanner;

public class TicketCounter {
    public static void bookTicket(PassengerDetails p){
        TrainSeat ts=new TrainSeat();

        if(ts.availableWL==0){
            System.out.println("Train tickets are full");
            return;
        }

        if((p.berth.equals("L")&& ts.availableLB>0)||(p.berth.equals("U")&& ts.availableUB>0)||(p.berth.equals("M")&& ts.availableMB>0)){
            if(p.berth.equals("L")&& ts.availableLB>0){
                System.out.println("Your prefered Lower berth is given");
                ts.bookBerthTickets(p,ts.lowerBerthPosition.get(0),"L");
                ts.availableLB--;
                ts.lowerBerthPosition.remove(0);
            }
            if(p.berth.equals("U")&& ts.availableUB>0){
                System.out.println("Your prefered Upper berth is given");
                ts.bookBerthTickets(p,ts.UpperBerthPosition.get(0),"U");
                ts.availableUB--;
                ts.UpperBerthPosition.remove(0);
            }
            if(p.berth.equals("M")&& ts.availableMB>0){
                System.out.println("Your prefered Middle berth is given");
                ts.bookBerthTickets(p,ts.MiddleBerthPosition.get(0),"M");
                ts.availableMB--;
                ts.MiddleBerthPosition.remove(0);
                System.out.println("-------------------------------");
            }
        }else if(ts.availableLB>0){
            ts.bookBerthTickets(p,ts.lowerBerthPosition.get(0),"L");
            ts.availableLB--;
            ts.lowerBerthPosition.remove(0);
        }
        else if(ts.availableMB>0){
            ts.bookBerthTickets(p,ts.MiddleBerthPosition.get(0),"M");
            ts.availableMB--;
            ts.MiddleBerthPosition.remove(0);
        }
        else if(ts.availableUB>0){
            ts.bookBerthTickets(p,ts.UpperBerthPosition.get(0),"U");
            ts.availableUB--;
            ts.UpperBerthPosition.remove(0);
        }
        else if(ts.availableRAC>0){
            ts.addRAC(p,ts.RACPosition.get(0),"RAC");

        }else if(ts.availableWL>0){
            ts.addWL(p,ts.WLPosition.get(0),"WL");
        }


    }

    public static void cancelTicket(int id){
        if(TrainSeat.passList.containsKey(id)){
            TrainSeat.cancelTickets(id);

        }else {
        System.out.println("No such passenger");

        }

    }

    public static void availableTicket(){
        TrainSeat ts=new TrainSeat();
        ts.availableSeats();
    }

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to IRCTC");
        boolean flag=true;
        while(flag){
            System.out.println("1. Book ticket \n2. Cancel Ticket \n3. Print Booked Ticket \n4. Print available Ticket");
            System.out.println("Enter the number: ");
            int num=scan.nextInt();
            switch(num){
                case 1:{
                    System.out.println("Book Ticket");
                    System.out.println("Enter the name of the passenger: ");
                    String passName=scan.next();
                    System.out.println("Enter the age of the passenger: ");
                    int passAge=scan.nextInt();
                    System.out.println("Enter the your prefered order U,M,L");
                    String passBerth=scan.next();
                    PassengerDetails p=new PassengerDetails(passName,passAge,passBerth);
                    bookTicket(p);
                    String list=p.toString();
                    System.out.println(list);
                    break;
                }
                case 2:{

                    System.out.println("Enter the passengerId to cancel the ticket ");
                    int id=scan.nextInt();
                    cancelTicket(id);

                }break;
                case 3:{
                    System.out.println("Print Booked Ticket");
                    TrainSeat.printBookedTickets();
                    break;
                }
                case 4:{
                    System.out.println("Print available Ticket");
                    availableTicket();
                    break;
                }
                default :
                {
                    System.out.println("check the number properly");
                    flag=false;
                    break;
                }
            }

        }
    }
}
