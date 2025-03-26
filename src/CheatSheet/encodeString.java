package CheatSheet;

public class encodeString {
    static String encodeTheLetters(String alpha){
        String help="";

        for(int i=0;i<alpha.length();i++){
            char a=alpha.charAt(i);
            if(a>=65 && a<=92){
                char letter= (char) ((int)a+32);
                help+=letter;
                //System.out.println(letter);
            }else if(a>=97 && a<=124){
                char letter= (char) ((int)a-32);
                help+=letter;
            }else{
                return "Invalid output";
            }
        }
        System.out.println(help);
        return help;
    }

    public static void main(String[] args){
        String alpha="Hello";
        String result=encodeTheLetters(alpha);
        System.out.println("main class =" + result);
        if(result.equals("Invalid output")){
            System.out.println("Invalid output");
        }else{
            String finalString="";
            for(int j=0;j<result.length();j++){
            char word=result.charAt(j);
            int ascii= (int)word;
            finalString+=(ascii+j);
            System.out.println(finalString);
        }
        }

    }
}
