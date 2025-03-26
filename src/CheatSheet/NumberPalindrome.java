package CheatSheet;

public interface NumberPalindrome {
    static void findTheNumberIsPlaindrome(int number){
        int temp=number;
        int reverse=0;
        while(temp!=0){
            int rem=temp%10;
            reverse=reverse*10+rem;
            temp/=10;
        }

        if(reverse==number){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
       // System.out.println(reverse+"  "+number);
    }
    public static void main(String[] args){
        int number=1221;

        findTheNumberIsPlaindrome(number);
    }
}
