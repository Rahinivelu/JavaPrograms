package CheatSheet;

import java.util.Arrays;

public class zoho6 {
    static  boolean value(char c){
        return (c=='!'||c=='#'||c=='@'||c=='$'||c=='%'||c=='^'||c=='&'||c=='*'||c=='('||c==')'||c=='{'||
        c=='{'||c=='}'||c=='['||c==']'||c=='|'||c=='\\'||c==':'||c==';'||c==','||c=='.'||c=='/'||c=='<'||c=='>');
    }
    public static void main(String[] args){
        String word="house!no:12";
        //String word="one,two,three";
        char let[]=new char[word.length()];
        for(int i=0;i<word.length();i++){
            let[i]=word.charAt(i);
        }

        int pointerA=0;
        int pointerB=word.length()-1;

        while(pointerA<pointerB) {

            if (value(let[pointerA])) {
                pointerA++;
            } else if (value(let[pointerB])) {
                pointerB--;
            } else {
                char temp = let[pointerA];
                let[pointerA] = let[pointerB];
                let[pointerB] = temp;
                pointerB--;
                pointerA++;
            }
        }

        String temp="";

        for(int i=0;i<let.length;i++){
            temp+=let[i];
        }
        System.out.print(temp);


    }
}
