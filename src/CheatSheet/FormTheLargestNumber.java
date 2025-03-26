package CheatSheet;

import java.util.Arrays;

public class FormTheLargestNumber {

    public static int compareTo(String s1,String s2){
        String order1=s1+s2;
        String order2=s2+s1;
        return order1.compareTo(order2);
    }
    public static void main(String[] args) {
        int ar[] = {3, 30, 34, 5, 9};
        String []number=new String[ar.length];
        StringBuffer str=new StringBuffer();

        for(int i=0;i<ar.length;i++){
            number[i]=String.valueOf(ar[i]);
        }

        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length-i-1;j++){
                if(compareTo(number[j],number[j+1])<0){
                    String temp=number[j];
                    number[j]=number[j+1];
                    number[j+1]=temp;
                }
            }
            System.out.println(Arrays.toString(number));
        }

        for(int i=0;i<ar.length;i++){
           str.append(number[i]);
        }

       System.out.println(str);

    }
}
