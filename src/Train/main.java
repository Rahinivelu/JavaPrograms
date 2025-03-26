package Train;



import java.util.Scanner;



public class main {
    public static void bookTicket(passenger p) {

        TicketBooking tick=new TicketBooking();

        if(TicketBooking.waitingList == 0){
            System.out.println("Sorry, you cannot book the ticket");
            return;
        }

        if(TicketBooking.lowerBreth>0 && p.allotedBerth.equals("L")||
                TicketBooking.upperBreth>0 && p.allotedBerth.equals("U")||
                TicketBooking.middleBreth>0 && p.allotedBerth.equals("M")){

            if(p.allotedBerth.equals("L")){
                System.out.println("Given your preferred berth");
                tick.availableBerth(p,TicketBooking.lowerBerthPosition.get(0),"L");
                TicketBooking.lowerBerthPosition.remove(0);
                TicketBooking.lowerBreth--;
            }
            else if(p.allotedBerth.equals("M")){
                System.out.println("Given your preferred berth");
                tick.availableBerth(p,TicketBooking.middleBerthPosition.get(0),"M");
                TicketBooking.middleBerthPosition.remove(0);
                TicketBooking.middleBreth--;
            }
            else if(p.allotedBerth.equals("U")){
                System.out.println("Given your preferred berth");
                tick.availableBerth(p,TicketBooking.upperBerthPosition.get(0),"U");
                TicketBooking.upperBerthPosition.remove(0);
                TicketBooking.upperBreth--;
            }
        }
        else if(TicketBooking.lowerBreth>0){
            System.out.println("Given your preferred berth");
            tick.availableBerth(p,TicketBooking.lowerBerthPosition.get(0),"L");
            TicketBooking.lowerBerthPosition.remove(0);
            TicketBooking.lowerBreth--;
        }
        else if(TicketBooking.middleBreth>0){
            System.out.println("Given your preferred berth");
            tick.availableBerth(p,TicketBooking.middleBerthPosition.get(0),"M");
            TicketBooking.middleBerthPosition.remove(0);
            TicketBooking.middleBreth--;
        }
        else if(TicketBooking.upperBreth>0){
            System.out.println("Given your preferred berth");
            tick.availableBerth(p,TicketBooking.upperBerthPosition.get(0),"U");
            TicketBooking.upperBerthPosition.remove(0);
            TicketBooking.upperBreth--;
        }
        else if(TicketBooking.rac>0){
            System.out.println("RAC available");
            tick.availableRacBerth(p,(TicketBooking.racPosition.get(0)),"RAC");
        }

        else if(TicketBooking.waitingList>0){
            System.out.println("there no vacancy for your prefernce");
            tick.availableWaBerth(p,(TicketBooking.waitingListPosition.get(0)),"WA");
        }
    }

    public static void cancelTicket(int passengerId) {
        TicketBooking book=new TicketBooking();
        if(!TicketBooking.totalList.containsKey(passengerId)){
            System.out.println("There is no such passenger id");
        }else {
            book.cancel(passengerId);
        }
    }

    public static void main(String[] args){
        System.out.println("Welcome to RRCTC");
        boolean value=true;
        Scanner scan=new Scanner(System.in);
        while(value){
            System.out.println("1.Booking\n2.Cancel\n3.Available Berth\n4.Booked List\n5.Exit");
            int number=scan.nextInt();
            switch (number){
                case 1:
                    System.out.println("Enter the name of the passenger");
                    String name=scan.next();
                    System.out.println("Enter the age of the passenger");
                    int age=scan.nextInt();
                    System.out.println("Enter the Gender of the passenger");
                    String gender=scan.next();
                    System.out.println("Enter the berthPerfernce of the passenger");
                    String preference=scan.next().toUpperCase();
                    passenger p=new passenger(name,age,gender,preference);
                    bookTicket(p);
                    break;
                case 2:
                    System.out.println("Enter the passenger Id to cancel the ticket");
                    int passengerId=scan.nextInt();
                    cancelTicket(passengerId);
                    break;
                case 3:
                    TicketBooking.AvailableBerth();
                    break;
                case 4:
                    TicketBooking.trainBookedList();
                    break;
                case 5:
                    value=false;
                    break;
            }
        }
    }




}
