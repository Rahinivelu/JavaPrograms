package CheatSheet;


public class ArrayRearrangement {
    public static void main(String[] args){
       int []arr={4,6,19,8,11,-1,-3};
       // int []arr={-16,25,1,6};
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]<arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
     }

    int left=0,right=arr.length-1;
    System.out.print('[');
    while(left<right){
        System.out.print(arr[left]);
        System.out.print(',');
        System.out.print(arr[right]);
        System.out.print(',');
        left++;
        right--;
    }

    if(left==right){
        System.out.print(arr[left]);
    }else{
        System.out.print("\b\b");
    }
        System.out.print(']');

    }
}
