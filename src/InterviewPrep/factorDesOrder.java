package InterviewPrep;

import java.util.Scanner;

public class factorDesOrder {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int num=scan.nextInt();
        int[] arr=new int[num];

        System.out.println("Enter the numbers in an array");
        for(int i=0;i<num;i++){
            arr[i]=scan.nextInt();
        }

        int val=0;
        int arrays[]=new int[num];
        for(int i=0;i<num;i++){
            int count=0;
            for(int j=1;j<=arr[i];j++){
                if(arr[i]%j==0){
                    count++;
                }
            }
            arrays[val++]=count;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arrays[i] + " ");
        }

        for(int i=0;i<arrays.length;i++){
            int temp=0,per=0;
            for(int j=1+1;j<arrays.length;j++){
                if(arrays[i]<arrays[j] || arrays[i]==arrays[j]){
                    temp=arrays[i];
                    arrays[i]=arrays[j];
                    arrays[j]=temp;

                    per=arr[i];
                    arr[i]=arr[j];
                    arr[j]=per;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
