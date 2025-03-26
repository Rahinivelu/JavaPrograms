package CheatSheet;

public class Matrix90deg {
    public static void rotate90(int arr[][],int row,int col){
        for(int i=0;i<col;i++){
            for(int j=i+1;j<row;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
         System.out.println(" Transpose the matrix");

        for(int i=0;i<row;i++){
            int low=0;
            int high=arr[i].length-1;
            while (low<high){
                int temp=arr[i][low];
                arr[i][low]=arr[i][high];
                arr[i][high]=temp;
                low++;
                high--;
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        int arr[][]={{1,2,5},{3,4,7},{9,4,8}};

        int row=arr.length;
        int col=arr[0].length;
        rotate90(arr, row,col);
    }
}
