package CheatSheet;

import java.util.Arrays;

public class program27 {
    public static void main(String[] args){
        String ipv4="222.111.111.211";

        String array[]=new String[4];
        int k=0;
        String temp = "";
        int start=0;
        for(int i=0;i<ipv4.length();i++){
            temp="";
           if(ipv4.charAt(i)=='.'){
               for(int l=start;l<i;l++){
                   temp+=ipv4.charAt(l);
               }
               array[k++]=temp;
               start=i+1;
           }
        }
        for(int i=start;i<ipv4.length();i++){
            temp+=ipv4.charAt(i);
        }
        array[k++]=temp;
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
        boolean flag=true;
        for(String word: array){
              for(int i=0;i<word.length();i++){
                  if(word.charAt(i)<='0'|| word.charAt(i)>='9'||(word.charAt(0)=='0' && word.length()>1))
                  {
                      flag=false;
                      break;
                  }
                  int num=Integer.valueOf(word);
                  if(num<0|| num>255)
                  {
                      flag=false;
                      break;
                  }
              }
        }

        if(flag==true)
            System.out.println("Is Valid");
        else
            System.out.println("Not Valid");

//
//        String val="9876";
//        int num=0;
//        int m=0;
//        while(m<val.length()){
//            num=val.charAt(m)-'0';
//            m++;
//        }
//        System.out.println(num);

    }
}
