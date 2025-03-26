package CheatSheet;

public class NumberOfOccurence62 {

    public static void main(String[] args){
        int arr[]={8,9,10,12,12,12};
        int target=12;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }

        }
        if(count==1){
            System.out.println(1);
        }

        System.out.println(count);
    }
}
