package CheatSheet;

import java.util.Arrays;

public class program30 {
    public static void reverseArrayElements(int arr[],int count){
        int new_array[]=new int[arr.length];

        int index=0;
        for(int k:arr){
            int val=k;
            int mul=1;
            for(int i=0;i<count;i++){
                mul*=10;
            }
            int rev=0;
            while(k!=0){
                int temp=k%10;
                rev=(rev*10)+temp;
                mul/=10;
                k/=10;
            }
            rev=rev*mul;
            new_array[index++]=rev;

        }
        System.out.print(Arrays.toString(new_array));

    }
    public static void main(String[] args) {
             int arr[]={1,2,4,15,8};
        //int arr[] = {4, 3, 70, 15, 118};
        int new_array[] = new int[arr.length];
        int max_digit_count = 0;

        for (int input : arr) {
            int count = 0;
            while (input !=0) {
                input /= 10;
                count++;
            }
            if (max_digit_count < count)
                max_digit_count = count;
        }
        System.out.println(max_digit_count);
        reverseArrayElements(arr,max_digit_count);
    }

}
