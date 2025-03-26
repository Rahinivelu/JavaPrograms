package InterviewPrep;

import java.util.Scanner;

public class practice {

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the no. of rows:");
        int num=scan.nextInt();
        String letter="1";
        System.out.println(letter);

        int i=1;
        while(i<num) {
            int count = 1;
            String newletter = "";
            char c = letter.charAt(0);

            for (int j = 1; j < letter.length(); j++) {
                if (letter.charAt(j) != letter.charAt(j - 1)) {
                    System.out.print(""+count+ ""+c);
                    newletter +=""+count+ ""+c;
                    c = letter.charAt(j);
                    count=1;

                } else{
                    count++;
                }

            }
            System.out.println(count+"" +c);
            newletter +=""+ count + ""+c;
            letter = newletter;
            i++;
        }
    }
}
