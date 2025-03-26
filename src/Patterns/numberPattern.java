package Patterns;

import java.util.Scanner;

//   0
//  101
// 21012
//3210123
public class numberPattern {

    public static void main(String[] args){
        int num=0;
        int bytes=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print");
        int value=scan.nextInt();

        for(int i=1;i<=value;i++){
            for(int j=0;j<value-i;j++){
                System.out.print("  ");
            }
            for(int k=0;k<i;k++){
                System.out.print(num-k +" ");
            }
            for(int l=1;l<i;l++){
                System.out.print(bytes+l+" ");
            }
            System.out.println();
            num++;
        }

//        for(int i=0;i<value;i++){
//            for(int j=0;j<value-i;j++){
//                System.out.print("  ");
//            }
//
//            for(int j=i;j>=0;j--){
//                System.out.print(j+" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }


    }
}
