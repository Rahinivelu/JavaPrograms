package JavaProgram;

import java.util.Arrays;


public class IntersectionOfTwoNodes {

     private static int[][] twoarray(int[][] arrays){
         //int m=arr.length/3,n=3;
         for(int i=0;i<arrays.length;i++) {
             for (int j = 0; j <arrays[i].length; j++) {
                 System.out.print(arrays[i][j]+" ");

             }
             System.out.println("\n");
         }
         return arrays;
     }

    public static void main(String[] args){

        //int arr[]={2,4,2,2,5,2};
        int arr[]={1,3,4,8,7,9,3,5,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int max = arr[arr.length-1];
        System.out.println(max+" max");
        int arrays[][]=new int[20][20];
        //int a[]=new int[1];
        int m=arr.length/3,n=3;
        int temp=0;
        //while(a)
        for(int k=0;k<arr.length;k++){
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(temp== arr.length)
                        break;
                    arrays[i][j]=arr[temp];
                   //System.out.println(+i +"  "+j+ " out "+arrays[i][j]);
                    temp++;
                }
            }
        }
        int interval=2;
       if(interval>= max) {
           for(int i=0;i<m;i++) {
               for (int j = 0; j <n; j++) {
                   System.out.print(arrays[i][j]+" ");

               }
               System.out.println("\n");
           }
           //twoarray(arrays);
       }
       else {
           while (m>=0){
               int one = arrays[m][0];
               int two = arrays[m][1];
               int three = arrays[m][2];
               if(((one - two) > interval) || ((two - three)>interval)||((three- one)>interval))
                   System.out.println("wrong");
               m--;

           }
//           for(int i=0;i<m;i++) {
//               for (int j = 0; j <n; j++) {
////                   int a=arrays[i][j];
////                   int b=arrays[i][j++];
////                   if((a-b)>interval)
////                       System.out.println("[]");
////                      break;
//               }
//
//               System.out.println("\n");
//           }
//           System.out.println("[]");
       }


    }
}
