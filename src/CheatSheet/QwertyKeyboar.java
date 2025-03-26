package CheatSheet;

public class QwertyKeyboar {
    public static void formTheWord(String s1,String s2, String s3){

        for(int i=0;i<s1.length();i++){
            StringBuffer str=new StringBuffer();
            char letter1=s1.charAt(i);
            str.append(letter1);
            for(int j=0;j<s2.length();j++){
                char letter2=s2.charAt(i);
                str.append(letter2);
                for(int k=0;k<s3.length();k++){
                    char letter3=s3.charAt(i);
                    str.append(letter3);
                }
                System.out.println(str);
            }
        }
    }
    public static void main (String [] args){
        String keypad1="abc";
        String keypad2="def";
        String keypad3="ghi";

        formTheWord(keypad1,keypad2,keypad3);
    }
}
