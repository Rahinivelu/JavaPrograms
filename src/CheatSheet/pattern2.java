package CheatSheet;

public class pattern2 {

    public static void main(String[] args){
        int num=4,x=0;

        for(int i=0;i<num;i++){
              for(int k=i;k<num-1;k++){
                  System.out.print("  ");
              }

            for(int j=0;j<num;j++){
            if(i%2==0){
                x++;
                System.out.print(x+" ");

              }else {
                System.out.print(x+" ");
                x--;
              }
            }
            System.out.println();
            x+=num;

        }
    }
}
