package CheatSheet;

public class ArthimeticOperation {
    public static void main(String[] args){
       // String word="12345+-*/";
        String word="73421*+*-";
        int result=(word.charAt(0)-'0');
        int value=0;

        for(int i=0;i<word.length();i++){
            if(word.charAt(i)<48 && word.charAt(i)<57){
                value=i;
                break;
            }
        }
        System.out.println(value);
        for(int i=1;i<value;i++){
            char x=word.charAt(i+value-1);
           if(x=='+'){
              result+=(word.charAt(i)-'0');
           }else if(x=='-'){
               result-=(word.charAt(i)-'0');
           }else if(x=='*'){
               result*=(word.charAt(i)-'0');
           } else if(x=='/'){
               result/=(word.charAt(i)-'0');
           }
        }

        System.out.println(result);

    }
}
