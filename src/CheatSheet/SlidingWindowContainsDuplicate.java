package CheatSheet;

public class SlidingWindowContainsDuplicate {
public static boolean containDuplicate(int [] nums,int k){
    int start=0;
    int end=0;
    while(end<nums.length){
        for(int i=start;i<end;i++){
            if(nums[i]==nums[end]){
                return true;
            }
        }

        end++;

        if(end-start>k){
            start++;
        }

    }

    return false;

}
    public static void main(String [ ]args){
        int arr[]={1,2,3,1};
        int target=3;

       boolean flag= containDuplicate(arr,target);
       System.out.println(flag);
    }
}
