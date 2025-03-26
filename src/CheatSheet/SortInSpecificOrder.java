package CheatSheet;

import java.util.ArrayList;

import java.util.Collections;

public class SortInSpecificOrder {
    private static void sortinginOrder(int [] arrays){

        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer>even=new ArrayList<>();

      //  int mainArray[]=new int[arrays.length];

        for(int values:arrays){
            if(values%2==0){
               even.add(values);
            }else {
                odd.add(values);  }
        }

        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());

        int index=0;
        for(int nums:odd){
          arrays[index++]=  nums;
        }
        for(int nums:even){
            arrays[index++]=  nums;
        }

        for(int numbere: arrays){
            System.out.println(numbere);
        }
//        for(int i=0;i<odd.length-1;i++){
//            for(int j=i+1;j<odd.length;j++){
//                int temp=odd[i];
//                if(odd[i]<odd[j]){
//                    odd[i]=odd[j];
//                    odd[j]=temp;
//                }
//            }
//        }
//        for(int i=0;i<even.length-1;i++){
//            for(int j=i+1;j<even.length;j++){
//                int temp=even[i];
//                if(even[i]>even[j]){
//                    even[i]=even[j];
//                    even[j]=temp;
//                }
//            }
//        }
         // int h=0;
//            for(int i=0;i<odd.length;i++){
//              mainArray[h++]=odd[i];
//            }
//
//
//
//        for(int i=0;i<even.length;i++){
//           mainArray[h++]=even[i];
//        }

//        for(int d=0;d<mainArray.length;d++){
//            System.out.println(mainArray[d]);
//        }
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,7,10};
        sortinginOrder(arr);
    }
}
