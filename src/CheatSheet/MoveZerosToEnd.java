package CheatSheet;

public class MoveZerosToEnd {
    public static int[]  zeros(int []arr, int n){

        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }

        return arr;
    }
    public static void main(String[] args){
        int arr[]={9,0,5,5,0,8,6,0};
            int []narr=zeros(arr,arr.length);
            for(int i=0;i< narr.length;i++){
                System.out.println(narr[i]);
            }
    }
}
