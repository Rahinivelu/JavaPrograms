package Patterns;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print");
        int value=scan.nextInt();
        int num=2;
        int num1=2;
        for(int i=0;i<value;i++){
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }

            for(int k=1;k<=value*2-num;k++){
                System.out.print("  ");

            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            num+=2;
            System.out.println();
        }
       // System.out.print(num);
        for(int i=0;i<value;i++){
            for(int j=value-i;j>0;j--){
                System.out.print("* ");
            }
            for(int k=2;k<num1;k++){
                System.out.print("  ");
            }
            for(int k=value-i;k>0;k--){
                System.out.print("* ");
            }
            System.out.println();
            num1+=2;
        }

    }
}
