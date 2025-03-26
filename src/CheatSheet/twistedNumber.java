package CheatSheet;

public class twistedNumber {

    static boolean isNormalPrime(int n){

        int temp=n;
        for(int i=2;i*i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int n=997;
        int temp=n;
        int reverse=0;
        while(n!=0){
           int value=  n%10;
           reverse=reverse*10+value;
           n/=10;
        }
       if(isNormalPrime(temp) && isNormalPrime(reverse)){
           System.out.println(1);
       }else{
           System.out.println(0);
       }

    }
}
