package JavaProgram;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args){
        int a[]={5,8,2,4,3,9};

        for(int i=1;i<a.length;i++)
        {
            for(int j=i;j>0;j--){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
