package busReservation;

public class bus {

   private int busno;
   private boolean ac;
   private int capacity;

    bus(int no,boolean ac,int capacity){
        this.busno=no;
        this.ac=ac;
        this.capacity=capacity;
    }

    public int getBusno() {
        return busno;
    }

    public boolean getAc(){
        return ac;
    }
    public void setAc(boolean val){
        ac=val;
    }
    public int getCapacity(){       //accessor method
        return capacity;
    }
    public void setCapacity(int cap){  //mutators
      capacity=cap;
    }

    public void displayBusInfo(){
        System.out.println("Bus No:"+busno+" AC bus:"+ac+" Capacity:"+capacity);
    }
}
