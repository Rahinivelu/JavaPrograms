package CheatSheet;

public class Zoho3 {
    public static void main(String[] args){
       int arr[]={13,33,66,91};
       int child=2;
    //   int array_child[]=new int[child-1];
       int max_value=0;
       int sum1=0,sum2=0;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<arr.length;i++){
           sum1+=arr[i];
           sum2=0;
           for(int j=i+1;j<arr.length;j++){
               sum2+=arr[j];
           }
          int value=Math.abs(sum1-sum2);
           if(value<min){
               min=value;
               max_value=Math.max(sum1,sum2);
           }
       }
      // System.out.print(min);
        System.out.println(max_value);

    }
}
