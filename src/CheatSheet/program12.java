package CheatSheet;

public class program12 {
    public static void main(String[] args){
        int m=1000,n=2000;


        for(int i=m;i<n;i++){
            int x=0;
            int z=i;
            int temper=i;
            while(temper>0){
                int temp=temper%10;
                x+=temp;
                temper/=10;
            }
            int y=0;
            int xaxis=x;
            while(x>0){
                int temp=x%10;
                y=y*10+temp;
                x/=10;
            }

            int mul=xaxis*y;

            if(mul==z){
                System.out.println(z);
            }





        }
    }
}
