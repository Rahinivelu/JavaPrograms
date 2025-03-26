package CheatSheet;

public class sumOfTwoLargeNumber76 {
    public static void main(String[] args){
        String s1="3";
        String s2="2";

String small="";

for(int i=s1.length()-1;i>=0;i--){
    small+=s1.charAt(i);
    System.out.println(small);
}


        s1=new StringBuilder(s1).reverse().toString();
        s2=new StringBuilder(s2).reverse().toString();


        if(s1.length()>s2.length()){
            String temp=s1;
            s1=s2;
            s2=temp;
        }
        String newNum="";
        int n1=s1.length(),n2=s2.length();
        int carr=0;

        for(int i=0;i<n1;i++){

            int sum=((int)(s1.charAt(i)-'0') +(int)(s2.charAt(i)-'0')+carr);
            newNum+=(char)sum%10;
            carr=sum/10;
        }
        for(int j=n1;j<n2;j++){
           int sum=((int)(s2.charAt(j)-'0')+carr);
            newNum+=(char)sum%10;
            carr=sum/10;
        }
        if(carr>0){
        newNum+=(char)(carr-'0');
        }
        newNum=new StringBuilder(newNum).reverse().toString();
        System.out.println(newNum);

    }
}
