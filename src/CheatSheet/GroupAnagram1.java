package CheatSheet;

import java.util.Arrays;

public class GroupAnagram1 {

    public static void main(String[] args){
        String s1="eat";
        String s2="te";
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

       boolean final_result=Arrays.equals(c1,c2);
       if(final_result)
           System.out.println("Yes it is Anagram");
       else
           System.out.println("no it is not a Anagram");

    }
}
