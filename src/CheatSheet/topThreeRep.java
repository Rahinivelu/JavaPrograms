package CheatSheet;

public class topThreeRep {
    public static void main(String [] args){
       // int arr[]={3,4,2,3,16,3,15,16,15,15,16,2,3};
        int arr[]={2,4,3,2,3,4,5,5,3,2,2,5};
        int arrays[]=new int[101];
        for(int i=0;i<arr.length;i++){
            arrays[arr[i]]++;
        }

        int max=0;
        for(int i=0;i<arrays.length;i++){
            if(max<arrays[i]){
                max=arrays[i];
            }
        }

        System.out.println(max);
        int count=0;
        while(max>0){
            for(int i=0;i<arrays.length;i++){
                if(max==arrays[i]){
                    count++;
                    System.out.println(i);
                }
            }
            if(count==3)
                break;
            max--;
        }
    }
}
