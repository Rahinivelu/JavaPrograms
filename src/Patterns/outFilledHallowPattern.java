package Patterns;

import java.util.Scanner;

public class outFilledHallowPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter odd number: ");
        int val = scan.nextInt();

        if (val % 2 == 0) {
            System.out.print("you have entered an even number");
            return;
        }
        int Space = 0;
        int Star = val/2 +1 ;
        for (int i = 1; i <=val; i++) {

            for(int l=1;l<=Star;l++)
                System.out.print("*");
            for(int k=1;k<=Space;k++)
                System.out.print(" ");
            for(int m=1;m<=Star;m++)
                System.out.print("*");

            if(i< (val/2 + 1)){
                Star-=1;
                Space+=2;
            }
            if(i==(val/2+1)){
                Star=2;
                Space=val-3;
            }
            if(i>(val/2+1)){
                Star+=1;
                Space-=2;
            }
            System.out.println();
        }
    }
}
