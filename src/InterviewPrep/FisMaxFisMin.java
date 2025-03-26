package InterviewPrep;

public class FisMaxFisMin {
    public static void main(String[] args){
        int array[]={1,2,7,6,5,4,3};
        int temp=0;
        for(int i=0;i< array.length-1;i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }


        System.out.println("Sorted array");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        int array1[]=new int[array.length];
        int low=0;int high=array.length-1;
        boolean flag=true;
        for(int i=0;i<array.length;i++){
            if(flag)
                array1[i]=array[high--];
            else
                array1[i]=array[low++];

            flag=!flag;
        }
        System.out.println("The final Array");
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
        }
    }
}
