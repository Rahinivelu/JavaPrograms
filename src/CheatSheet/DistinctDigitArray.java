package CheatSheet;

public class DistinctDigitArray {
    private static void uniqueDigit(int [] arr)
    {
//        int arrays[]=new int[10];
//        for(int i=0;i<arr.length;i++){
//            int number=arr[i];
//            while(number!=0){
//                arrays[number%10]++;
//                number=number/10;
//            }
//        }
//
//        for(int i=0;i<arrays.length;i++){
//            if(arrays[i]>=1){
//                System.out.println(i);
//            }
//        }

        boolean[] digitSeen= new boolean[10];
        for(int number:arr){
            while(number!=0){
                int value=number%10;
                digitSeen[value]=true;
                number=number/10;
            }
        }
        for(int i=0;i<digitSeen.length;i++){
            if(digitSeen[i]==true){
                System.out.println(i);
            }
        }

    }    public static void main(String[] args){
        int [] nums={131,11,48};
        //int [] nums={111,222,555,666,777};
        uniqueDigit(nums);
    }
}
