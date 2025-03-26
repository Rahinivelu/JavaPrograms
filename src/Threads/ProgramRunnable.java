package Threads;
class threadsDetails implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Hello  " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
public class ProgramRunnable {

    public static void main(String[] args){
        Thread d1=new Thread(new threadsDetails());
        Thread d2=new Thread(new threadsDetails());
        d1.start();
        d2.start();
    }
}
