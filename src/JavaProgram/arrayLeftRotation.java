package JavaProgram;

import java.util.Arrays;

public class arrayLeftRotation {
    private static int[] rightRotate(int[] arrays, int rotate){
        for (int i=0;i<rotate;i++){
            int temp=arrays[arrays.length-1];
          //   int val=arrays[temp];
            System.out.println(temp);
            int j;
            for(j=arrays.length-1;j>0;j--){
                arrays[j]=arrays[j-1];
            }
            arrays[0]=temp;
        }
        return arrays;
    }

    private static int[] leftRotate(int[] arr, int rotate){

        for(int i=0;i<rotate;i++){
            int temp=arr[0];
            int j;
            System.out.println("length: "+ arr.length);
            for(j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[j]=temp;
        }
        return arr;
    }

    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int arrays[]={1,2,3,4,5};
        int rotate=2;
        System.out.println(Arrays.toString(arr));
        leftRotate(arr,rotate);
        System.out.println("Left roatation = "+Arrays.toString(arr));
        rightRotate(arrays,rotate);
        System.out.println("right roatation = "+Arrays.toString(arrays));

    }
}
