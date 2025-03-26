package InterviewPrep;

import java.util.Scanner;

public class desendingOrderFactor {

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int num=scan.nextInt();
        int[] arr=new int[num];

        System.out.println("Enter the numbers in an array");
        for(int i=0;i<num;i++){
             arr[i]=scan.nextInt();
        }
        int temp=0;
        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
