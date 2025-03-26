package RecursionProblems;

public class ReverseANumber {
    static int rev(int number){
        if(number/10<10){
            System.out.println(number%10);
            return number/10;
        }


        System.out.println(number%10);
        rev(number/10);
        return number%10;
    }
    public static void main(String[] args){
        int value=768943;
        System.out.println(rev(value));
    }
}
