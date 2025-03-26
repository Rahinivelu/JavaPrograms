package RecursionProblems;

public class CounrZero {

    static int count(int number){
      return helper(number,0);
    }

     private static int helper(int n, int c) {
        if(n==0)
            return c;

        int rem=n%10;
        if(rem==0)
            return helper(rem/10,c+1);

        return helper(rem/10,c);
    }

    public static void main(String[] args){
        int number=345000012;
        System.out.println(count(number));

    }
}
