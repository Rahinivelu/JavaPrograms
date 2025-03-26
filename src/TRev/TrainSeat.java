package TRev;

import java.util.*;

public class TrainSeat {

    static int availableLB=1;
    static int availableMB=1;
    static int availableUB=1;
    static int availableRAC=1;
    static int availableWL=1;

    static Queue<Integer> waitingList=new LinkedList<>();
    static Queue<Integer> RACList=new LinkedList<>();
    static List<Integer> BookedSeats=new ArrayList<>();

    static List<Integer> lowerBerthPosition=new ArrayList<>(Arrays.asList(1));
    static List<Integer> UpperBerthPosition=new ArrayList<>(Arrays.asList(1));
    static List<Integer> MiddleBerthPosition=new ArrayList<>(Arrays.asList(1));
    static List<Integer> RACPosition=new ArrayList<>(Arrays.asList(1));
    static List<Integer> WLPosition=new ArrayList<>(Arrays.asList(1));

    static Map<Integer,PassengerDetails> passList=new HashMap<>();


    public void  bookBerthTickets(PassengerDetails p,int number,String berth){
        p.num=number;
        p.alloted=berth;
        BookedSeats.add(p.passId);
        passList.put(p.passId,p);
        System.out.println("------------Booked Berth Successfully--------------");
    }

    public void addRAC(PassengerDetails p,int num,String allocated){
        p.num=num;
        p.alloted=allocated;
        BookedSeats.add(p.passId);
        RACList.add(p.passId);
        passList.put(p.passId,p);
        System.out.println("Added to RAC successfully");
        availableRAC--;
        RACPosition.remove(0);
    }
  public void addWL(PassengerDetails p,int num,String allocated){
         p.num=num;
         p.alloted=allocated;
         BookedSeats.add(p.passId);
         waitingList.add(p.passId);
         passList.put(p.passId,p);
         System.out.println("Added to WL Successfully");
         availableWL--;
         WLPosition.remove(0);}

  public static void cancelTickets(int id){
      PassengerDetails p=passList.get(id);
      passList.remove(id);
      BookedSeats.remove(Integer.valueOf(id));
      String allotedBerth=p.alloted;
      int Seatnum=p.num;

      if (allotedBerth.equals( "L")){
          availableLB++;
          lowerBerthPosition.add(Seatnum);
      }else if (allotedBerth.equals( "U")){
          availableUB++;
          UpperBerthPosition.add(Seatnum);
      }else if (allotedBerth.equals( "M")) {
          availableLB++;
          MiddleBerthPosition.add(Seatnum);
      }

      if(RACList.size()>0)
      {
          PassengerDetails pass=passList.get(RACList.poll());
          RACPosition.add(pass.num);
          RACList.remove(pass.passId);
          availableRAC++;
         if(waitingList.size()>0){
           PassengerDetails wait=passList.get(waitingList.poll());
           WLPosition.add(wait.num);
           waitingList.remove(wait.passId);

           wait.num=RACPosition.get(0);
           wait.alloted="RAC";
           RACPosition.remove(0);
           RACList.add(wait.passId);

           availableWL++;
           availableRAC--;
         }
          TicketCounter.bookTicket(pass);
      }
System.out.println("canceled Successfully");
  }

   public static void printBookedTickets(){
        if(passList.isEmpty()){
            System.out.println("List is Empty");
        }
        for(PassengerDetails p :passList.values()){
            System.out.println("Passenger Id :"+p.passId);
            System.out.println("Passesnger Name: "+p.passName);
            System.out.println("Passenger Age: "+p.age);
            System.out.println("Passenger seatNo:"+p.num+p.alloted);
            System.out.println("----------------------------------------------");

        }
   }

    public void availableSeats(){
        System.out.println("AvailableLowerBerth :"+availableLB);
        System.out.println("AvailableMiddleBerth :"+availableMB);
        System.out.println("AvailableUpperBerth :"+availableUB);
        System.out.println("AvailableRAC :"+availableRAC);
        System.out.println("AvailableWL :"+availableWL);

    }



}
