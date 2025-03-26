package CheatSheet;

public class UnionArrays67 {

    public static void main(String[] args){
        int a[]={1,2,3,4,5};
        int b[]={1,2,3};

        int unionCount=findUnionCount(a,b);
        System.out.println(unionCount);
    }

    private static int findUnionCount(int[] a, int[] b) {

        int unionArray[]=new int[a.length+b.length];
        int index=0;

        for(int i=0;i<a.length;i++){
            if(!isPresent(unionArray,index,a[i])){
                unionArray[index++]=a[i];
            }
        }

        for(int j=0;j<b.length;j++){
            if(!isPresent(unionArray,index,b[j])){
                unionArray[index++]=b[j];
            }
        }

        return index;

    }

    private static boolean isPresent(int[] unionArray, int index, int ele) {

        for(int i=0;i<index;i++){
            if(ele==unionArray[i]){
                return true;
            }
        }
        return false;
    }
}
