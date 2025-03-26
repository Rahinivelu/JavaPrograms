package Zoho;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TargetElementK {
    public static boolean twoSum(int arr[],int target){

         for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr.length-1;j++){
                 if(arr[j]>arr[j+1]){
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                 }
             }
         }

         int left=0,right=arr.length-1;
         while(left<right){
             int sum=arr[left]+arr[right];
             if(sum==target){
                 return true;
             }else if(sum<target){
                 left++;
             }else {
                 right--;
             }

         }
        System.out.println(Arrays.toString(arr));

         return false;
    }
    public static void main(String[] args) {
        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;
        if(twoSum(arr,target))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
