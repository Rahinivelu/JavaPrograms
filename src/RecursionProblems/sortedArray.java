package RecursionProblems;

public class sortedArray {
    static boolean sorting(int arr[],int index){
        if(index==arr.length-1)
            return true;

        return arr[index]<arr[index+1] && sorting(arr,index+1);
    }
    public static void main(String[] args){
        int arr[]={1,2,4,8,9,12};
        System.out.print(sorting(arr,0));
    }
}
