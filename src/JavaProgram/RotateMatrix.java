package JavaProgram;

public class RotateMatrix {
   private static void rotate90(int arr[][],int r,int c){

       for(int i=0;i<c;i++){
           for(int j=i;j<r;j++){
               int temp=arr[i][j];
               arr[i][j]=arr[j][i];
               arr[j][i]=temp;
           }
       }
       System.out.println(" After array transpose :");
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               System.out.print(arr[i][j]);
           }
           System.out.println(" ");
       }


       for(int i=0;i<r;i++){
           int low=0;
           int high=r-1;
           while(low<high){
               int temp=arr[i][low];
               arr[i][low]=arr[i][high];
               arr[i][high]=temp;
               low++;
               high--;
           }
       }

//       for(int i=0;i<n;++i)
//       {
//           for(int j=0;j<n/2;++j)
//           {
//               int temp =arr[i][j];
//               arr[i][j] = arr[i][n-j-1];
//               arr[i][n-j-1]=temp;
//           }
//       }
       System.out.println(" After array reverse :");
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               System.out.print(arr[i][j]);
           }
           System.out.println(" ");
       }

   }
    public static void main(String [] args){
            int [][] a={{1,2,3},
                    {4,5,6},
                    {7,8,9}

            };
            System.out.println(" The array is :");
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++){
                    System.out.print(a[i][j]);
                }
                System.out.println(" ");
            }

            int row=a.length;
            System.out.println("The no of rows are: "+row);
            int col=a[0].length;
            System.out.println("The no of col are: "+col);
            rotate90(a,row,col);
            rotate90(a,row,col);

    }
}
