package JavaProgram;
//import java.util.*;

import java.util.*;
//import java.util.Collections;

public class Collection {
    public static void main(String [] args){

        String [] abc={"10","20","30","40"};
        List<String> number=new ArrayList<String>();
        number.add("50");
        //number.addAll(abc,"50");
        Collections.addAll(number,abc);
        System.out.println("The collection list"+ number);
    }
}
