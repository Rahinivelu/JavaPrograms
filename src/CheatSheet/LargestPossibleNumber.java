package CheatSheet;

import java.util.Arrays;

public class LargestPossibleNumber {

    public static int compareTo(String a,String b){
        String letter=a+b;
        String letter1=b+a;
        return letter.compareTo(letter1);


    }
    public static void main(String[] args){
        int [] array={3,30,34,5,9};
        //int [] array={10,2};
        String []number=new String[array.length];
        StringBuffer str=new StringBuffer();

        for(int i=0;i<array.length;i++){
            number[i]=String.valueOf(array[i]);
        }
        for(int i=0;i<number.length-1;i++){
            for(int j=0;j< number.length-i-1;j++){
                if(compareTo(number[i],number[i+1])>0){
                    String temp=number[i];
                    number[i]=number[i+1];
                    number[i+1]=temp;
                }
            }
        }

        for(int i=number.length-1;i>=0;i--){
            str.append(number[i]);
        }

        System.out.println(str.toString());
       // System.out.println(Arrays.toString(number));
    }
}
