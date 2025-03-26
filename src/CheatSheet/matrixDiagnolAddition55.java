package CheatSheet;

public class matrixDiagnolAddition55 {

    public static void main(String[] args){
       // int mat[][]= {{1,2,3},{4,5,6},{7,8,9}};
       // int mat[][]= {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int mat[][]={{1}};
        int score=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j || i+j==mat.length-1)
                {
                    score+=mat[i][j];
                    mat[i][j]=0;
                }
            }
        }
        System.out.println(score);
    }
}
