package CheatSheet;

public class ArrayofIntegersAndRemoveDup {
    public static void removeTheDuplicates(int [] arr){
        boolean []track=new boolean[arr.length];

         for(int i=0;i<arr.length;i++){
             if(!track[i]){
                int   count=1;
                 for(int j=i+1;j< arr.length;j++){
                     if(arr[i]==arr[j]) {
                         track[i] = true;
                         count++;
                     }
                 }
                 if(count>1)
                      System.out.println(arr[i]+" no of duplicates "+ count);

             }
         }
    }
    public static void main(String[] args){
        int arr[]={1,2,3,1,2,4};

        removeTheDuplicates(arr);
    }



















































//    private static void RemoveDup(int[] array){
//        int []arr=new int[10];
//        for(int i=0;i<array.length;i++){
//            arr[array[i]]++;
//        }
//        boolean result=false;
//        for (int j=0;j<arr.length;j++)
//        {
//            if(arr[j]>1){
//                result=true;
//                System.out.println("Element: "+ j + "  Number of Duplicates: "+ (arr[j]-1));
//            }
//        }
//
//        if(result==false)
//            System.out.println("No Duplicates");
//    }
//    public static void main(String[] args){
//      //  int[] array={1,2,3,1,2,4};
//        //int[] array={4,5,7,7,7,2,5};
//        int[] array={2,3,4,6};
//        RemoveDup(array);
//    }
}
