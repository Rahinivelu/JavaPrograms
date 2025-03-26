package InterviewPrep;

abstract class car{
    abstract int engine();
    public void bike(){
        System.out.print("hemmo bike");
    }

}
class toyoto extends car{
   public int engine(){
       System.out.print("hello car");
       return 0;
   }
}
public class abstractionProgram {

    public static void main(String[] args) {
         car c1=new toyoto();
         c1.engine();
         c1.bike();
    }

}
