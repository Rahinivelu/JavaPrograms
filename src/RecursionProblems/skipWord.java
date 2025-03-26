package RecursionProblems;

public class skipWord {

    static String skipApple(String word){
        if(word.isEmpty())
            return "";
        if(word.startsWith("apple"))
            return skipApple(word.substring(5));
        else
            return word.charAt(0)+skipApple(word.substring(1));
    }
    static String skipAppnotApple(String word){
        if(word.isEmpty())
            return "";
        if(word.startsWith("app") && !word.startsWith("apple"))
            return skipAppnotApple(word.substring(3));
        else
            return word.charAt(0)+skipAppnotApple(word.substring(1));
    }
    public static void main(String[] args){
        String word="bdapplyujhyfg";
        System.out.println(skipApple(word));
        System.out.print(skipAppnotApple(word));

    }
}
