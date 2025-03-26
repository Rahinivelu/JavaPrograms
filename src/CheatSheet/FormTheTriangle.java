package CheatSheet;

import java.util.Arrays;

public class FormTheTriangle {
    public static void main(String[] args){
        int []array={10,21,22,100,101,200,300};
        int len=array.length;

        for(int i=0;i<len-1;i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j ] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        int count=0;
        for(int i=0;i<len-2;i++){
            for(int j=i+1;j<len-1;j++){
                for(int k=j+1;k<len;k++){
                    if(array[i]+array[j]>array[k]
                            && array[i]+array[k]>array[j]
                            && array[j]+array[k]>array[i]){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
