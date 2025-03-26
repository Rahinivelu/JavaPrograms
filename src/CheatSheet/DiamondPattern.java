package CheatSheet;

import java.util.Scanner;

public class DiamondPattern {
    private static void Star(int number){

     for(int i=1;i<=number;i++){
         int k=number-i;
         for(int j=1;j<=i;j++){
             while(k!=0){
                 System.out.print(" ");
                 k--;
             }
             System.out.print("* ");
         }

         System.out.println(" ");
     }
     int space=0;
     for(int i=number-1;i>0;i--){
       //  int k=0;
         for(int j=0;j<=space;j++){
             System.out.print(" ");
         }
         for(int j=i;j>0;j--){

             System.out.print("* ");
         }
         System.out.println(" ");
         space++;
     }
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number to print the diamond pattern");
        int pattern=scan.nextInt();
        Star(pattern);

    }
}
