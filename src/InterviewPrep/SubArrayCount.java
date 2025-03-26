package InterviewPrep;

public class SubArrayCount {

    public static void main(String[] args){
        int a[]={1,1,1};
        int k=2;
        int count=0;
        int sum;
//        if(a[0]==k){
//            count=1;
//        }
        for(int i=0;i<a.length;i++){
            sum=0;
          for(int j=i;j<a.length;j++)
          {
              sum+=a[j];
              if(sum==k)
                  count++;
          }
        }
        System.out.print(count);
    }
}
