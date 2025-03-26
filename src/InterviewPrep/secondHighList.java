package InterviewPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class secondHighList {

    public static void main(String[] args){
        List<Integer> a1= Arrays.asList(1,32,454,23,21);
        Optional<Integer> value=a1.stream().distinct().sorted((a, b)-> b-a).skip(1).findFirst();
        int num=value.get();
        System.out.print(num);
    }
}
