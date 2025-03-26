package CheatSheet;

public class zprogram1 {

    public static void main(String[] args){
        int array_size=11;
        int array[]={21,63,54,67,13,88,43,57,604,1,100};
        int x=50,y=100;

        for(int i=0;i<array_size;i++){
            if(x<array[i]&&array[i]<y){
                System.out.println(array[i]);
            }
        }

    }
}
