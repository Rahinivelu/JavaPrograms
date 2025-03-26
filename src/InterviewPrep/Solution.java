package InterviewPrep;

import java.util.Arrays;

class solution {

    public static void main(String [] args){
        int arr1[]={1,2,3};
        int arr2[]={1,2};
        System.out.println(doUnion(arr1,arr2));
    }
    public static int doUnion(int arr1[], int arr2[]) {
        // Your code here
        int len=arr1.length+arr2.length;

        int array[]=new int[len];
        for(int i=0;i<arr1.length;i++){
            array[i]=arr1[i];
        }
        for(int j=0;j<arr2.length;j++){
            array[arr1.length+j]=arr2[j];
        }

        Arrays.sort(array);

        int arr[]=new int[10];

        for(int i=0;i<array.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==j)
                    arr[j]++;
            }
        }
        int value=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                value++;
            }
        }
        return value;
    }
}
