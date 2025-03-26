package CheatSheet;

public class IndexOfAnExtraElement {

    public static void main(String[] args){
//        int arr1[]={2,4,6,8,9,10,12};
//        int arr2[]={2,4,6,8,10,12};

//        int arr1[]={3,5,7,8,11,13};
//        int arr2[]={3,5,7,11,13};
//
        int arr1[]={3,5};
        int arr2[]={3};

        for(int i=0;i<arr2.length;i++) {

            if (arr1[i] != arr2[i]) {
                System.out.println(arr1[i]);
                break;
            }
        }
        System.out.println(arr1[arr1.length-1]);

//                if(arr1[i]==arr2[i]){
//
//                }else if(arr1[i+1]==arr2[i]){
//                    System.out.println(arr1[i]);
//                    break;
//                }




    }
}
