package CheatSheet;

import java.util.Arrays;

//public class SmallestGreatesNumberInWholeArray84 {
//    public static void main(String[] args){
//       // int arr[]={13,6,7,12};
//        int arr[]={6,3,9,8,10,2,1,15,7};
//        int array[]=arr.clone();
//        int newArray[]=new int[arr.length];
//
//        for(int i=0;i<array.length;i++){
//            for(int j=0;j<array.length-i-1;j++){
//                if(array[j]>array[j+1]){
//                    int temp=array[j];
//                    array[j]=array[j+1];
//                    array[j+1]=temp;
//                }
//            }
//        }
//
//        int k=0;
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<array.length;j++){
//                if(arr[i]==array[array.length-1]){
//                    newArray[k++]=0;
//                    break;
//                }
//                if(arr[i]==array[j]){
//                    newArray[k++]=array[j+1];
//                    break;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(newArray));
//    }
//}

public class SmallestGreatesNumberInWholeArray84 {
    public static void findSmallGreatest(int arr[],int len){

        for(int i=0;i<len;i++){
            int diff=Integer.MAX_VALUE;
            int closet=-1;
            for(int j=0;j<len;j++){


                if(arr[i]<arr[j] && arr[j]-arr[i]<diff){
                    diff=arr[j]-arr[i];
                    closet=j;
                }
            }
            if(closet==-1){
                System.out.print("_"+" ");
            }else{
                System.out.print(arr[closet]+" ");
            }
        }
    }
    public static void main(String[] args){
        int arr[]={6,3,9,8,10,2,1,15,7};
      //  int arr[]={13,6,7,12};
        int len=arr.length;
        findSmallGreatest(arr,arr.length);
    }
}