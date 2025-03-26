package CheatSheet;

public class program26AllPossibleWords {
    static final String alphabet="ABCDEFGHIJKLMNOPQRSTUVXYZ";
    static int count=0;
    public static void main(String[] args){
        int []arr={1,2,2};

        findPossibleCombiation(arr);
        System.out.print(count);
    }

    private static void findPossibleCombiation(int[] arr) {
        if(arr.length==0|| arr==null ){
            System.out.print("There no such combination");
            return;
        }
        String output="";
        findComb(arr,0,output);
    }

    public static void findComb(int arr[],int index,String output){
        if(index==arr.length){
            System.out.println(output);
            count++;
            return;
        }

        int sum=0;
        for(int i=index;i<=arr.length-1;i++){
            sum=(sum*10)+arr[i];
            if(sum>0 &&sum<=26)
               findComb(arr,i+1,output+alphabet.charAt(sum-1));
        }
    }
}
