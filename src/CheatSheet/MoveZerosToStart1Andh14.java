package CheatSheet;

import java.util.Arrays;

public class MoveZerosToStart1Andh14 {
    public static int[] moveToStart(int arr[],int len){
        int j=len-1;
        for(int i=len-1;i>=0;i--){
            if(arr[i]!=0&& arr[j]==0)
            {
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
            }

            if(arr[j]!=0){
                j--;
            }
        }
        System.out.print(Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args){
        //int arr[]={1,2,0,4,3,0,5,0};
        int arr[]={1,4,2,0,3};
        int array[]=moveToStart(arr,arr.length);

   //     System.out.println(Arrays.toString(array));
    }
}
