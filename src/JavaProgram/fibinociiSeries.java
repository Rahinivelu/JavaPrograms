package JavaProgram;

public class fibinociiSeries {

    public static void main(String[] args){
        int pre=0;
        int cur=1;
        int next=0;
        System.out.println(pre);
        System.out.println(cur);
        for(int i=0;i<20;i++){
            next=cur+pre;
            System.out.println(next);
            pre=cur;
            cur=next;
        }
    }
}
