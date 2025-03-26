package CheatSheet;

public class pangramChecking51 {
    public static void main(String[] args){
       // String sentence="thequickbrownfoxjumpsoverthelazydog";
        String sentence="leetcode";
         int [] letters=new int[26];


         for(int i=0;i<sentence.length();i++){
             letters[sentence.charAt(i)-'a']++;
         }
         boolean flag=true;
         for(int i=0;i<letters.length;i++){
            if(letters[i]==0)
            {
                flag=false;
                break;
            }
         }
         if(flag){
             System.out.println("YES");}
         else
                 System.out.println("NO");

    }
}
