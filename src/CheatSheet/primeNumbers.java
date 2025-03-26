package CheatSheet;

import java.util.Scanner;

public class primeNumbers {
    private static boolean  prime(int val){
        if (val==0 || val==1)
            return false;
        for(int i=2;i<val;i++){
            if(val%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number upto which we have to print the prime numbers: ");
        int value=scan.nextInt();

        for(int i=1;i<=value;i++){
            if(prime(i)){
                System.out.println(i);
            }

        }


    }
}
