package RecursionProblems;

public class String1 {
    static void makeString(String value, String newStr){

        if(value.isEmpty()){
            System.out.println(newStr);
            return;
        }
        char num=value.charAt(0);
        if(num=='a'){
           makeString(value.substring(1),newStr);
        }else{
            makeString(value.substring(1),newStr+num);
        }

    }
    public static void main(String[] args) {
        String value="bcaccab";
        String result="bcccb";

        makeString(value,"");
    }
}
