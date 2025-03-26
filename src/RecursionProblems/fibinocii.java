package RecursionProblems;

public class fibinocii {
    static int fibi(int n){

        if(n<2){
            return n;
        }
          return fibi(n-1)+fibi(n-2);
    }
    public static void main(String[] args){
        int number=4;
        System.out.println( fibi(number));
    }
}
