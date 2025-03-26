package CheatSheet;

import java.util.ArrayList;
import java.util.Arrays;

public class KSizedSubArrayMax71 {

    public static void main(String[] args){
       // int arr[]={1,2,3,1,4,5,2,3,6};
        int arr[]={8,5,10,7,9,4,15,12,90,13};
        int target=4;
        int start=0,end=target;
        int max=0;


        ArrayList<Integer> arrays=new ArrayList<>();
        while(start<=arr.length-target){
            max=0;
            for(int i=start;i<end;i++){
                if(arr[i]>max){
                max=arr[i];
             }
            }
            arrays.add(max);
            start++;
            end++;

        }

        System.out.println(arrays);

    }
}
