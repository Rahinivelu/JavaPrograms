package CheatSheet;


import java.util.Arrays;

public class program21 {
    public static void main(String[] args){
       String word="zoho corporation";
       // String word="Hello";
        char[] let=new char[word.length()];
        System.out.println(word.length());
        //int num=9;
        int num=4;
        num=num%word.length();

        //char var='L';
        char var='R';
        int index=0;
        if(var=='R'){
            for(int i=num;i<word.length();i++){
                let[i]=word.charAt(index++);
            }
            for(int i=0;i<num;i++){
                let[i]=word.charAt(index++);
            }
            String temp="";
            for(int i=0;i<let.length;i++)
                temp+=let[i];

            System.out.println(temp);
        }
        if (var == 'L') {
             if(num>word.length()){

             }
             index=0;
             for(int j=num;j<word.length();j++){
                 let[index++]=word.charAt(j);
             }
             for(int j=0;j<num;j++){
                 let[index++]=word.charAt(j);
             }
           System.out.println(Arrays.toString(let));

        }


    }
}
