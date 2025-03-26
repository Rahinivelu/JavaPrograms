package Zoho;

public class DiamongPattern {
    public static void pattern(int number){

        for(int i=1;i<=number;i++){
            int k=number-i;
            for(int j=1;j<i;j++){
                while(k!=0){
                    System.out.print(" ");
                    k--;
                }
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        int space=0;
        for(int l=number-1;l>=0;l--){
            for(int i=0;i<space;i++)
            {
                System.out.print(" ");
            }
            for(int j=l;j>0;j--){
                System.out.print("* ");
            }
            System.out.println(" ");
            space++;
        }

    }
    public static void main(String[] args) {
        int number=7;
        pattern(number);
    }
}
