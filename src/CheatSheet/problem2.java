package CheatSheet;

import java.util.*;

public class problem2 {

    public static void main(String[] args){
        int array[]={10,20,20,10,10,30,50,10,20};
//
//        Arrays.sort(array);
//        int count=0;
//        for(int i=0;i<array.length-2;i=i+2){
//            if(array[i]==array[i+1]){
//                count++;
//            }
//        }
//        System.out.println(count);

        Map<Integer,Integer> box=new HashMap<>();
        int count=0;
        for(int i=0;i<array.length;i++){

            if(box.containsKey(array[i])){
                box.put(array[i],box.get(array[i])+1);
                if(box.get(array[i])>=2){
                    box.put(array[i],box.get(array[i])-2);
                    count++;
                }
            }else{box.put(array[i],1);
            }
        }

        System.out.println(count);
    }
}
