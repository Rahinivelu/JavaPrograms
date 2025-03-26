package TrainReserv;

public class Passenger {

    static int id=1;
    String passengerName;
    int age;
    String prefBerth;
    int passengerId;
    String alloted;
    int number;

    Passenger(String passengerName,int age,String prefBerth){
        this.passengerName=passengerName;
        this.age=age;
        this.prefBerth=prefBerth;
        this.passengerId=id++;
        this.alloted="";
        this.number=0;

    }



}
