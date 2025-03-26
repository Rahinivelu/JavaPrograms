package ZohoTrain;

import java.util.*;

public class TrainBooking {


    public static int availableLowerBerth = 1;
    public static int availableUpperBerth = 1;
    public static int availableMiddleBerth = 1;
    public static int availableRAC = 1;
    public static int availableWL = 1;

    public static List<Integer> availableLowerPositions = new ArrayList<>(Arrays.asList(1));
    public static List<Integer> availableUpperPositions = new ArrayList<>(Arrays.asList(1));
    public static List<Integer> availableMiddlePositions = new ArrayList<>(Arrays.asList(1));
    public static List<Integer> availableRACPositions = new ArrayList<>(Arrays.asList(1));
    public static List<Integer> availableWLPositions = new ArrayList<>(Arrays.asList(1));

    static Queue<Integer> racList = new LinkedList<>();
    static Queue<Integer> waiTList = new LinkedList<>();
    static List<Integer> BookedSeats = new ArrayList<>();

    static HashMap<Integer, TrainPassengers> passList = new HashMap<>();

    public void BookPreferedBerth(TrainPassengers p, String berth, int seatNumber) {
        p.allocatedBerth = berth;
        p.seatNumber = seatNumber;
        BookedSeats.add(p.passId);
        passList.put(p.passId, p);
    }

    public void addToRAC(TrainPassengers p, String berth, int seatNumber) {
        p.allocatedBerth = berth;
        p.seatNumber = seatNumber;
        BookedSeats.add(p.passId);
        passList.put(p.passId, p);
        racList.add(p.passId);
        System.out.println("Added to RAC Successfully");
        availableRAC--;
        availableRACPositions.remove(0);
    }

    public void addToWL(TrainPassengers p, String berth, int seatNumber) {
        p.allocatedBerth = berth;
        p.seatNumber = seatNumber;
        BookedSeats.add(p.passId);
        passList.put(p.passId, p);
        waiTList.add(p.passId);
        System.out.println("Added to WL Successfully");
        availableWL--;
        availableWLPositions.remove(0);
    }

    public void cancelTicket(int passenId) {
        TrainPassengers p = passList.get(passenId);
        BookedSeats.remove(Integer.valueOf(passenId));
        passList.remove(passenId);
        int seat = p.seatNumber;
        String berth = p.allocatedBerth;
        if (berth.equalsIgnoreCase("L")) {
            availableLowerBerth++;
            availableLowerPositions.add(seat);
        } else if (berth.equalsIgnoreCase("M")) {
            availableMiddleBerth++;
            availableMiddlePositions.add(seat);
        } else if (berth.equalsIgnoreCase("U")) {
            availableUpperBerth++;
            availableUpperPositions.add(seat);
        }
        if(racList.size()>0){
            TrainPassengers pass=passList.get(racList.poll());
            availableRACPositions.add(pass.seatNumber);
            racList.remove(pass.passId);
            availableRAC++;
            if(waiTList.size()>0){
               TrainPassengers passWait=passList.get(waiTList.poll());
               availableWLPositions.add(passWait.seatNumber);
               waiTList.remove(passWait.passId);
               availableWL++;

               passWait.seatNumber=availableRACPositions.get(0);
               passWait.allocatedBerth= "RAC";
               availableRACPositions.remove(0);
               racList.add(passWait.passId);

               availableRAC--;
               availableWL++;
            }

            TrainReservation.BookTrainTicket(pass);

        }

    }


    public void printTheDetails(){
        if(passList.isEmpty()){
            System.out.println("The List is empty");
        }
        for(TrainPassengers tpass: passList.values()){
            System.out.println("Name of the Passenger "+tpass.name);
            System.out.println("Age of the Passenger "+tpass.age);
            System.out.println("Passenger ID "+tpass.passId);
            System.out.println("Prefered berth "+tpass.berth);
            System.out.println("Allocated seat of the Passenger "+tpass.seatNumber+tpass.allocatedBerth);
            System.out.println("--------------------------------------");

        }
    }


    public static void printTheTickets(){
        System.out.println("availableLowerBerth :"+availableLowerBerth);
        System.out.println("availableUpperBerth :"+availableUpperBerth);
        System.out.println("availableMiddleBerth :"+availableMiddleBerth);
        System.out.println("availableRAC :"+availableRAC);
        System.out.println("availableWL :"+availableWL);
    }



}
