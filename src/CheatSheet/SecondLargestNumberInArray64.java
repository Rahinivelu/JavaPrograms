package CheatSheet;

import java.util.Arrays;

public class SecondLargestNumberInArray64 {
    public static void main(String[] args){
        //int [] arr={12,35,1,10,34,1};
        int [] arr={10,5,10};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
         int Secon_largest=0;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=arr[arr.length-1]){
                Secon_largest=arr[i];
               // System.out.println(Secon_largest);
                break;
            }
        }
        System.out.println(Secon_largest);


    }
}
