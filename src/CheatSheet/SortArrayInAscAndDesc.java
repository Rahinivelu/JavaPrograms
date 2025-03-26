package CheatSheet;

import java.util.Arrays;

public class SortArrayInAscAndDesc {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9};

        int odd[]=new int[arr.length];
        int o=0;int e=0;
        int even[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                even[e]=arr[i];
                e++;
            }
            else{
                odd[o]=arr[i];
                o++;
            }
        }
        System.out.println("e "+e);
        System.out.println("o "+o);

        for(int i=0;i<e;i++){
            for(int j=0;j<e-i-1;j++){
                if(even[j]>even[j+1]){
                    int temp=even[j+1];
                    even[j+1]=even[j];
                    even[j]=temp;
                }
            }
        }
        for(int i=0;i<o;i++){
            for(int j=0;j<o-i-1;j++){
                if(odd[j]<odd[j+1]){
                    int temp=odd[j+1];
                    odd[j+1]=odd[j];
                    odd[j]=temp;
                }
            }
        }

        int hello[]=new int[o+e];
        int a=0;
        for(int i=0;i<arr.length;i=i+2){
            hello[i]=even[a];
            a++;
        }
        a=0;
        for(int i=1;i<arr.length;i=i+2){
            hello[i]=odd[a];
            a++;
        }

        for(int i=0;i<hello.length;i++){
            if(i==hello.length-1)
                System.out.print(hello[i]);
            else
            System.out.print(hello[i]+" ");
        }



    }
}
