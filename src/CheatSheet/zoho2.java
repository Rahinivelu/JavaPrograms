package CheatSheet;

public class zoho2 {
    public static void main(String[] args){
        int arr1[]={29,6,19,25,9,14,12,1,8};
        int arr2[]={14,1,19,29,25,8,12,9};
        int sum1=0;
        int sum2=0;
        for(int i=0;i<arr1.length;i++){
            sum1+=arr1[i];
        }

        for(int i=0;i<arr2.length;i++){
            sum2+=arr2[i];
        }

       if(sum1>sum2)
           System.out.println(sum1-sum2);
       else
           System.out.println(sum2-sum1);
    }
}
