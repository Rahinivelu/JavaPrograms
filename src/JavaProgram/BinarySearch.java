package JavaProgram;

public class BinarySearch {

    public static int search(int arr[], int target){

        int start=0;
        int last=arr.length-1;

        boolean asc = false;

         if(arr[start]<arr[last])
             asc=true;

        while(start<=last) {

            int mid = (start + last) / 2;

            if (asc) {
                if (target > arr[mid])
                    start = mid + 1;
                else if (target < arr[mid])
                    last = mid - 1;
                else
                    return mid;
            } else{
                if (target > arr[mid])
                    last = mid - 1;
                else if (target < arr[mid])
                    start = mid + 1;
                else
                    return mid;
            }
        }
        return -1;

    }
}
