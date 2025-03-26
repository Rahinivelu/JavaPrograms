package Patterns;

import java.util.Scanner;

public class invertedpry {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print");
        int value=scan.nextInt();
        int star=value*2;
        int num=0;
        for(int i=0;i<value;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<star;j++){
                System.out.print("* ");
            }
            star-=2;
            System.out.println();
        }
    }
}
