package CheatSheet;

public class TwoSumofDistinctIndexes77 {
    public static void main(String[] args){
      //  int arr[]={1,4,45,6,10,8};
        //int arr[]={1,2,4,3,6};
        int arr[]={11};
        int target=16;
        if(arr.length<=1){
            System.out.println("Only one element exists");
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int a=arr[i];
                int b=arr[j];
                if(a+b==target){
                    System.out.println(a+" "+b);
                }
            }
        }
    }
}
