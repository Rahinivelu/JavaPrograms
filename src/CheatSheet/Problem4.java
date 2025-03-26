package CheatSheet;

public class Problem4 {

    public static void main(String[] args){
         String letters="abcac";
         int len=10;
         int count=0;

//         for(char let:letters.toCharArray()){
//             if(let=='a'){
//                 count++;
//             }
//         }
         for(int i=0;i<letters.length();i++){
             if(letters.charAt(i)=='a'){
                 count++;
             }
         }

         int full_letters=len/letters.length();

         int final_letters=full_letters*count;

         int remaining_letters=len%letters.length();

         for(int j=0;j<remaining_letters;j++){
             if(letters.charAt(j)=='a'){
                 final_letters++;
             }
         }

         System.out.println(final_letters);
    }
}
