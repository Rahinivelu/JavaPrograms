package InterviewPrep;

public class Logic {

    public static void main(String [] args){
        int arr[]={5,7,6,1,2};
        int k=2,sum=0,value=0;

        for(int i=0;i<arr.length-k+1;i++){
            value=arr[i]+arr[i+1];
            if(sum<value)
                sum=value;

        }
        //return sum;
        System.out.println(sum);
    }
}
