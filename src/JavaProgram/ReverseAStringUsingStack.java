package JavaProgram;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
import java.util.Stack;

public class ReverseAStringUsingStack {


    public static String reverseit(String word) {

        char[] reverseit=new char[word.length()];
        System.out.println(reverseit.length);
        Stack<Character> st=new Stack<Character>();

        for(int i=0;i<word.length();i++){
            char x=word.charAt(i);
            st.push(x);
        }

        int i=0;
        while(!st.isEmpty()){
            reverseit[i++]=st.pop();
        }

        return new String(reverseit);
    }

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Write the string to reverse it: ");
        String word=scan.nextLine();
        System.out.println("Th length of the word"+word.length());
        String reverse=reverseit(word);
        System.out.println("The reversed word is ="+reverse);
    }


}
