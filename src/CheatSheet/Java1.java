package CheatSheet;

public class Java1 {

    static void sumOfAllNumbers(int []a){
        int sum=0;
            int i=0;
            while(i<a.length){
                sum+=a[i];
                if(i==a.length-1){
                    break;
                }
                if(a[i]%2==0 && a[i+1]%2!=0 ){
                        i++;
                    }
                    i++;
            }
            System.out.println(sum);
    }
    public static void main(String[] args){
      //  int a[]={4,2,3,6};
        int arr[]={3,6,4,8,5,5};
        sumOfAllNumbers(arr);
    }
}
