package RecursionProblems;

public class StringPalindrome {
     static boolean recur(String value, int num, int intial){

         if(intial>=num){
             return true;
         }
          if(value.charAt(intial)!=value.charAt(num-1))
              return false;

         return recur(value,num-1,intial+1);


     }
    public static void main(String[] args){
        String value="van";
        System.out.println(recur(value,value.length(),0));
    }
}
