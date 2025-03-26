package Threads;

class threads extends Thread{
    @Override
    public void run() {
        for(int i=0;i<6;i++) {
            System.out.println("Hello  " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
public class program {
    public static void main(String[] args){
        threads t1=new threads();
        t1.run();
    }
}
