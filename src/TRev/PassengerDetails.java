package TRev;

import java.util.Stack;

public class PassengerDetails {


    static int id;
    int passId;
    String passName;
    int age;
    String berth;
    int num;
    String alloted;

    PassengerDetails(String passName,int age,String berth ){
        id++;
        passId=id;
        this.passName=passName;
        this.age=age;
        this.berth=berth;
        num=0;
        alloted="";
    }

    @Override
    public String toString() {
        return "PassengerDetails{" +
                "passId=" + passId +
                ", passName='" + passName + '\'' +
                ", age=" + age +
                ", berth='" + berth + '\'' +
                ", num=" + num +
                ", alloted='" + alloted + '\'' +
                '}';
    }
}
