package Patterns;

import java.util.Scanner;

public class InnerReducingPatternProgram {

    public static void main (String[] args){
        System.out.println("Enter the number ");
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt();
        int n=(r*2)-1;
        int a[][]=new int[100][100];
        int front=0,last=n-1;
        while(r!=0){
            for(int i=front;i<=last;i++)
            {
                for(int j=front;j<=last;j++){
                    if(i==front||j==front||i==last||j==last){
                        a[i][j]=r;
                    }//System.out.print("  ");
                }

            }
            front++;
            last--;
            r--;
        }

        for(int i=0;i<=n-1;i++){
            for(int j=0;j<=n-1;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }

    }
}
