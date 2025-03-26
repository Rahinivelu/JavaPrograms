package CheatSheet;

import java.util.Arrays;

public class program13 {
    public static void main(String[] args){
      //  int arr[]={10,36,3,49,12};
        //int arr[]={20,49,6,64,12};
        int arr[]={81,25,32,8,2};
        int point[]=new int[arr.length];
        int count=0;

        for(int i=0;i<arr.length;i++){
            count=0;
            int perfect_Square=5;
            int even_number=3;
            int div4and6=4;
            int div=2;
            while(div<=arr[i]/2){
                if(div*div==arr[i]){
                    count+=perfect_Square;
                    break;
                }
                div++;
            }

            if(arr[i]%4==0 && arr[i]%6==0){
                count+=div4and6;
            }

            if(arr[i]%2==0){
                count+=even_number;
            }


            point[i]=count;
        }
        System.out.println(Arrays.toString(point));
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<point.length;i++){
            for(int j=0;j< point.length-i-1;j++){
                if(point[j]<point[j+1]){
                    int temp=point[j];
                    point[j]=point[j+1];
                    point[j+1]=temp;

                     temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
