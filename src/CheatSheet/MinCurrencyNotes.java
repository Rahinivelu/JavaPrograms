package CheatSheet;

import java.util.LinkedHashMap;
import java.util.Map;

public class MinCurrencyNotes {

    private static void printCurrency(int amount){
        int values[]={2000,500,200,100,50,20,10,5,1};
        int number[]=new int[9];


        for(int i=0;i<9;i++){
            if(amount>=values[i]){
               int digit= amount/values[i];
               number[i]=digit;
               amount=amount%values[i];

            }
        }

        for(int i=0;i<9;i++){
            if(number[i]!=0)
            {
                System.out.println(values[i] + " : "+number[i]);
            }
        }

    }

    public static void main(String[] args){
        int amount=1200;
        printCurrency(amount);
    }
}
