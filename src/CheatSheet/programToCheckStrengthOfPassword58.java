package CheatSheet;

public class programToCheckStrengthOfPassword58 {
    public static boolean checkLowerCase(String word){
        for(int i=0;i<word.length();i++){
            char letter=word.charAt(i);
            if(letter>='a' && letter<='z'){
                return true;
            }
        }
        return false;
    }

    public static boolean checkUpperCase(String word){
        for(int i=0;i<word.length();i++){
            char letter=word.charAt(i);
            if(letter>='A' && letter<='Z'){
                return true;
            }
        }
        return false;
        }
       public static boolean checkspecial(char[]arr,String word){
        for(int i=0;i<word.length();i++){
            for(int j=0;j<arr.length;j++){
                if(word.charAt(i)==arr[j]){
                    return true;
                }
            }
        }
        return false;
        }

        public static boolean checkDigit(String word){
            for(int i=0;i<word.length();i++){
                char letter=word.charAt(i);
                if(letter>='0' && letter<='9'){
                    return true;
                }
            }
            return false;
        }
    public static void main(String[] args){
        //String password="GeekforGeeks!@12";
        String password="gfG!@12";
         char []arr= {'!','@','#','$','%','^','&','*','(',')','-','+'};
        boolean lowerCase=checkLowerCase(password);
        boolean upperCase=checkUpperCase(password);
        boolean specialChar=checkspecial(arr,password);
        boolean digit=checkDigit(password);
        int length=password.length();

       if(lowerCase&& upperCase&&specialChar&&digit&& length>=8){
           System.out.println("Strong Password");
       }else if(lowerCase&& upperCase&&specialChar&& length>=6){
           System.out.println("Moderate Password");
       }else{
           System.out.println("Week Password ");
       }
    }
}
