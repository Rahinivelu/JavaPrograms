package JavaProgram;

public class digitCount {
     static int count(int value){
         int count=1;
         while(value>10){
             value=value/10;
             count++;
         }
         return count;
     }
    public static void main(String[] args){
        int number=1234567890;
        System.out.println(count(number));
    }
}
