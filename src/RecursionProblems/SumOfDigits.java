package RecursionProblems;

public class SumOfDigits {
    static int sum(int value){

         if(value==0){
             return 0;
         }
        return value%10+sum(value/10);
    }
    public static void main(String[] args){
        int number=5678;
        System.out.println(sum(number));
    }
}
