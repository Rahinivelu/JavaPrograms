package CheatSheet;

public class program100 {
    public static void main(String[] args){

        int input=5;
        int count=1;
        for(int i=1;i<=input;i++){
            for(int j=1;j<=input-i;j++){
                System.out.print("*");
            }
           int x=4;
           count=i;
            for(int k=1;k<=i;k++){
                System.out.print(count);
               count=count+input-x;
            }

            System.out.println();
        }
    }
}
