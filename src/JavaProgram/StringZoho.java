package JavaProgram;

import java.util.Arrays;

public class StringZoho {

    public static void main(String[] args){
        String word="a20b15";
        char[] ch=new char[word.length()];
        int[] arr=new int[word.length()];
        int j=0,k=0;

        for(int i=0;i<word.length();i++){
           char c= word.charAt(i);
           if(c>='a' && c<='z'){
               ch[j++]=c;
           }else{
               //if(!(word.charAt(i-1)==(c>='a' && c<='z')))
               if(word.charAt(i-1)-'0' >= 0 && word.charAt(i-1) -'0'<= 9){
                   String temp=String.valueOf(word.charAt(i-1)).concat(String.valueOf(word.charAt(i)));
                   System.out.println(temp+" the value is ");
                   arr[--k]=Integer.parseInt(temp);
               }else
               arr[k++]=Integer.parseInt(String.valueOf(c));

           }
        }

        for(int o=0;o<ch.length;o++){
            for(int l=0;l<arr[o];l++){
                System.out.print(ch[o]);
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ch));
    }
}
