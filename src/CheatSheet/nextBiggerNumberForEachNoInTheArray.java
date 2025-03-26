package CheatSheet;

import java.util.Scanner;

public class nextBiggerNumberForEachNoInTheArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=scan.nextInt();


        int arr[]=new int[size];
        System.out.println("Enter the array elements");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }

        for(int i=0;i<size;i++){
            int count=0;
            int max=Integer.MAX_VALUE;
            for(int j=0;j<size;j++){
                if(arr[i]<arr[j]){
                    if(count==0){
                        max=arr[j];
                        count++;
                    }else{
                        if(max>arr[j])
                            max=arr[j];
                    }

                }
            }
            if(count==0){
                System.out.print(arr[i]+" -> "+" , ");
            }else
                System.out.print(arr[i]+" -> "+max+" , ");
        }

    }
}
