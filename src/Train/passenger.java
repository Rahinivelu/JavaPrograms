package Train;

public class passenger {
    static int id=1;
    int passengerId;
    String name;
    int age;
    String gender;
    String allotedBerth;
    int seatNo;

    passenger(String name,int age,String gender,String allotedBerth){
        this.name=name;
        this.age=age;
        this.gender=gender;
        passengerId=id++;
        this.allotedBerth=allotedBerth;
        seatNo=-1;
    }

}
