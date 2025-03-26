package Train;


import java.util.*;

public class TicketBooking {

    static int lowerBreth=1;
    static int upperBreth=1;
    static int middleBreth=1;
    static int rac=1;
    static int waitingList=1;

    static List<Integer> lowerBerthPosition=new ArrayList<Integer>(Arrays.asList(1));
    static List<Integer> upperBerthPosition=new ArrayList<Integer>(Arrays.asList(1));
    static List<Integer> middleBerthPosition=new ArrayList<Integer>(Arrays.asList(1));
    static List<Integer> racPosition=new ArrayList<Integer>(Arrays.asList(1));
    static List<Integer> waitingListPosition=new ArrayList<Integer>(Arrays.asList(1));

    static Queue<Integer> racList=new LinkedList<>();
    static Queue<Integer> waitList=new LinkedList<>();
    static List<Integer> bookedList=new ArrayList<>();

    static Map<Integer, passenger> totalList=new HashMap<Integer, passenger>();

    public static void trainBookedList() {

        if(totalList.size()==0){
            System.out.println("Till the none have booked the tickets");
        }else{
            System.out.println("List of people who booked the tickect");
            for(passenger p:totalList.values()){
                System.out.println("Passenger Id:"+p.passengerId);
                System.out.println("Passenger Name:"+p.name);
                System.out.println("Passenger age:"+p.age);
                System.out.println("passenger Gender:"+p.gender);
                System.out.println("Passenger allotedSeat:"+p.seatNo+p.allotedBerth);
                System.out.println("====================================");
            }
        }

    }

    public static void AvailableBerth() {
        System.out.println("Available lowerBerth:"+lowerBreth);
        System.out.println("Available middleBerth:"+middleBreth);
        System.out.println("Available upperBerth:"+upperBreth);
        System.out.println("Available RAC:"+rac);
        System.out.println("Available waitingList:"+waitingList);
        System.out.println("====================================");
    }


    public void availableBerth(passenger p, Integer number, String berth) {
        p.seatNo=number;
        p.allotedBerth=berth;
        bookedList.add(p.passengerId);
        totalList.put(p.passengerId,p);
        System.out.println("Successfully Booked");
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.seatNo+p.allotedBerth);
        System.out.println(p.passengerId);
        System.out.println("prefered Berth booked successfully---------");
    }

    public void availableRacBerth(passenger p, Integer seatNumber, String racBerth) {
        p.seatNo=seatNumber;
        p.allotedBerth=racBerth;
        totalList.put(p.passengerId,p);
        racList.add(p.passengerId);
        racPosition.remove(0);
        rac--;
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.seatNo+p.allotedBerth);
        System.out.println(p.passengerId);
        System.out.println("RAC booked successfully---------");
    }


    public void availableWaBerth(passenger p, Integer seatNumber, String waBerth) {
        p.seatNo=seatNumber;
        p.allotedBerth=waBerth;
        totalList.put(p.passengerId,p);
        waitList.add(p.passengerId);
        waitingListPosition.remove(0);
        waitingList--;
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.seatNo+p.allotedBerth);
        System.out.println(p.passengerId);
        System.out.println("WA booked successfully---------");
    }

    public void cancel(int passengerId) {
        passenger p=totalList.get(passengerId);
        totalList.remove(passengerId);
        bookedList.remove(Integer.valueOf(passengerId));
        int passId=p.seatNo;
        System.out.println("Cancelled Successfully---------");
        if(p.allotedBerth.equals("L"))
        {
           lowerBerthPosition.add(passId);
           lowerBreth++;
        }else if(p.allotedBerth.equals("M")){
            middleBerthPosition.add(passId);
            middleBreth++;
        }else if(p.allotedBerth.equals("U")){
            upperBerthPosition.add(passId);
            upperBreth++;
        }

       if(racList.size()>0){
          passenger passengerfromRAC=  totalList.get(racList.poll());
          int racSeatid=passengerfromRAC.seatNo;
          racList.remove(passengerfromRAC.passengerId);
          racPosition.add(racSeatid);
          rac++;

          if(waitList.size()>0){
              passenger passengerfromWaitL=totalList.get(waitList.poll());
              int waitSeatId=passengerfromWaitL.seatNo;
              waitList.remove(passengerfromWaitL.passengerId);
              waitingListPosition.add(waitSeatId);
              //waitingList++;

             passengerfromWaitL.seatNo=racPosition.get(0);
             passengerfromWaitL.allotedBerth="RAC";
             racPosition.remove(0);
             racList.add(passengerfromWaitL.passengerId);

             waitingList++;
             rac--;
          }
          main.bookTicket(passengerfromRAC);
       }



    }
}
