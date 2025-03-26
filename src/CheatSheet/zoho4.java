package CheatSheet;

import java.util.Arrays;

public class zoho4 {
    public static int compareTo(char c1,char c2){
        int l1=c1-65;
        int l2=c2-65;
        if(l1>l2)
            return 1;
        else if(l2>l1)
            return -1;
        else
            return 0;
    }
    public static void main(String[] args){
//        String s1="geeks";
//        String s2="kseeg";
        String s1="allergy";
        String s2="allergic";

        char c1[]=new char[s1.length()];
        for(int i=0;i<c1.length;i++){
           c1[i]=s1.charAt(i);
        }
        char c2[]=new char[s2.length()];
        for(int i=0;i<c2.length;i++){
            c2[i]=s2.charAt(i);
        }
        for(int i=0;i<c1.length;i++){
            for(int j=0;j< c1.length-i-1;j++){
                if(compareTo(c1[j],c1[j+1])>0){
                    char temp=c1[j];
                    c1[j]=c1[j+1];
                    c1[j+1]=temp;
                }
            }
        }
        for(int i=0;i<c2.length;i++){
            for(int j=0;j< c2.length-i-1;j++){
                if(compareTo(c2[j],c2[j+1])>0){
                    char temp=c2[j];
                    c2[j]=c2[j+1];
                    c2[j+1]=temp;
                }
            }
        }

        System.out.print(Arrays.toString(c1));
        System.out.print(Arrays.toString(c2));
        boolean flag=true;
        for(int i=0;i<c1.length;i++){
            if(c1[i]==c2[i]){
                continue;
            }else{
                flag=false;
                break;
            }
        }

        System.out.print(flag);


    }
}
