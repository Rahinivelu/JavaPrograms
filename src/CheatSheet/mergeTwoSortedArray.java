package CheatSheet;

import java.util.Arrays;

public class mergeTwoSortedArray {
    public static boolean ContainsNum(int final_array[],int arr,int k){
        for(int i=0;i<k;i++){
            if(final_array[i]==arr)

                return true;

        }
        return false;
    }
    public static void main(String[] args) {
        int arr1[]={ 2,4,5,6,7,9,10,13};
        int arr2[]={2,3,4,5,6,7,8,9,11,15};

        int final_array[]=new int[arr1.length+arr2.length];
        int k=0;
        for(int i=0;i<arr1.length;i++){
            if(!ContainsNum(final_array,arr1[i],k)){
                final_array[k++]=arr1[i];
            }
        }
        for(int i=0;i<arr2.length;i++){
            if(!ContainsNum(final_array,arr2[i],k)){
                final_array[k++]=arr2[i];
            }
        }

        for(int i=0;i<k;i++)
        {
            for(int j=0;j<k-i-1;j++){
                if(final_array[j]>final_array[j+1]){
                    int temp=final_array[j];
                    final_array[j]=final_array[j+1];
                    final_array[j+1]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(final_array));


    }
}
