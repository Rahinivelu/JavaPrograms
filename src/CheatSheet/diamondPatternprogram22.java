package CheatSheet;

public class diamondPatternprogram22 {
    public static void main(String[] args){
        int num=4;
        int temp=num;
        for(int i=1;i<=(num*num)-1;i++){

           int value=(i*num)-(num-1);
           if(i<=temp){
               for(int space=i;space<temp;space++){
                   System.out.print(" ");
               }

               for(int colour=1;colour<=i;colour++){
                   System.out.print(value+" ");
                   value-=num-1;
               }

               }else if(temp<i){

           }
           System.out.println();

//               i++;
//               temp--;
           }
        }
    }

