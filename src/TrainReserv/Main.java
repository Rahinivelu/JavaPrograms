package TrainReserv;

import java.util.Scanner;

public class Main {

    public static void bookTicket(Passenger p) {
        TickectCounter booker = new TickectCounter();

        if (booker.availableWL == 0) {
            System.out.println("No tickects available");
            return;
        }

        if (p.prefBerth.equals("L") && (booker.availableLB > 0) ||
                p.prefBerth.equals("M") && (booker.availableMB > 0) ||
                p.prefBerth.equals("U") && (booker.availableUB > 0)) {
            System.out.println("Prefered berth is Available");
            if(p.prefBerth.equals("L")){
                System.out.println("Lower berth given");
                booker.bookTrain(p,(TickectCounter.lowerBerthPosition.get(0)),"L");
                booker.lowerBerthPosition.remove(0);
                booker.availableLB--;
            }

            if(p.prefBerth.equals("M")){
                System.out.println("Middle berth given");
                booker.bookTrain(p,(TickectCounter.middleBerthPosition.get(0)),"M");
                booker.middleBerthPosition.remove(0);
                booker.availableMB--;
            }

            if(p.prefBerth.equals("U")){
                System.out.println("Upper berth given");
                booker.bookTrain(p,(TickectCounter.upperBerthPosition.get(0)),"U");
                booker.upperBerthPosition.remove(0);
                booker.availableUB--;
            }
        }
        else if(TickectCounter.availableLB>0){
            System.out.println("lower berth given");
            booker.bookTrain(p,(TickectCounter.lowerBerthPosition.get(0)),"L");
            booker.lowerBerthPosition.remove(0);
            booker.availableLB--;
        }
        else if(TickectCounter.availableMB>0){
            System.out.println("lower berth given");
            booker.bookTrain(p,(TickectCounter.middleBerthPosition.get(0)),"L");
            booker.middleBerthPosition.remove(0);
            booker.availableMB--;
        }
        else if(TickectCounter.availableUB>0){
            System.out.println("lower berth given");
            booker.bookTrain(p,(TickectCounter.upperBerthPosition.get(0)),"L");
            booker.upperBerthPosition.remove(0);
            booker.availableUB--;
        }
        else if(TickectCounter.availableRAC>0){
            System.out.println("Tickets available in RAC");
            booker.addtoRAC(p,(TickectCounter.RACBerthPosition.get(0)),"RAC");
        }
        else if(TickectCounter.availableWL>0){
         System.out.println("Tickets available in Waiting List");
         booker.addtoWL(p,(TickectCounter.waitingListBerthPosition.get(0)),"WL");

        }
    }

    public static void cancelTicket(int value){

        TickectCounter tick=new TickectCounter();
        if(tick.passen.containsKey(value))
        {
            tick.cancelTrain(value);
        }else
            System.out.println("Passengers detail unknown");
    }


    public static void main(String[] args){

        boolean user=true;
        Scanner scan=new Scanner(System.in);
        while(user){
            System.out.println("1.Book ticket\n2.Cancel ticket\n3.Available Ticket\n4.Booked ticket\n5.Exit");
            System.out.println("Enter the prefered number :");
            int userNumber=scan.nextInt();
            switch(userNumber){
                case 1:
                {
                    System.out.println("Booking started--------");
                    System.out.println("Enter the passenger name,age,prefBerth(L,U,M)");
                    String name=scan.next();
                    int age=scan.nextInt();
                    String prefBreth=scan.next();
                    Passenger p=new Passenger(name,age,prefBreth);
                    bookTicket(p);


                }
                break;
                case 2:
                {
                   System.out.println("Enter the passenger id to cancel");
                   int value=scan.nextInt();
                   cancelTicket(value);
                }
                break;
                case 3:
                {
                    System.out.println("Printing the available tickets");
                    TickectCounter.printAvailable();
                }
                break;
                case 4:
                {
                    System.out.println("-------Booked List---------");
                    TickectCounter.bookedtrainList();
                }
                break;
                case 5:
                {
                    user=false;
                }
            }
        }
    }



}
