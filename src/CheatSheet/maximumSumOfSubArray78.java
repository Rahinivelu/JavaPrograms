package CheatSheet;

public class maximumSumOfSubArray78 {
    public static void main(String[] args){
        //int arr[]={2,3,-8,7,-1,2,3};
        //int arr[]={-2,-4};
        int arr[]={5,4,1,7,8};
        int len=arr.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        int current=0;
        for(int i=0;i<len;i++){
            sum=0;
            for(int j=i;j<len;j++){
                sum+=arr[j];
                if(sum<arr[j]){
                    current=arr[j];
                }else{
                    current=sum;
                }
                if(current>max){
                    max=current;
                }
            }
        }
        System.out.println(max);
    }
}
