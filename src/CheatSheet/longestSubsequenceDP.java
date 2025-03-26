package CheatSheet;

import java.util.Arrays;

public class longestSubsequenceDP {

    public static int LIS(int array[], int len){
        int len_array[]=new int [len];
        for(int k=0;k<len;k++){
            len_array[k]=1;
        }
        for(int i=1;i<len;i++){
            for(int j=0;j<i;j++){
                if(array[i]>array[j] && len_array[i]<len_array[j]+1){
                    len_array[i]=len-array[j]+1;
                }
            }
        }

        return Arrays.stream(len_array).max().orElse(1);
    }
    public static void main(String[] args){
        int array[]={5,8,7,1,9};

        int max_length=LIS(array,array.length);

        System.out.println(max_length);
    }
}
