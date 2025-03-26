package CheatSheet;

public class climbingStairs68 {
    public static void main(String[] args){
        int num=5;
        int ar[]=new int[num+1];
        ar[0]=1;
        ar[1]=1;
        for(int i=2;i<ar.length;i++){
            ar[i]=ar[i-1]+ar[i-2];
        }
        System.out.println(ar[num]);
    }
}
