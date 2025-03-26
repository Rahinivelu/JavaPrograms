package ZohoTrain;

import java.util.Scanner;

public class TrainReservation {

    public static void BookTrainTicket(TrainPassengers passengers) {
        TrainBooking trainBooking = new TrainBooking();
        if (TrainBooking.availableWL == 0) {
            System.out.println("Sorry!!!! Train is full");
            return;
        }

        if (TrainBooking.availableLowerBerth > 0 && passengers.berth.equalsIgnoreCase("L") ||
                TrainBooking.availableUpperBerth > 0 && passengers.berth.equalsIgnoreCase("U") ||
                TrainBooking.availableMiddleBerth > 0 && passengers.berth.equalsIgnoreCase("M")) {

            if (passengers.berth.equalsIgnoreCase("L")) {
                System.out.println("The System is allocating seat based on your preference");
                trainBooking.BookPreferedBerth(passengers, "L", TrainBooking.availableLowerPositions.get(0));
                TrainBooking.availableLowerBerth--;
                TrainBooking.availableLowerPositions.remove(0);
            }
            if (passengers.berth.equalsIgnoreCase("M")) {
                System.out.println("The System is allocating seat based on your preference");
                trainBooking.BookPreferedBerth(passengers, "M", TrainBooking.availableMiddlePositions.get(0));
                TrainBooking.availableMiddleBerth--;
                TrainBooking.availableMiddlePositions.remove(0);
            }
            if (passengers.berth.equalsIgnoreCase("U")) {
                System.out.println("The System is allocating seat based on your preference");
                trainBooking.BookPreferedBerth(passengers, "U", TrainBooking.availableUpperPositions.get(0));
                TrainBooking.availableUpperBerth--;
                TrainBooking.availableUpperPositions.remove(0);
            }
        } else if (TrainBooking.availableLowerBerth > 0) {
            System.out.println("Your preference seat is not available");
            trainBooking.BookPreferedBerth(passengers, "L", TrainBooking.availableLowerPositions.get(0));
            TrainBooking.availableLowerBerth--;
            TrainBooking.availableLowerPositions.remove(0);
        } else if (TrainBooking.availableMiddleBerth > 0) {
            System.out.println("Your preference seat is not available");
            trainBooking.BookPreferedBerth(passengers, "M", TrainBooking.availableMiddlePositions.get(0));
            TrainBooking.availableMiddleBerth--;
            TrainBooking.availableMiddlePositions.remove(0);
        } else if (TrainBooking.availableUpperBerth > 0) {
            System.out.println("Your preference seat is not available");
            trainBooking.BookPreferedBerth(passengers, "U", TrainBooking.availableUpperPositions.get(0));
            TrainBooking.availableUpperBerth--;
            TrainBooking.availableUpperPositions.remove(0);
        } else if (TrainBooking.availableRAC > 0) {
            trainBooking.addToRAC(passengers, "RAC", TrainBooking.availableRACPositions.get(0));
        } else if (TrainBooking.availableWL > 0) {
            trainBooking.addToWL(passengers, "WL", TrainBooking.availableWLPositions.get(0));
        }
    }

    public static void canceltheTicket(int id){
        TrainBooking trainBooking = new TrainBooking();
        trainBooking.cancelTicket(id);
    }
    public static void printTheTicket(){
        TrainBooking trainBooking = new TrainBooking();
        trainBooking.printTheDetails();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Boolean value = true;
        while (value) {
            System.out.println("Welcome to IRCTC");
            System.out.println("1.Book the Ticket\n2.Cancel the Ticket\n3.Print the Ticket\n4.Print the available Tickets\n5.Exit");
            System.out.println("Enter the anyone of the above option");
            int number = scan.nextInt();
            switch (number) {
                case 1:
                    System.out.println("-----------Book your tickets-----------");
                    System.out.println("Enter the passenger name");
                    String name = scan.next();
                    System.out.println("Enter the age of the passenger");
                    int age = scan.nextInt();
                    System.out.println("Enter the prefered berth ('L','U','M')");
                    String berth = scan.next();
                    TrainPassengers passenger = new TrainPassengers(name, age, berth);
                    BookTrainTicket(passenger);
                    //System.out.println(passenger.toString());
                    break;

                case 2:
                    System.out.println("--------------Cancelling the ticket-----------------");
                    System.out.println("Enter the passenger Id");
                    int cancelId=scan.nextInt();
                    canceltheTicket(cancelId);
                    break;
                case 3:
                     printTheTicket();
                    break;
                case 4:
                    TrainBooking.printTheTickets();
                    break;
                case 5:
                    value = false;
                    break;

            }
        }
    }
}
