import Pharmacy.pharmacyManagement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class practice {
    public static void main(String [] args){
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter the Integer number");
//        int number=scan.nextInt();
//        System.out.println("Enter the long number");
//        long value=scan.nextLong();
//        pharmacyManagement pharmacy=new pharmacyManagement();
//        pharmacy.addBranch()
//

//        int number1=10;
//        Integer number2=10;
//        System.out.println(number1==number2.intValue());

        int arr[]={1,2,3,4,5,6,8};

      int value= Arrays.stream(arr).filter(i-> i>2).sum();
        System.out.print(value);


    }
}
