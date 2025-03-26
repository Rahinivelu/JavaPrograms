package RecursionProblems;

public class PrintNum {
    static void Print1toMany(int N){
        if(N>0){
            Print1toMany(N-1);
            System.out.println(N);

        }

        return;
    }
    public static void main(String[] args) {
        Print1toMany(9);
    }
}
