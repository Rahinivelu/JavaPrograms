package CheatSheet;

public class MaximumProductOfThreeNumbers48 {
    public static void main(String[] args){
        int arr[]={1,2,3,-100,-20};

        if(arr.length<3) {
            System.out.println("the length is less than three");

        }
            for(int i=0;i<arr.length-1
                    ;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
             long mul=1;
            for(int i=0;i<3;i++){
                mul*=arr[arr.length-i-1];
            }

            long lmul=arr[0]*arr[1]*arr[arr.length-1];

            long value=Math.max(mul,lmul);
            System.out.println(value);


    }
}
