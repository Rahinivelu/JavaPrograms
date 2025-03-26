package CheatSheet;

import java.util.Arrays;

public class FrequenciesInAArray83 {
    public static void findFrequency(int arr[],int len){
        int rows[]=new int[len];
        for(int i=0;i<len;i++){
            for(int j=1;j<=len;j++){
                if(arr[i]==j){
                    rows[j-1]++;
                }
            }
        }

        System.out.println(Arrays.toString(rows));
    }
    public static void main(String[] args){
      int arr[]={2,3,2,3,5};
       // int arr[]={3,3,3,3};
       // int arr[]={1};
        int len=arr.length;
        findFrequency( arr,len );
    }
}
