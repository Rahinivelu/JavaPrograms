package bus;

import java.util.ArrayList;

import java.util.Scanner;

public class main {


    public static void main(String[] args){

        System.out.println("Welcome to RMTC");


        Scanner scan=new Scanner(System.in);
        ArrayList<busDetail> busList=new ArrayList<>();
        busList.add(new busDetail(true,2,1));
        busList.add(new busDetail(false,1,2));
        busList.add(new busDetail(true,5,3));

        ArrayList<passenger> passenList=new ArrayList<>();

        boolean value=true;

        while(value){
            System.out.println("1. Booking and 2. Exit");

            int number=scan.nextInt();
            switch(number){
                case 1:
                    System.out.println("Book the bus");
                    passenger p=new passenger();
                    if(p.isAvailable(busList,passenList)){
                        passenList.add(p);
                        System.out.println("Your booking is confirmed");
                    }else{
                        System.out.println("Booking is closed on that particular date");
                    }


//                    for(busDetail b:busList){
//                        System.out.println(b.display());
//                    }
                    System.out.println("--------------------------");
                    break;
                case 2:
                    System.out.println("Thank you");
                    value=false;
                    break;
            }
        }

    }
}
