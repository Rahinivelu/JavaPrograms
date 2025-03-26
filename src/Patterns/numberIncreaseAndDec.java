package Patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class numberIncreaseAndDec {

    public static void main(String[] args){
        int array[]={12,3,56,89,13,21,9};
        List<Integer> even=new ArrayList<Integer>();
        List<Integer> odd=new ArrayList<Integer>();

        for(int i=0;i<array.length;i++){
            if(i%2==0){
                odd.add(array[i]);
            }else
                even.add(array[i]);
        }


        Collections.sort(odd);
        Collections.sort(even);
        //System.out.print(even);
         int []output=new int[array.length];
        int evenpoint=0;
        int oddpoint=odd.size()-1;
        for(int k=0;k<output.length;k++){
            if(k%2==0){
                output[k]=odd.get(oddpoint);
               oddpoint--;
            }
            else {
                output[k]=even.get(evenpoint);
                evenpoint++;
            }
        }

        System.out.print(Arrays.toString(output));

    }
}
