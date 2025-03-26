package CheatSheet;

public class LongestCommanSubsequence {

    public static void main(String[] args){
        String  let="AGGTAB";
        String let1="GXTXAYB";

//        String  let="AGGTAB";
//        String let1="GXTGa";

//        String  let="";
//        String let1="GXTGa";

//        String  let="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String let1="ACEGIKMOQSUWY";

        String LCS="";
          int k=0;
         for(int j=0;j<let1.length();j++){
             while(k<let.length() && let.length()!=0){
                 if(let.charAt(k)==let1.charAt(j)){
                    LCS+=let1.charAt(j);
                    break;
                 }else{
                     k++;
                 }
             }if(k==let.length()){
                 k=LCS.length()-1;
             }
         }
         if(LCS.length()>0)
         System.out.print(LCS+" "+LCS.length());
         else
             System.out.println("No comman Sequence");

    }
}
