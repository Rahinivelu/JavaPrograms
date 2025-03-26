package Patterns;

import java.util.Scanner;

public class GGpattern {
    public static void main(String[] args){
        System.out.print("Hello");
        Scanner scan=new Scanner(System.in);
        int value=1;
        int countOfTwo=1;
        System.out.print("enter the number upto which you want to print:");
        int upto=scan.nextInt();
        int count=1;
        System.out.print(value+" ");

//        int prev=value+1;
//         System.out.print(value);
        int i=2;
        while(count<=upto){

            if(i-value==1) {
                count++;
                System.out.print(i + " ");
                value = i;
                if(count==upto){
                    return;
                }
            }
            i++;

            for(int j=0;j<=countOfTwo;j++){
                if(i-value==2){
                    count++;
                    System.out.print(i+" ");
                    value=i;
                    if(count==upto){
                        return;
                    }
                }
                i++;
            }
            countOfTwo++;
        }

    }
}
