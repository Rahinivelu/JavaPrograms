package CheatSheet;

import java.util.Arrays;

public class IpAddress81 {

    public static void main(String [] args){
        //String password="222.111.111.111";
        //String password="555..555";
        String password="0.0.0.65";
        String[] array=new String[4];

        int k=0;
        array[k]="";
        for(int i=0;i<password.length();i++){
            if(password.charAt(i)!='.') {
                char word = password.charAt(i);
               // System.out.println(word);
                array[k] +=word ;
                //System.out.println(array[k]);
            }else{
                k++;
                array[k]="";
            }
        }


        for(int i=0;i<array.length;i++){
            boolean flag=false;
          if(array.length<4){
              System.out.println("false");
              break;
          }
          if(Integer.valueOf(array[i])>=0 &&Integer.valueOf(array[i])<=225 &&Integer.valueOf(array[0])!=0){
              System.out.println("true");
              flag=true;
          }
          if(flag==false){
              System.out.println("false");
              break;
          }
        }

    }
}
