package ZohoTrain;

public class TrainPassengers {


    private static int id = 1;
    int passId;
    String name;
    int age;
    String berth;
    int seatNumber;
    String allocatedBerth;


    TrainPassengers(String name, int age, String Berth) {
        this.name = name;
        this.age = age;
        this.berth = Berth;
        passId = id++;
        allocatedBerth = "";
        seatNumber = -1;
    }

    @Override
    public String toString() {
        return "TrainPassengers{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", berth='" + berth + '\'' +
                ", seatNumber=" + seatNumber +
                ", allocatedBerth='" + allocatedBerth + '\'' +
                ", passId=" + passId +
                '}';
    }
}
