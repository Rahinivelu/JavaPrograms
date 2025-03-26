package CheatSheet;

import java.util.Arrays;

public class IsSquare59 {

    public static int distance(int x1,int y1,int x2,int y2){

        return (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);

    }
    public static void main(String[] args){
        int x1=2,y1=1,x2=10,y2=20,x3=5,y3=6,x4=10,y4=10;
        int dis[]=new int[6];
        dis[0]=distance(x1,y1,x2,y2);
        System.out.println(dis[0]);
        dis[1]=distance(x1,y1,x3,y3);
        dis[2]=distance(x1,y1,x4,y4);
        dis[3]=distance(x2,y2,x3,y3);
        dis[4]=distance(x2,y2,x4,y4);
        dis[5]=distance(x3,y3,x4,y4);


        Arrays.sort(dis);
        System.out.println(Arrays.toString(dis));
        if(dis[0]>0 &&
        dis[0]==dis[1] &&
        dis[0]==dis[2]&&
            dis[0]==dis[3]&&
                dis[4]==dis[5]&&
                dis[4]==2*dis[0]){
            System.out.println("true");
        }else{
            System.out.println("False");
        }

    }
}
