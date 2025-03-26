package CheatSheet;
import java.util.*;
public class findTheNthTerm {
    static int[] printNthElement(int n)
    {
        // create an array of size (n+1)
        int arr[] = new int[n + 1];
        arr[1] = 3;
        arr[2] = 7;

        for (int i = 3; i <= n; i++) {
            // If i is odd
            if (i % 2 != 0)
                arr[i] = arr[i / 2] * 10 + 3;
            else
                arr[i] = arr[(i / 2) - 1] * 10 + 7;
        }
        return arr;
    }

    // main function
    public static void main(String[] args)
    {
        int n = 6;
int ar[]= printNthElement(n);

for(int a:ar)
    System.out.println(a);
    }
}
