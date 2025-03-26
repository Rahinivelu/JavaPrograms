package CheatSheet;

public class buyAndSellprogram28 {
    public static void main(String[] args){
       // int arr[]={1,5,2,3,7,6,4,5};
        int arr[]={5,5,10,8,7,6,4,5,2,6,1,10};
        int max_profit=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                max_profit+=(arr[i+1]-arr[i]);
            }
        }

        System.out.println(max_profit);
    }
}
