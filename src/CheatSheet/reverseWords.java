package CheatSheet;

import java.util.Arrays;

public class    reverseWords {
    public static void main(String[] args){
       // String word=" i like this program very much ";
        String word=" a ";
        //String word=" pqr mno ";
        int start=0;int end=word.length()-1;

        while(start<=end && word.charAt(start)==' ')
            start++;

        while(end>=start && word.charAt(end)==' ')
            end--;

        String letters="";
        int index=0;
        String[] new_word=new String[word.length()];
        boolean inWord=false;
        for(int i=start;i<=end;i++){
            char c=word.charAt(i);
            if(c!=' '){
                letters+=c;
                inWord=true;
            }else if(inWord){
                new_word[index++]=letters;
                letters="";
                inWord=false;
            }
        }
        new_word[index++]=letters;
        letters="";

        for(int i=index-1;i>=0;i--){
            if(i>0)
             letters+=new_word[i]+" ";
            else
                letters+=new_word[i];
        }

        System.out.print(letters);

    }
}
