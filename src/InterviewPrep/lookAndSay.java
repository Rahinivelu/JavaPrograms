package InterviewPrep;

import java.util.Scanner;

public class lookAndSay {

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern: ");
        int number=scan.nextInt();
        System.out.println("1");
        String word="1";
        int i=1;
        while(i<number){
            String new_word="";
            char a=word.charAt(0);
            int count=1;
            for(int j=1;j<word.length();j++){
                if(word.charAt(j)!=word.charAt(j-1)){
                    System.out.print(count+""+a);
                    new_word+=count+""+a;
                    a=word.charAt(j);
                    count=1;
                }else{
                    count++;
                }
            }
            System.out.println(count+""+a);
            new_word+=count+""+a;
            word=new_word;
            i++;
        }
    }
}
