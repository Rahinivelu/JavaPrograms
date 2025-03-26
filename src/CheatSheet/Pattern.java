package CheatSheet;

public class Pattern {
    public static void main(String[] args){
        int input=5;
        int x=1,y,t;
        for(int i=input;i>0;i--){
            y=i;
            t=x;
            for(int k=i-1;k>0;k--)
                System.out.print("* ");
            for(int j=input;j>=i;j--){
                System.out.print(t+"");
                t=t-y;
                y++;
            }
            x=x+i;
            System.out.println();
        }
    }
}
