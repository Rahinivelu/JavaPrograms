package CheatSheet;

import java.util.Arrays;

public class AddIntToAllNum {

    public static void main(String[] args){
        int arr=2875;
        int add=4;
        int placeValue=1;
        int result=0;
        while(arr!=0){
            int rem=arr%10;
            rem+=add;
            result+=rem*placeValue;
        //  System.out.println(result);
            placeValue*=(rem>=10)?100:10;
            //word+=String.valueOf(rem);
            arr/=10;
        }
        System.out.println(result);
    }
}
