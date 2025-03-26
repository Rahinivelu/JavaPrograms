package CheatSheet;

public class cool {

    private static void findCoolOrNo(int[] arr){

        int i=0;
        boolean result=false;
        while(i<arr.length ){
            int j=i+1;
            int sum=0,expectedSum=0;

            while(i!=j && j<arr.length){
                sum=arr[i]+arr[j];
                System.out.println("The two digit sum : " +sum);
                expectedSum=0;
                for(int k=0;k<arr.length;k++){
                    if(k!=i && k!=j){
                        expectedSum+=arr[k];
                    }
                }
                if(expectedSum==sum){
                    result=true;
                    break;
                }
                j++;
            }
            if(result==true){
                System.out.println("cool");
                break;
            }
            i++;

        }
        if(result==false)
            System.out.println("Not cool");
    }
    public static void main(String[] args){
       int number=23650;
      //  int number=1294;
        int temp=number;
        int count=0;
        while(temp!=0){
            int rem=temp%10;
            count++;
            temp/=10;
        }
        temp=number;
        System.out.println(count);
        int arr[]=new int[count];
        int i=0;
        while(temp!=0){
            int rem=temp%10;
            arr[i++]=rem;
            temp/=10;
        }

        findCoolOrNo(arr);


    }
}
