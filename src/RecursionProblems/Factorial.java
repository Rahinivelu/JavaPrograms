package RecursionProblems;

public class Factorial {

    static int fact(int l){
        if(l==0)
            return 1;

       return l*fact(l-1);

    }
    public static void main(String[] args){
        int k=6;
        System.out.println(fact(k));
    }
}
