package JavaProgram;

import java.util.Arrays;

public class SelectionSort {

    public static void  main(String[] args)
    {
        int arr[]={10,5,15,3,26,22};

        for(int i=0;i<arr.length;i++){// fix the min position

            int min=arr[i];
            int minIdex=i;

            for(int j=i+1;j<arr.length;j++){ //select the min val
               if(min>arr[j]){
                   min=arr[j];
                   minIdex=j;
               }
            }

            //swap the min
            int temp=arr[i];
            arr[i]=arr[minIdex];
            arr[minIdex]=temp;


        }

        System.out.println(Arrays.toString(arr));
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
    }
}
