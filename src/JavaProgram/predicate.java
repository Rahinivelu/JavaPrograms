package JavaProgram;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class predicate {

    public static void main(String[ ] args){
        Predicate<Integer> p= i -> i%2==0;
        System.out.println("Predicate= "+p.test(9));

        Function<Integer,Integer> f= i -> i/2;
        System.out.println("Functional Interface= "+f.apply(98));

        Function<String,Integer> fs= i -> i.length();
        System.out.println("Functional Interface in String= "+fs.apply("Rahini"));

        Function<String,String> fs1= i -> i.toLowerCase();
        System.out.println("Functional Interface in String= "+fs1.apply("RAHINI"));

        Supplier<String> su=()-> {
        String otp="";
        for(int i=0;i<2;i++)
        { otp=otp+(int) (Math.random()*10);}
        return otp;
        };
        System.out.println(su.get());
    }
}
