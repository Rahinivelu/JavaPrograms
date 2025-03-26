package CheatSheet;

public class MissingElement {

    public static void main(String[] args){
        int arr[]={8,2,4,5,3,7,1};
        int n=arr.length+1;
        int actualSum=n*(n+1)/2;
        int sum=0;

        for(int i=0;i< arr.length;i++){
           sum+=arr[i];
        }

        int value=actualSum-sum;

        System.out.println(value);
    }
}
