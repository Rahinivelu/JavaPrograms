package InterviewPrep;

public class Substring {

    public static void main(String[] args){
        String s1="test1234";
        String s2="124";

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==s2.charAt(0)){
                int tempnum=i;
                String temp="";

                for(int j=tempnum;j<(tempnum+s2.length());j++){
                    temp+=s1.charAt(j);
                }
                System.out.println(temp);
                System.out.println(s2);
                if(temp.equals(s2)){
                    System.out.println(tempnum);
                }else System.out.println(-1);
            }
        }
    }
}
