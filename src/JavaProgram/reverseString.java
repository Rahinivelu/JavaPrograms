package JavaProgram;

import java.util.Arrays;

public class reverseString {


    public static void main(String[] args){
        char[] s={'h','e','l','l','o'};

        char[] a=new char[s.length];
        int k=0;
        for(int i=s.length-1;i>=0;i--)
        {
            a[i]=s[k++];

        }

        System.out.println(Arrays.toString(a));
    }
}
