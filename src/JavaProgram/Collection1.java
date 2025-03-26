//Java Program to Compare Elements in a Collection
package JavaProgram;
import java.util.*;

public class Collection1 {
    public static void main(String [] args) {
        List<Integer> number = new ArrayList<Integer>();
        number.add(3);
        number.add(5);
        number.add(18);
        number.add(4);
        number.add(6);
//       Collections.min(number);
//       Collections.max(number);
       System.out.println(Collections.min(number));
       System.out.println(Collections.max(number));
    }

}
