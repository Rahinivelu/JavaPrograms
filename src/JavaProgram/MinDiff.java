package JavaProgram;

import java.util.Arrays;

public class MinDiff {

    public static void main(String[] args){
        int arr[]={5,1,3,7,3};
        int size=arr.length;
        for(int i=0;i<arr.length;i++){
            int temp;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int count=0;
        for(int i=0;i<arr.length-1;i++){
          count+=  arr[i+1]-arr[i];
        }

        System.out.print(Arrays.toString(arr));
        System.out.print(count);
    }
}
