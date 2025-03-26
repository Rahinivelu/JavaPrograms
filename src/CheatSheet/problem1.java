package CheatSheet;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.StreamSupport;

public class problem1 {

    public static void main(String[] args){
        int arr[]={7,1,3,4};
        int target=6;

        int min=Integer.MAX_VALUE;

        Map<Integer,Integer> box=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(box.containsKey(arr[i])){
                int  min_index=i-box.get(arr[i]);
                 if(min_index<min)
                     min=min_index;

            }else{
                box.put(arr[i],i);
            }
        }

        int result= min==Integer.MAX_VALUE?-1:min;
        System.out.println(result);

    }
}
