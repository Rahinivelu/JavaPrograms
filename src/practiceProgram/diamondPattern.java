package practiceProgram;

import java.util.Scanner;

public class diamondPattern {

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number for diamond pattern: ");
        int number=scan.nextInt();

        for(int i=1;i<=number;i++){
            int space=number-i;
            while(space!=0){
                System.out.print(" ");
                space--;
            }
            int value=(i*number)-(number-1);
            for(int j=1;j<=i;j++){
                System.out.print(value+" ");
                value-=3;
            }

           System.out.println();
        }
        for(int i=number-1;i>=1;i--){
            int space=number-i;
            while(space!=0){
                System.out.print(" ");
                space--;
            }
            int value=(i*number)-(number-1);
            for(int k=1;k<=i;k++){
                System.out.print(value+" ");
                value-=3;
            }
            System.out.println();
        }

    }
}
