package Zoho;

public class AddTillUnique {
    public static void main(String[] args) {
        int number=12345;

        int sum=0,temp=number;
        while(temp!=0|| sum>9){

            if(temp==0){
                temp=sum;
                sum=0;
            }
            int rem=temp%10;
            sum+=rem;
            temp/=10;
        }
        System.out.println(sum);
    }
}
