package Patterns;

public class number1 {
    public static void main(String[] args){
        int num=10;
        for(int i=0;i<num;i++){
                for(int j=i;j<num;j++){
                    System.out.print(" ");
                }
                for(int k=0;k<num;k++){
                    System.out.print("*");
                }
                System.out.println();
        }
    }
}
