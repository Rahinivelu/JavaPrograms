package CheatSheet;

public class TwoSumPairWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,6};
        int target =11;
        boolean freeze = false;

        if (arr.length>1) {
            for (int i = 0; i < arr.length; i++) {

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] + arr[i] == target) {
                        freeze = true;
                        System.out.println("True");
                    }
                }
            }
        }
        if (!freeze) {
            System.out.println("False");
        }
    }
}
/**
 *
 *
 * If the array can be sorted we can use this logic
 * Arrays.sort(arr);
 * int left=0;
 * int right=arr.length-1;
 * while(left<right){
 *     int sum=arr[left]+arr[right];
 *     if(sum==target)
 *        return true;
 *        else if(sum<target){
 *        left++;}
 *        else{
 *        right--;}
 *
 *        }
 *        return false;
 *
 * }
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */