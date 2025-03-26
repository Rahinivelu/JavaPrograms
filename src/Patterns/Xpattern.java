package Patterns;

public class Xpattern {
    public static void main(String[] args){
        String letter="geekforgeek";

        for(int i=0;i<letter.length();i++)
        {
            char c=letter.charAt(i);
            char d=letter.charAt(letter.length()-1-i);
            for(int j=0;j<letter.length();j++){
                if(i==j){

                    System.out.print(c);
                }else if(i+j==letter.length()-1){
                    System.out.print(d);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
