package bus;

public class busDetail {

    int busNo;
    boolean busAc;
    int capacity;

    public busDetail(boolean busAc, int capacity, int busNo) {
        this.busAc = busAc;
        this.capacity = capacity;
        this.busNo = busNo;
    }

    public void setBusNo(int busNo){
        this.busNo=busNo;
    }
    public int getBusNo(){
        return busNo;
    }

    public boolean isBusAc() {
        return busAc;
    }

    public void setBusAc(boolean busAc) {
        this.busAc = busAc;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public String display() {
        return "busDetail{" +
                "busNo=" + busNo +
                ", busAc=" + busAc +
                ", capacity=" + capacity +
                '}';
    }
}
