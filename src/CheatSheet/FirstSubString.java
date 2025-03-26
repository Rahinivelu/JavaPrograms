package CheatSheet;

public class FirstSubString {
    private static boolean  comparingString(String one,String two){
        int i=0,j=0;
        while(i<one.length()&& j<two.length()){

            if(one.charAt(i)==two.charAt(j)){

            System.out.println(one.charAt(i));
                j++;
            }
            i++;
        }

        return (j==two.length())?true:false;


    }
    public static void main(String[] args){
        String first="hellothisrahini";
        String second="hjiuh";
       boolean result= comparingString(first,second);
       System.out.println(result);
    }
}
