package CheatSheet;

public class SingleElementArray {

    static void binarySearch(int array[]){
        if (array.length==1){
            System.out.println(array[0]);
        }
        int end=array.length-1,s=0;
        if(array[0]!=array[1]){
            System.out.println(array[0]);
        }
        if(array[end]!=array[end-1]){
            System.out.println(array[end]);
        }
         s++;
        end--;
        while(s<=end) {

            int mid = s + (end - 1) / 2;

            if (array[mid] != array[mid - 1] && array[mid] != array[mid + 1]){
                System.out.println(array[mid]);
                break;
            }


            if((mid%2==1 && array[mid]==array[mid-1])||
                    (mid%2==0 && array[mid]==array[mid+1])){
                s=mid+1;
            }else{
                end=mid-1;
            }

        }
    }
    public static void main(String[] args){
        int array[]={1,1,2,2,3,4,4,5,5};

        binarySearch(array);
    }
}
