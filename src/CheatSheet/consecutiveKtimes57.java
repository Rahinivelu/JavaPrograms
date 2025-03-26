package CheatSheet;


import java.util.Arrays;
//Need to be modified
public class consecutiveKtimes57{

    public static void main(String[] args){
        int arr[]={1, 0, 2, 3, 0, 4, 5, 0};
        int target=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        int newArrlen=arr.length+count;
        System.out.println(newArrlen);
        int Array[]=new int[newArrlen];
         int index=0;
         for(int i=0;i<arr.length;i++){
             Array[index++]=arr[i];
             if(arr[i]==target){
                 Array[index++]=arr[i];
             }
         }


         for(int i=0;i<arr.length;i++){
             arr[i]=Array[i];
         }
         System.out.println(Arrays.toString(Array));
        System.out.println(Arrays.toString(arr));
    }
}
