package InterviewPrep;

import java.util.Scanner;

public class oddnumbers {

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter from number");
        int from=scan.nextInt();
        System.out.println("Enter to number");
        int to=scan.nextInt();
        for(int i=from;i<to;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
