package CheatSheet;

public class pairCloseToZero49 {
    public static void main(String[] args){

        int arr[]={-21,-67,-37,-18,4,-65};
        //int arr[]={-8,5,2,-6};
        int closeToZero=arr[0]+arr[1];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int ans=arr[i]+arr[j];
                if(ans>closeToZero && ans<0 ){
                    closeToZero=ans;
                }
            }
        }
        System.out.println(closeToZero);
    }
}
