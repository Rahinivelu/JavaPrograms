package CheatSheet;

public class indexesOfSubArraySum79 {
    public static void main(String[] args){
        int arr[]={1,2,3,7,5};
        //int arr[]={5,3,4};
        int target=12;
        int sum=0;
        boolean flag=false;
        int first=0,last=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==target){
                    first=i+1;
                    last=j+1;
                    flag=true;
                    break;
                }
            }
            if(flag==true){

                break;
            }


        }
        if(flag==true){
            System.out.println(first+"  "+last);
        }else{
            System.out.println(-1);
        }
    }
}
