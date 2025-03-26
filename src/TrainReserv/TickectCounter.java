package TrainReserv;


import java.util.*;

public class TickectCounter {


    static int availableLB=1;
    static int availableMB=1;
    static int availableUB=1;
    static int availableRAC=1;
    static int availableWL=1;

    static Queue<Integer> waitingList=new LinkedList<>();
    static Queue<Integer> racList=new LinkedList<>();
    static List<Integer> BookedList=new ArrayList<>();

    static List<Integer> lowerBerthPosition=new ArrayList<>(Arrays.asList(1));
    static List<Integer> middleBerthPosition=new ArrayList<>(Arrays.asList(1));
    static List<Integer> upperBerthPosition=new ArrayList<>(Arrays.asList(1));
    static List<Integer> RACBerthPosition=new ArrayList<>(Arrays.asList(1));
    static List<Integer> waitingListBerthPosition=new ArrayList<>(Arrays.asList(1));


    static Map<Integer,Passenger> passen=new HashMap<>();

    public  void bookTrain(Passenger  p,int berthinfo, String berth){

        p.number=berthinfo;
        p.alloted=berth;

        passen.put(p.passengerId,p);
        BookedList.add(p.passengerId);
        System.out.println("-------Booked Successfully-------");
    }

    public void addtoRAC(Passenger p,int berthinfo,String berth){
        p.number=berthinfo;
        p.alloted=berth;

        passen.put(p.passengerId,p);
        racList.add(p.passengerId);

        availableRAC--;
        RACBerthPosition.remove(0);
        System.out.println("-------Added to RAC Successfully--------");
    }

    public void addtoWL(Passenger p,int berthinfo, String berth){
        p.number=berthinfo;
        p.alloted=berth;

        passen.put(p.passengerId,p);
        waitingList.add(p.passengerId);

        availableWL--;
        waitingListBerthPosition.remove(0);
        System.out.println("-------Added to WaitingList Successfully--------");
   }

   public void cancelTrain(int id){
        Passenger p=passen.get(id);
        passen.remove(Integer.valueOf(id));

        BookedList.remove(Integer.valueOf(id));

        int bookedPosition=p.number;

        System.out.println("------canceled successfully-------");

        if(p.alloted.equals("L")){
            availableLB++;
            lowerBerthPosition.add(bookedPosition);
        }
        else if(p.alloted.equals("M")){
            availableMB++;
            middleBerthPosition.add(bookedPosition);
        }
        else if(p.alloted.equals("U")){
            availableUB++;
            upperBerthPosition.add(bookedPosition);
        }

        if(racList.size()>0){
            Passenger passengerfromRac=passen.get(racList.poll());
            int positionRac= passengerfromRac.number;
            RACBerthPosition.add(positionRac);
            racList.remove(Integer.valueOf(passengerfromRac.passengerId));
            availableRAC++;

        if(waitingList.size()>0){
            Passenger passengerfromWait=passen.get(waitingList.poll());
            int positionWL=passengerfromWait.number;
            waitingListBerthPosition.add(Integer.valueOf(positionWL));
            waitingList.remove(Integer.valueOf(positionWL));

            passengerfromWait.number=RACBerthPosition.get(0);
            passengerfromWait.alloted="RAC";
            RACBerthPosition.remove(0);
            racList.add(passengerfromWait.passengerId);

            availableWL++;
            availableRAC--;
        }
        Main.bookTicket(passengerfromRac);}
   }


   public static void printAvailable(){
        System.out.println("Available Tickets are: ");
       System.out.println("AvailableLb "+availableLB);
       System.out.println("AvailableMb "+availableMB);
       System.out.println("AvailableUb "+availableUB);
       System.out.println("AvailableRAC "+availableRAC);
       System.out.println("AvailableWL "+availableWL);
   }

   public static void bookedtrainList(){
        System.out.println("passengers List");
        if(passen.isEmpty()){
            System.out.println("The list is empty");
        }
        for(Passenger p: passen.values() ){
            System.out.println("passenger name: "+p.passengerName);
            System.out.println("passenger id: "+p.passengerId);
            System.out.println("passenger age: "+p.age);
            System.out.println("passenger seat: "+p.number+p.alloted);
            System.out.println("--------------------------------");
        }
   }



}
