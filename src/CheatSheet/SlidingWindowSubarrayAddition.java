package CheatSheet;

public class SlidingWindowSubarrayAddition {
    public static void main(String[] args){
        int arr[]={1,1,1,1,1};
        int m=2,target=3;
        int sum=0;
        for(int i=0;i<m;i++){
            sum+=arr[i];
        }
        int count=0;
        if(sum==target)
            count++;
        for(int j=m;j<arr.length;j++){
            sum+=arr[j];
            sum-=arr[j-m];
            if(sum==target)
                count++;

        }

        System.out.println(count);
    }
}
