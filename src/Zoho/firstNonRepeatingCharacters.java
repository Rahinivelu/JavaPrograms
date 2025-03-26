package Zoho;

import java.util.Arrays;

public class firstNonRepeatingCharacters {

    public static char nonRepeatingChar(String value){

        int max_value=26;
        int visit[]=new int[max_value];
        Arrays.fill(visit,-1);
        for(int i=0;i<value.length();i++){
            char letter=value.charAt(i);
            if(visit[letter-'a']==-1){
                visit[letter-'a']=i;
            }else{
                visit[letter-'a']=-2;
            }
        }

        int index=Integer.MAX_VALUE;

        for(int i=0;i<max_value;i++){
            if(visit[i]>=0)
               index=Math.min(index,visit[i]);
        }


        return (index==Integer.MAX_VALUE?'$': value.charAt(index));
    }
    public static void main(String[] args) {
        String value="racecar";
        System.out.println(nonRepeatingChar(value));
    }
}
