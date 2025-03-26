package RecursionProblems;

public class ProductOfDigits {

    static int pro(int num){
        if(num==0){
            return 1;
        }
        return num%10*pro(num/10);

    }
    public static void main(String[] args){
        int number=3333;
        System.out.println(pro(number));
    }
}
