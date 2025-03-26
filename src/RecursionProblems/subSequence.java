package RecursionProblems;

import java.util.LinkedList;

public class subSequence {


    public static void main(String[] args){
        int arr[]={3,1,2};
        int len=arr.length;
        LinkedList<Integer> ds =new LinkedList<>();
        subsequence(0,ds,arr,len);
    }

    private static void subsequence(int i, LinkedList<Integer> ds, int[] arr, int len) {
        if(i==len){
            for(int k:ds)
            {
                System.out.print(k+" ");
            }
            System.out.println();
             return;
        }

        ds.add(arr[i]);
        subsequence(i+1,ds,arr,len);
        ds.removeLast();
        subsequence(i+1,ds,arr,len);
    }
}
