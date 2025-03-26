package Patterns;

import java.util.Scanner;

public class HallowPattern {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number to print the pattern");
        int number=scan.nextInt();
        if(number%2==0){
            System.out.println("Entered number is an even number...plz enter the odd number");
            return;
        }
        int outerSpace=number/2;
        int innerSpace=1;
        for(int i=0;i<number;i++) {

            for(int j=0;j<=outerSpace;j++)
                System.out.print(" ");

            if(i<number/2)
                outerSpace-=1;
            else
                outerSpace+=1;

            if(i==0||i==number-1)
                System.out.println("*");
            else{
                System.out.print("*");
                for(int k=0;k<innerSpace;k++)
                    System.out.print(" ");

                if(i<number/2)
                    innerSpace+=2;
                else
                    innerSpace-=2;

                System.out.println("*");

            }
        }


    }
}
