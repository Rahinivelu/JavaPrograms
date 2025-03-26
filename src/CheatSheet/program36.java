package CheatSheet;

public class program36 {
    public static void main(String[] args){
        int input=5;
//        for(int i=1;i<=input;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

        for(int i=1;i<=input;i++){
            int num=i;
            for(int j=1;j<=input+i-1;j++){
                if(j<=input-i)
                    System.out.print(" ");
                else if(j<=input)
                    System.out.print(num++);
                else
                    System.out.print(--num-1);

            }
            System.out.println();
        }


    }
}
