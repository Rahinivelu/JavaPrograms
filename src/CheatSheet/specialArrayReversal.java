package CheatSheet;

import java.util.Arrays;

public class  specialArrayReversal {
    public static void reverseTheLetter(String word){
        char[] letter=word.toCharArray();
        int left=0;
        int right=letter.length-1;

        System.out.println(Arrays.toString(letter));
        while(left<right){
            if(!((letter[left]>='a'&& letter[left]<='z')||(letter[left]>='A'&& letter[left]<='Z'))){
                left++;
            }else if(!((letter[right]>='a'&& letter[right]<='z')||(letter[right]>='A'&& letter[right]<='Z'))){
                right--;
            }else{
                char temp=letter[left];
                letter[left]=letter[right];
                letter[right]=temp;
                left++;
                right--;
            }
        }

        System.out.println(Arrays.toString(letter));
    }
    public static void main(String[] args){
        //String word="x&A#";
        String word="xg&A#CV";
        reverseTheLetter(word);
    }
}
