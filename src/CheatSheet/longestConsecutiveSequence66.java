package CheatSheet;

import java.util.Arrays;

public class longestConsecutiveSequence66 {

    public static void main(String[] args){
        int arr[]={1,9,3,10,4,20,2};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        int count=1;
        int longest=1;
        for(int i=0;i<arr.length-1;i++){
            int first=arr[i];
            int second=first+1;
            if(second==arr[i+1]){
                count++;
            }else{
                if(longest<count){
                    longest=count;
                    count=1;
                }
            }
        }

       System.out.println("longestSubsequence"+longest);
        //System.out.println(count);

        System.out.println(Arrays.toString(arr));
    }
}
