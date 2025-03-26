package Patterns;

import java.util.Scanner;

public class numberprym {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int num=scan.nextInt();


        for(int i=1;i<=num;i++){

            for(int l=i;l<=num-1;l++){
                System.out.print("  ");
            }

            for(int k=0;k<i;k++){
                System.out.print(i+k +" ");
            }

            for(int k=1;k<i;k++){
                System.out.print(i*2-1-k +" ");
            }

            System.out.println();
        }
    }
}
