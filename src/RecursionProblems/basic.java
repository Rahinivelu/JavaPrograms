package RecursionProblems;

public class basic {
    static void callRecurs(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        //n--;
        callRecurs(n-1);
    }
    static void callRecursRev(int k){
        if(k==0){
            return;
        }

        callRecursRev(k-1);
        System.out.println(k);
    }
    public static void main(String[] args){
        callRecurs(5);
        System.out.println("------------------------");
        callRecursRev(5);
    }
}
