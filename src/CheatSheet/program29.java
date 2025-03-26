package CheatSheet;

import java.util.*;

public class program29 {
    public static void main(String[] args){

//        int big_size= 10;
//        int small_size= 3;
//        int big_array[]={2,5,3,8,9,1,0,5,8,3};
//        int small_array[]={3,8,5};

//        int big_size= 8;
//        int small_size= 4;
//        int big_array[]={-1,-4,-5,-6,-8,-10,-20,-2};
//        int small_array[]={1,2,3,4};

        int big_size= 10;
        int small_size= 3;
        int big_array[]={2,5,8,9,3,1,0,5,8,3};
        int small_array[]={3,8,5};
       boolean flag=false;
        for(int i=0;i<=big_size-small_size;i++){
          flag=false;
            int count=0;
            int start_index=i,end_index=i+small_size;
            for(int j=i;j<i+small_size;j++){
                for(int k=0;k<small_size;k++){
                    if(big_array[j]==small_array[k]){
                        count++;
                        flag=true;
                    }
                }
                if(flag==false){
                    break;
                }
            }
            if(flag && count==small_size){
                System.out.println("from index "+i+" to"+(end_index-1));
                for(int l=i;l<end_index;l++)
                    System.out.print(big_array[l]+" ");
                System.out.println();
            }

        }
        if(flag==false){
            System.out.println("No such arrays are formed after matching");
        }
    }
}
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter the big array Size: ");
//        int big_size= scan.nextInt();
//        System.out.println("Enter the Small array Size: ");
//        int small_size= scan.nextInt();
//        int big_array[]=new int[big_size];
//        int small_array[]=new int[small_size];
//        System.out.println("Enter the Big array Elements: ");
//        for(int i=0;i<big_size;i++){
//            big_array[i]= scan.nextInt();
//        }
//        System.out.println("Enter the Small array elements: ");
//        for(int k=0;k<small_size;k++)
//            small_array[k]=scan.nextInt();