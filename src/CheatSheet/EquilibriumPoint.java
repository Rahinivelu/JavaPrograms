package CheatSheet;

public class EquilibriumPoint {

    public static void main(String[] args){
        int arr[]={1,2,2,1};

        int totalSum=0, leftSum=0;

        for(int  a: arr)
            totalSum+=a;

          for(int i=0;i<arr.length;i++){
              totalSum-=arr[i];


             leftSum+=arr[i];
              if(totalSum==leftSum)
              {
                  System.out.println( i+1);
                  break;
              }
          }
         if(totalSum!=leftSum)
             System.out.println(-1);

    }
}
