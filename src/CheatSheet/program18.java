package CheatSheet;

import java.util.Arrays;

public class program18 {

    public static void main(String[] args) {
        String word = "HYDRATION";
       /// String word = "ACIDIFICATION";
        int len=word.length(),mid=len/2,mid2=mid-1,mid3=mid+1;
        for(int j=0;j<len;j++){

            if(j<=mid){
                mid3--;mid2++;

            for(int k=0;k<len;k++){
                if(k==0||k==len-1){
                    System.out.print(word.charAt(mid2));
                }
                else if(j>0 &&( k==j|| k==len-j-1)){
                    System.out.print(word.charAt(mid3));
                }else{
                    System.out.print(" ");
                }
            }
        }else{
                mid3++;mid2--;
                for(int k=0;k<len;k++){
                    if(k==0||k==len-1)
                       System.out.print(word.charAt(mid2));
                    else if(j>0&&(k==j|| k==len-j-1))
                        System.out.print(word.charAt(mid3));
                    else
                        System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
