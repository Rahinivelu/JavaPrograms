package CheatSheet;

import java.util.Arrays;

public class ReverseVowel74 {
    public static boolean isVowel(char letter){
        return (letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'||letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U');
    }
    public static void main(String[] args) {
        String word = "geekforgeeks";
        //String word = "leeTcoDe";
        char[] letters = word.toCharArray();

        int start = 0, end = word.length() - 1;
        while (start < end) {
//            char s1 = letters[start];
//            char s2 = letters[end];
            while (start<end && !isVowel(letters[start]) ) {
                start++;

            } while (start<end && !isVowel(letters[end])){
                end--;
            }
                char temp = letters[start];
                letters[start]= letters[end];
                letters[end] = temp;
                start++;
                end--;

        }

        System.out.println(Arrays.toString(letters));
    }
}
